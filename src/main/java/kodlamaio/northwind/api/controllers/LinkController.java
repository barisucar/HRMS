package kodlamaio.northwind.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.LinkService;
import kodlamaio.northwind.entites.concrate.Link;

@RestController
@RequestMapping("/api/links")
public class LinkController {

	private LinkService linkService;

	@Autowired
	public LinkController(LinkService linkService) {
		super();
		this.linkService = linkService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody Link link){
		return ResponseEntity.ok(this.linkService.add(link));
	}
}
