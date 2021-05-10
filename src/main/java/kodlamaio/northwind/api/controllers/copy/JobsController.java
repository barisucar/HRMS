package kodlamaio.northwind.api.controllers.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.JobService;
import kodlamaio.northwind.entites.concrate.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

	private final JobService jobService;
	
	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService=jobService;
	}
	
	@GetMapping("/getall")
	public List<Job> getAll(){
		
		return this.jobService.getAll();
	}
	
}
