package kodlamaio.northwind.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entites.concrate.Photo;

public interface PhotoDao extends JpaRepository<Photo, Integer>{

		
}
