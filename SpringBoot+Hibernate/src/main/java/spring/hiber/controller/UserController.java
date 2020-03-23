package spring.hiber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.hiber.entity.UserEntity;
import spring.hiber.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@Controller
@RequestMapping("/crud")
public class UserController
{
	@Autowired
	private UserService userService;
	
	@PutMapping(value="/save")
	public String save(UserEntity user)
	{
		userService.save(user);
		return null;
	}
	
	@PostMapping(value="/update")
	public String update()
	 {
		return null;
	}
	
	@DeleteMapping(value="/{id}")
	public String delete(@PathVariable("email") String email)	
	{
		return userService.delete(email);
	}
	
	@GetMapping(value="/get/{email}")
	public List<UserEntity> get(@PathVariable("email") String email)
	{
		List<UserEntity> list = userService.get(email);
		return list;
	}
}
