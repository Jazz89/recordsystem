package pl.myprojects.recordsystem.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.myprojects.recordsystem.entities.User;
import pl.myprojects.recordsystem.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/user", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> create(@RequestBody User entity){
		User newEntity = userService.create(entity);
		return new ResponseEntity<User>(newEntity, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/user", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<User>> findAll(){
		Collection<User> users = userService.findAll();
		return new ResponseEntity<Collection<User>>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/user/{id}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> findOne(@PathVariable Integer id){
		User user = userService.findOne(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@RequestMapping(value="/user", method= RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> update(@RequestBody User entity){
		User updatedUser = userService.update(entity);
		return new ResponseEntity<User>(updatedUser,HttpStatus.OK);	
	}
	
	@RequestMapping(value="/user/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity delete(@PathVariable Integer id){
		userService.delete(id);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
}
