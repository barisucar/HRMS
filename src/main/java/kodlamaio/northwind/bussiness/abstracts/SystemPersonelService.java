package kodlamaio.northwind.bussiness.abstracts;

import java.util.List;

import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.entites.concrate.SystemPersonel;

public interface SystemPersonelService {

	
	DataResult<List<SystemPersonel>> getAll();
	
	Result update(SystemPersonel systemPersonel);
	
	Result add(SystemPersonel systemPersonel);
}
