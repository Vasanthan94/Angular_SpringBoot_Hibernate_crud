package spring.hiber.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.hiber.entity.UserEntity;

@Repository
public class UserDaoImpl implements UserDao 
{

	@Autowired
	private EntityManager em;
	
	@Override
	public String save(UserEntity user)
	{
		Session session = em.unwrap(Session.class);
		session.save(user);
		System.out.println("Saved Successfully");
		return "Saved Successfully";
	}

	@Override
	public String delete(String email)
	{
		Session session = em.unwrap(Session.class);
		UserEntity obj = session.get(UserEntity.class, email);
		session.delete(email);
		System.out.println("Deleted Successfully" + obj);
		return "Deleted";
	}

	@Override
	public List<UserEntity> get(String email) 
	{	
		Session session = em.unwrap(Session.class);
		Query<UserEntity> query = session.createQuery("from UserEntity",UserEntity.class);
		List<UserEntity> list = query.getResultList();		
		for(Object obj : list)
		{
			System.out.println(obj);
		}	
		return list;
	}

	@Override
	public String update() {
		return null;
	}
}
