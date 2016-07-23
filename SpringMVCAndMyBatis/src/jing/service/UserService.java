package jing.service;

import java.util.List;

import jing.dao.UserDao;
import jing.entity.TUser;
import jing.entity.TUserExample;
import jing.entity.TUserExample.Criteria;
import jing.entity.User;
import jing.mapperdao.TUserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private TUserMapper tuserMapper; 
	public TUser findById(Long id){
		return tuserMapper.selectByPrimaryKey(id);
	}
	
	public List<User> findUsers() {
		return userDao.selectAll();
	}
	public TUser login(TUser tuser ){
		TUserExample example = new TUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(tuser.getUsername());
		criteria.andPwdEqualTo(tuser.getPwd());
		List<TUser> tusers =null;
		return tuserMapper.selectByPrimaryKey(Long.valueOf(1));
		/*if(tusers.size()<=0)
			return null;
		else
			return tusers.get(0);*/
	}
	
	public User findUserById(Integer userId) {
		return userDao.selectById(userId);
	}

	public void update(User user) {
		userDao.update(user);
	}

	public void remove(Integer userId) {
		userDao.delete(userId);
	}

	public void add(User user) {
		userDao.insert(user);
	}
	
	public void settuserMapper(TUserMapper tuserMapper) {
		this.tuserMapper = tuserMapper;
	}
}
