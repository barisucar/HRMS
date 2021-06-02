package kodlamaio.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.JobExperianceService;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.JobExperiance;

@RestController
@RequestMapping("/api/job_experiance")
public class JobExperianceController {

	private JobExperianceService jobExperianceService;

	@Autowired
	public JobExperianceController(JobExperianceService jobExperianceService) {
		super();
		this.jobExperianceService = jobExperianceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobExperiance jobExperiance) {
		return this.jobExperianceService.add(jobExperiance);
	}
}
