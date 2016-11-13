package pl.myprojects.recordsystem.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import pl.myprojects.recordsystem.entities.User;

public interface UserService {

	public User create(User entity);
	
	public Collection<User> findAll();
	
	public User findOne(Integer id);
	
	public User update(User entity);
	
	public void delete(Integer id);
	
}
