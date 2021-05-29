package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entites.concrate.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	@Query("From JobAdvertisement where employer_id=:employerId and isActive=:isActive")
	List<JobAdvertisement> getByEmployerIdAndIsActive(int employerId, Boolean isActive);
	
	
		
}
