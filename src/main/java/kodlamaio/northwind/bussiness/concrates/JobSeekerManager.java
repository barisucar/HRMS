package kodlamaio.northwind.bussiness.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.bussiness.abstracts.JobSeekerService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.core.result.SuccessDataResult;
import kodlamaio.northwind.core.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.northwind.entites.concrate.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekersDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekersDao jobSeekersDao) {
		super();
		this.jobSeekerDao = jobSeekersDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll(), "Data listelendi.");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Is arayan eklendi.");
	}

}
