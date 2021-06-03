package kodlamaio.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.northwind.bussiness.abstracts.PhotoService;

@RestController
@RequestMapping("/api/photos")
public class PhotosController {

	private PhotoService photoService;

	@Autowired
	public PhotosController(PhotoService photoService) {
		super();
		this.photoService = photoService;
	}
	
	@PostMapping("/photo_upload")
	public ResponseEntity<?> photoUpload(@RequestParam("photo") MultipartFile photo){
		return ResponseEntity.ok(this.photoService.upload(photo));
	}
	
}
