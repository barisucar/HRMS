package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entites.concrate.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}
