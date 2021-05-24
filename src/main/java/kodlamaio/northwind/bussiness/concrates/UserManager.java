package kodlamaio.northwind.bussiness.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.bussiness.abstracts.UserService;
import kodlamaio.northwind.core.result.DataResult;
import kodlamaio.northwind.core.result.Result;
import kodlamaio.northwind.core.result.SuccessDataResult;
import kodlamaio.northwind.core.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.UserDao;
import kodlamaio.northwind.entites.concrate.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>
		(this.userDao.findAll(),"Data listelendi.");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Urun eklendi.");
	}
}
