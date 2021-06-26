package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.UserService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.User;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UsersController {

	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/getall")
	public DataResult<List<User>> getAll() {
		return this.userService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
	}
}
