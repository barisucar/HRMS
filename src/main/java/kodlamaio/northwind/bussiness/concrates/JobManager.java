package kodlamaio.northwind.bussiness.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.bussiness.abstracts.JobService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.core.result.SuccessDataResult;
import kodlamaio.northwind.core.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.JobDao;
import kodlamaio.northwind.entites.concrate.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobDao;

	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>
		(this.jobDao.findAll(), "Data listelendi.");
	}

	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("İş eklendi.");
	}

}
