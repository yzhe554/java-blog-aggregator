package yu.springmaven.jba.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class LogoutController {
	
	@RequestMapping("/logout")
	public String logout() {
		return "index";
	}

}
