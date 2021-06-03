package kodlamaio.northwind.bussiness.concrates;

import java.time.LocalDate;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.northwind.bussiness.abstracts.PhotoService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.ErrorDataResult;
import kodlamaio.northwind.core.result.ErrorResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.core.result.SuccessDataResult;
import kodlamaio.northwind.core.result.SuccessResult;
import kodlamaio.northwind.core.utilities.helper.PhotoUploadHelper;
import kodlamaio.northwind.dataAccess.abstracts.PhotoDao;
import kodlamaio.northwind.entites.concrate.Photo;

@Service
public class PhotoManager implements PhotoService {

	PhotoUploadHelper photoUploadHelper;
	PhotoDao photoDao;

	@Autowired
	public PhotoManager(PhotoUploadHelper photoUploadHelper, PhotoDao photoDao) {
		super();
		this.photoUploadHelper = photoUploadHelper;
		this.photoDao = photoDao;
	}

	@Override
	public Result add(Photo photo) {
		if (this.photoDao.save(photo) != null) {
			return new SuccessResult();
		}
		return new ErrorResult();
	}

	@Override
	public DataResult<Photo> upload(MultipartFile photo) {
		DataResult<Map<String, String>> result = this.photoUploadHelper.upload(photo);
		
		if (result.isSuccess()) {
			Photo photo2 = new Photo();
			photo2.setCreatedDate(LocalDate.now());
			photo2.setImage(result.getData().get("url"));
			photo2.setTittle(result.getData().get("public_id"));
			Result addingResult = this.add(photo2);
			if(addingResult.isSuccess()) {
				return new SuccessDataResult<Photo>(photo2);
			}
		}
		return new ErrorDataResult<Photo>(null,"Dosya yuklenemedi");
	}

}
