package kodlamaio.northwind.core.utilities.helper;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.northwind.core.result.DataResult;

public interface PhotoUploadHelper {

		DataResult<Map<String, String>> upload(MultipartFile file);
		DataResult<Map> delete(String id) throws IOException;
		
	
}
