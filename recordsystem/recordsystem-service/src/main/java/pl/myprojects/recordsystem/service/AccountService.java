package pl.myprojects.recordsystem.service;

import java.util.Collection;

import pl.myprojects.recordsystem.entities.Account;

public interface AccountService {
	Account findByUsername(String username);

	Collection<Account> findAll();
}
