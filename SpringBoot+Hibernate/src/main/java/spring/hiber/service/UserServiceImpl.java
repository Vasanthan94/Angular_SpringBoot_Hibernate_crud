package spring.hiber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.hiber.dao.UserDao;
import spring.hiber.entity.UserEntity;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public String save(UserEntity user) 
	{
		return userDao.save(user);		
	}

	@Override
	@Transactional
	public String delete(String email) 
	{
		return userDao.delete(email);
	}

	@Override
	@Transactional
	public List<UserEntity> get(String email) 
	{
		return userDao.get(email);
	}

	@Override
	@Transactional
	public String update() 
	{
		return userDao.update();
	}
}
