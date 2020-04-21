package com.kgisl.task.repository;

import java.io.Serializable;

import com.kgisl.task.entity.resources;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TeamRepository
 */
public interface ResRepo extends JpaRepository<resources, Serializable> {

    
}