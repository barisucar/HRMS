package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entites.concrate.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer>{
	
	

}
