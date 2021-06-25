package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entites.concrate.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	@Query("From JobAdvertisement where employer_id=:employerId and isActive=:isActive")
	List<JobAdvertisement> getByEmployerIdAndIsActive(int employerId, Boolean isActive);
	
	@Query("From JobAdvertisement where isActive=:isActive")
	List<JobAdvertisement> getByIsActive(Boolean isActive);
	
	@Query("From JobAdvertisement where isConfirmed=true")
	List<JobAdvertisement> getConfirmedJobAdvertisements();
	
	@Query("From JobAdvertisement where isConfirmed=true")
	List<JobAdvertisement> getAllConfirmedJobAdvertisements();
	
	List<JobAdvertisement> getOneByJobAdvertisementId(int id);
	
	@Query("From JobAdvertisement where city_id=:cityId")
	List<JobAdvertisement> getByCityId(int cityId);
	
	@Query("From JobAdvertisement where job_work_hour_type_id=:jobWorkHourTypeId")
	List<JobAdvertisement> getByJobWorkHourTypeId(int jobWorkHourTypeId);
		
}
