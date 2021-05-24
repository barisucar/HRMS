package kodlamaio.northwind.bussiness.abstracts;

import java.util.List;

import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.JobSeeker;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);

}
