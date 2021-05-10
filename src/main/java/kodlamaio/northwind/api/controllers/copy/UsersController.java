package kodlamaio.northwind.api.controllers.copy;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.UserService;
import kodlamaio.northwind.entites.concrate.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UserService userService;

	public UsersController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/getall")
	public List<User> getAll() {
		return this.userService.getAll();
	}
}
