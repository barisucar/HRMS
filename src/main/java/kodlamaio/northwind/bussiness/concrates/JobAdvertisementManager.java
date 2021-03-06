package kodlamaio.northwind.bussiness.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.bussiness.abstracts.JobAdvertisementService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.ErrorResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.core.result.SuccessDataResult;
import kodlamaio.northwind.core.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.northwind.entites.concrate.JobAdvertisement;


@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;

	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {

		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(), "Butun is ilanlari listelendi.");
	
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByDateDesc() {
		Sort sort = Sort.by(Sort.Direction.DESC, "creationDate");
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(sort));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByDateAsc() {
		Sort sort = Sort.by(Sort.Direction.ASC, "creationDate");
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(sort));
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilani eklendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployer_EmployerIdAndIsActive(int employerId, Boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByEmployerIdAndIsActive(employerId, isActive),"Data Listelendi");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		JobAdvertisement updatedJobAdvertisement = this.jobAdvertisementDao.getOne(jobAdvertisement.getJobAdvertisementId());
		this.jobAdvertisementDao.delete(updatedJobAdvertisement);
		
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Guncellendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive(Boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActive(isActive),"Data Listelendi");
	}

	@Override
	public Result confirmJobAdvertisement(int id) {
		// TODO Auto-generated method stub
		if(this.jobAdvertisementDao.existsById(id)) {
			JobAdvertisement ad = this.jobAdvertisementDao.getOne(id);
			
			ad.setIsConfirmed(true);
			jobAdvertisementDao.save(ad);
			return new SuccessResult("Basarili");
		}
		return new ErrorResult("Ilan bulunamadi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllConfirmedJobAdvertisements() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllConfirmedJobAdvertisements(),"Datalar listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByCityId(int cityId) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByCityId(cityId),"Data Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByWorkHourTypeId(int workHourTypeId) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByJobWorkHourTypeId(workHourTypeId),"Data Listelendi");
	}


	






}
