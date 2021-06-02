package kodlamaio.northwind.bussiness.abstracts;

import java.util.List;

import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.Resume;

public interface ResumeService {

	Result add(Resume resume);
	
	DataResult<List<Resume>> getAll();
	
}
