package com.kgisl.task.repository;

import java.io.Serializable;
import java.util.Optional;

import com.kgisl.task.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TeamRepository
 */
public interface UserRepo extends JpaRepository<User,Serializable>{

	boolean existsByUsermailid(String use);

	boolean existsByUsernameAndPassword(String name, String password);






	
    
}
    