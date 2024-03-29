package ru.rtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rtech.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
