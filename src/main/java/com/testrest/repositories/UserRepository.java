package com.testrest.repositories;

import com.testrest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {


    User findByName(String name);

}
