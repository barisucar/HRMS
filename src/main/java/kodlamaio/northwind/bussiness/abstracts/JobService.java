package kodlamaio.northwind.bussiness.abstracts;

import java.util.List;

import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.Job;

public interface JobService {
	DataResult<List<Job>> getAll();
	Result add(Job job);
}
