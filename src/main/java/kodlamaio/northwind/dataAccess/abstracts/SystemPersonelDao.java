package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entites.concrate.SystemPersonel;

public interface SystemPersonelDao extends JpaRepository<SystemPersonel, Integer>{

}
