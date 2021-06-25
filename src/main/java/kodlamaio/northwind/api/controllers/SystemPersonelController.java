package kodlamaio.northwind.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.SystemPersonelService;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.SystemPersonel;

@RestController
@RequestMapping("/api/SystemPersonel")
@CrossOrigin
public class SystemPersonelController {

	private final SystemPersonelService systemPersonelService;

	public SystemPersonelController(SystemPersonelService systemPersonelService) {
		super();
		this.systemPersonelService = systemPersonelService;
	}
	
	@PostMapping("/add")
	public Result add(SystemPersonel systemPersonel) {
		return this.systemPersonelService.add(systemPersonel);
	}
	
	@PostMapping("/update")
	public Result update(SystemPersonel systemPersonel) {
		return this.systemPersonelService.update(systemPersonel);
	}
	
	//@PostMapping("/UpdatePersonel")
	//public ResponseEntity<?> update(@RequestParam SystemPersonel systemPersonel){
	//	return ResponseEntity.ok(this.systemPersonelService.update(systemPersonel));
	//}
}
