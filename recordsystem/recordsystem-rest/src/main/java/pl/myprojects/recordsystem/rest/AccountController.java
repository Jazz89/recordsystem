package pl.myprojects.recordsystem.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.myprojects.recordsystem.entities.Account;
import pl.myprojects.recordsystem.entities.User;
import pl.myprojects.recordsystem.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value = "/acc", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Account>> findAll(){
		Collection<Account> accounts = accountService.findAll();
		return new ResponseEntity<Collection<Account>>(accounts, HttpStatus.OK);
	}
	
}
