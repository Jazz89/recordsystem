package pl.myprojects.recordsystem.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.myprojects.recordsystem.entities.User;
import pl.myprojects.recordsystem.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User create(User entity){
		return userRepository.save(entity);
	}
	
	@Override
	public Collection<User> findAll(){
		Collection<User> entityCollection = userRepository.findAll();
		return entityCollection;
	}
	
	@Override
	public User findOne(Integer id){
		User entity = userRepository.findOne(id);
		return entity;
	}
	
	@Override
	public User update(User entity){
		User user = findOne(entity.getId());
		if(user == null)
			return null;
		User updatedUser = userRepository.save(user);
		return updatedUser;
	}
	
	@Override
	public void delete(Integer id){
		userRepository.delete(id);
	}
	
}
