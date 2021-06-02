package kodlamaio.northwind.bussiness.concrates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.bussiness.abstracts.LinkService;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.core.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.LinkDao;
import kodlamaio.northwind.entites.concrate.Link;

@Service
public class LinkManager  implements LinkService{

	private LinkDao linkDao;
	
	@Autowired
	public LinkManager(LinkDao linkDao) {
		super();
		this.linkDao = linkDao;
	}

	@Override
	public Result add(Link link) {
		this.linkDao.save(link);
		return new SuccessResult("Linkler eklendi");
	}

}
