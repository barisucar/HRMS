package kodlamaio.northwind.bussiness.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.bussiness.abstracts.JobService;
import kodlamaio.northwind.dataAccess.abstracts.JobDao;
import kodlamaio.northwind.entites.concrate.Job;

@Service
public class JobManager implements JobService{

	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao=jobDao;
	}
	
	
	
	@Override
	public List<Job> getAll() {
		return this.jobDao.findAll();
	}

}
