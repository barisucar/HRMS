package kodlamaio.northwind.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.JobAdvertisementService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.JobAdvertisement;

@RestController
@RequestMapping("/api/JobAdvertisements")
@CrossOrigin
public class JobAdvertisementController {

	private final JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;

	}

	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll() {

		return this.jobAdvertisementService.getAll();

	}

	@GetMapping("/getSortedByDateDesc")
	public DataResult<List<JobAdvertisement>> getAllSortedByDateDesc() {
		return this.jobAdvertisementService.getAllSortedByDateDesc();
	}

	@GetMapping("/getSortedByDateAsc")
	public DataResult<List<JobAdvertisement>> getAllSortedByDateAsc() {
		return this.jobAdvertisementService.getAllSortedByDateAsc();
	}

	@PostMapping("/add")
	public Result add(JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}

	@GetMapping("/getByEmployerNameAndIsActive")
	public DataResult<List<JobAdvertisement>> getByEmployerIdAndIsActive(@RequestParam int employerId,@RequestParam Boolean isActive) {
		return this.jobAdvertisementService.getByEmployer_EmployerIdAndIsActive(employerId, isActive);
	}
	
	
	@GetMapping("/getByIsActive")
	public DataResult<List<JobAdvertisement>> getByIsActive(@RequestParam Boolean isActive) {
		return this.jobAdvertisementService.getByIsActive(isActive);
	}
	
}
