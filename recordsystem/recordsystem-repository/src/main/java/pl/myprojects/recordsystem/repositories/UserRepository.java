package pl.myprojects.recordsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.myprojects.recordsystem.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
