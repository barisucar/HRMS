package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entites.concrate.Employer;

public interface EmployersDao extends JpaRepository<Employer, Integer>{

}
