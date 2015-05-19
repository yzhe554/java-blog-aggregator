package yu.springmaven.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yu.springmaven.jba.entity.User;
import yu.springmaven.jba.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findOne(int id) {
		return userRepository.findOne(id);
	}
	
}
