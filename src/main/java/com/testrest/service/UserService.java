package com.testrest.service;

import com.testrest.model.User;

import java.util.List;


public interface UserService {

    User findById(Long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    void deleteAllUsers();

    List<User> findAllUsers();


    boolean isUserExist(User user);


}
