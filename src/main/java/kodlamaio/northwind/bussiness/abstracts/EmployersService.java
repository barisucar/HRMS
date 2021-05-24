package kodlamaio.northwind.bussiness.abstracts;

import java.util.List;


import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.Employer;


public interface EmployersService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
	
}
