package spring.hiber.dao;

import java.util.List;

import spring.hiber.entity.UserEntity;

public interface UserDao 
{
	public String save(UserEntity user);
	
	public String delete(String email);
	
	public List<UserEntity> get(String email);
	
	public String update();
}
