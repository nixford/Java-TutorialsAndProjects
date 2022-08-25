package com.javatpoint.server.main.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return service.findAll();
	}

}
