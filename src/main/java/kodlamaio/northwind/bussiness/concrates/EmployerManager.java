package kodlamaio.northwind.bussiness.concrates;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.bussiness.abstracts.EmployersService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.core.result.SuccessDataResult;
import kodlamaio.northwind.core.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.EmployersDao;
import kodlamaio.northwind.entites.concrate.Employer;

@Service
public class EmployerManager implements EmployersService {

	private EmployersDao employersDao;

	public EmployerManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>
		(this.employersDao.findAll(), "Data listlendi.");
	}

	@Override
	public Result add(Employer employer) {
		this.employersDao.save(employer);
		return new SuccessResult("İş veren eklendi");
	}

}
