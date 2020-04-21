package com.kgisl.task.repository;

import java.io.Serializable;

import com.kgisl.task.entity.Resources;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TeamRepository
 */
public interface ResRepo extends JpaRepository<Resources, Serializable> {

    
}
