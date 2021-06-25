package kodlamaio.northwind.bussiness.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.bussiness.abstracts.ResumeService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.core.result.SuccessDataResult;
import kodlamaio.northwind.core.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ResumeDao;
import kodlamaio.northwind.entites.concrate.Resume;

@Service
public class ResumeManager implements ResumeService {

	private ResumeDao resumeDao;

	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}

	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
	return new SuccessResult("Cv eklendi");
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll(), "Data listelendi") ;
	}

	@Override
	public Result update(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("guncellendi");
	}

}
