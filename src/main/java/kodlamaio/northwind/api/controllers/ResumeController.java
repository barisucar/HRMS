package kodlamaio.northwind.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.ResumeService;
import kodlamaio.northwind.entites.concrate.Resume;
import kodlamaio.northwind.entites.concrate.SystemPersonel;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.ErrorDataResult;
import kodlamaio.northwind.core.result.Result;

@RestController
@RequestMapping("/api/resumes")
public class ResumeController {

	private ResumeService resumeService;

	@Autowired
	public ResumeController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Resume>> getAll() {
		return this.resumeService.getAll();
	}

	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody Resume resume){
		return ResponseEntity.ok(this.resumeService.add(resume));
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)	
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String, String> validationErrors= new HashMap<String, String>();
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "Dogrulama hatalari");
		return errors;
	}
	
	
	@PostMapping("/update")
	public Result update(Resume resume) {
		return this.resumeService.update(resume);
	}

}
