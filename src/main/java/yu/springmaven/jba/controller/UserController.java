package yu.springmaven.jba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import yu.springmaven.jba.entity.User;
import yu.springmaven.jba.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public User construct() {
		return new User();
	}
	
	@RequestMapping("/users")
	public String users(Model model) {
		model.addAttribute("users", userService.findAll());
		return "users"; //page name that dispatch to (definition tag name in general.xml)
	}
	
	@RequestMapping("/users/{id}")
	public String details(Model model, @PathVariable int id) {
		model.addAttribute("user", userService.findOneWithBlogs(id));
		return "user-detail";
	}
	
	@RequestMapping("/register")
	public String showRegister() {
		return "user-register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String doRegister(@ModelAttribute("user") User user) {
		userService.save(user);
		return "user-register";
	}
}
