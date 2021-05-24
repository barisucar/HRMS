package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entites.concrate.JobSeeker;

public interface JobSeekersDao extends JpaRepository<JobSeeker, Integer>{

}
