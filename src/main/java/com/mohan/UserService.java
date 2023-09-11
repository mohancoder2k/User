package com.mohan;



import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService
{
	@Autowired
	private UserRepository repo;
	
	public List<User> listAll()
	{
		return repo.findAll();
	}
	
	public void save(User us)
	{
		repo.save(us);
	}
	public User get(Long id)
	{
		return repo.findAll().get(0);
	}
	public void delete(Long id)
	{
		repo.deleteAll();
	}
}
