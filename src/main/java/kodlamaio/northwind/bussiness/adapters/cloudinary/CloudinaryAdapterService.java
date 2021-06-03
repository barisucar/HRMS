package kodlamaio.northwind.bussiness.adapters.cloudinary;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.ErrorDataResult;
import kodlamaio.northwind.core.result.SuccessDataResult;
import kodlamaio.northwind.core.utilities.helper.PhotoUploadHelper;

@Service
public class CloudinaryAdapterService implements PhotoUploadHelper {

	private Cloudinary cloudinary;

	private Map<String, String> valuesMap = new HashMap<>();

	public CloudinaryAdapterService() {
		valuesMap.put("cloud_name", "your_cloud_name");
		valuesMap.put("api_key", "your_api_key");
		valuesMap.put("api_secret", "your_api_secret");

		cloudinary = new Cloudinary(valuesMap);
	}


	
	@Override
	public DataResult<Map<String, String>> upload(MultipartFile file) {
		File file2;
		try {file2 = convert(file);
		Map<String, String> result = cloudinary.uploader().upload(file2, ObjectUtils.emptyMap());
		file2.delete();
		return new SuccessDataResult<Map<String,String>>(result);
			
		} catch (IOException e) {
			e.printStackTrace();
			return new ErrorDataResult<Map<String,String>>("Dosya yuklenemedi");
		}
	}

	@Override
	public DataResult<Map> delete(String id) throws IOException {
		Map result = cloudinary.uploader().destroy(id, ObjectUtils.emptyMap());
		return new SuccessDataResult<Map>(result);
	}

	private File convert(MultipartFile multipartFile) throws IOException{
		File file = new File(multipartFile.getOriginalFilename());
		FileOutputStream stream = new FileOutputStream(file);
		stream.write(multipartFile.getBytes());
		stream.close();
		
		return file;
	}
	
}
