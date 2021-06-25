package kodlamaio.northwind.bussiness.concrates;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.bussiness.abstracts.SystemPersonelService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.ErrorResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.core.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.SystemPersonelDao;
import kodlamaio.northwind.entites.concrate.SystemPersonel;

@Service
public class SystemPersonelManager implements SystemPersonelService {

	private SystemPersonelDao systemPersonelDao;
	
	public SystemPersonelManager(SystemPersonelDao systemPersonelDao) {
		super();
		this.systemPersonelDao = systemPersonelDao;

	}

	@Override
	public DataResult<List<SystemPersonel>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(SystemPersonel systemPersonel) {
		this.systemPersonelDao.save(systemPersonel);
		return new SuccessResult("guncellendi");
		
	//	SystemPersonel personel = this.systemPersonelDao.getOne(systemPersonel.getId());
	//	if (personel != null) {
	//		personel.setFirstName(personel.getFirstName());
	//		personel.setLastName(personel.getLastName());
	//		personel.setEmail(personel.getEmail());
	//		personel.setPassword(personel.getPassword());
	//		personel.setDepartmentId(personel.getDepartmentId());
	//		this.systemPersonelDao.save(personel);
	//		return new SuccessResult("guncelleme basarili");
	//	}
	//	return new ErrorResult("guncelleme basarisiz");
	}

	

	@Override
	public Result add(SystemPersonel systemPersonel) {
		this.systemPersonelDao.save(systemPersonel);
		return new SuccessResult("Personel eklendi");
	}

}
