package kodlamaio.northwind.bussiness.abstracts;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.Photo;

public interface PhotoService {

	Result add(Photo photo);
	DataResult<Photo> upload(MultipartFile photo);
	
}
