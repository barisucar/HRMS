package kodlamaio.northwind.bussiness.concrates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.bussiness.abstracts.JobExperianceService;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.core.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.JobExperianceDao;
import kodlamaio.northwind.entites.concrate.JobExperiance;

@Service
public class JobExperianceManager implements JobExperianceService{

	private JobExperianceDao jobExperianceDao;
	
	@Autowired
	public JobExperianceManager(JobExperianceDao jobExperianceDao) {
		super();
		this.jobExperianceDao = jobExperianceDao;
	}

	@Override
	public Result add(JobExperiance jobExperiance) {
		this.jobExperianceDao.save(jobExperiance);
		return new SuccessResult("Is tecrubesi eklendi");
	}

}
