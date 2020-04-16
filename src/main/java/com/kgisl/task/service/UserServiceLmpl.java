package com.kgisl.task.service;

import java.util.List;

import javax.transaction.Transactional;

import com.kgisl.task.entity.User;
import com.kgisl.task.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

@Service
@Transactional
public class UserServiceLmpl implements UserService{
    int tab=0;
    int log=0;
    User user = new User();
    @Autowired
    UserRepo userrepo;

    public List<User> getUser() {
        return userrepo.findAll();
    }

    public User findByUserId(Long id) {
        return userrepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found"));
    }

  
    public void deleteUserById(Long id) {
        userrepo.deleteById(id);
    }

    @Override
    public User updateUser(Long id, User user) {
        User t = userrepo.getOne(id);
        t.setUsername(user.getUsername());
t.setUsermailid(user.getUsermailid());
        return userrepo.save(t);
    }



@Override
public User createUser(User user) {
    String use=user.getUsermailid();
    boolean isExists = userrepo.existsByUsermailid(use);

    if (!isExists) {
        user.setUsername(user.getUsername());
                user.setUsermailid(user.getUsermailid());
                user.setPassword(user.getPassword());
                return userrepo.save(user);
        }
    return null;
    }

    @Override
      public int Userlogin(String user,String password) {
       
        boolean isExists = userrepo.existsByUsernameAndPassword(user,password);
        if (!isExists) {
           log=0;
            }
            else{
                log=1; 
            }
       
        return log;
    }

 
}
