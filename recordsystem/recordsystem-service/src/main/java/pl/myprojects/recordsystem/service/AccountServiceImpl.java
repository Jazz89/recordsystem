package pl.myprojects.recordsystem.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.myprojects.recordsystem.entities.Account;
import pl.myprojects.recordsystem.repositories.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account findByUsername(String username) {
		Account account = accountRepository.findByUsername(username);
		return account;
	}
	
	public Collection<Account> findAll(){
		return accountRepository.findAll();
	}

}
