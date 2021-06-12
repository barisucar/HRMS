package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.EmployersService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.Employer;

@RestController
@RequestMapping("/api/employers")
@CrossOrigin
public class EmployersController {
	
	private final EmployersService employersService;
	
	@Autowired
	public EmployersController(EmployersService employersService) {
		super();
		this.employersService= employersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employersService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employersService.add(employer);
	}
}
