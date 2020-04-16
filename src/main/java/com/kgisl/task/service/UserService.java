package com.kgisl.task.service;

import java.util.List;

import com.kgisl.task.entity.User;

public interface UserService {
   public User createUser(User username);
    public List<User> getUser();
    public User findByUserId(Long id);
    public User updateUser(Long id,User username);
    public void deleteUserById(Long id); 
    public int Userlogin(User username);
}