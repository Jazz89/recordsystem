package pl.myprojects.recordsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.myprojects.recordsystem.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	Account findByUsername(String userName);
}
