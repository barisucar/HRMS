package kodlamaio.northwind.bussiness.abstracts;

import java.util.List;

import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.JobAdvertisement;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getAll();

	DataResult<List<JobAdvertisement>> getAllSortedByDateDesc();

	DataResult<List<JobAdvertisement>> getAllSortedByDateAsc();

	Result add(JobAdvertisement jobAdvertisement);

	Result update(JobAdvertisement jobAdvertisement);
	
	Result confirmJobAdvertisement(int id);
	
	DataResult<List<JobAdvertisement>> getByEmployer_EmployerIdAndIsActive(int employerId, Boolean isActive);
	
	DataResult<List<JobAdvertisement>> getByIsActive( Boolean isActive);

	DataResult<List<JobAdvertisement>> getAllConfirmedJobAdvertisements();
	
	DataResult<List<JobAdvertisement>> getByCityId(int cityId);
	
	DataResult<List<JobAdvertisement>> getByWorkHourTypeId(int workHourTypeId);
}
