package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.JobService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.Job;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin
public class JobsController {

	private final JobService jobService;

	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}

	@GetMapping("/getall")
	public DataResult<List<Job>> getAll() {
		return this.jobService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Job job) {
		return this.jobService.add(job);
	}

}
