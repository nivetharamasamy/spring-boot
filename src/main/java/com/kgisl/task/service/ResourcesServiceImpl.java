package com.kgisl.task.service;

import java.util.List;

import javax.transaction.Transactional;


import com.kgisl.task.entity.resources;
import com.kgisl.task.repository.ResRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ResourcesServiceImpl implements ResourcesService {


    @Autowired
    ResRepo resrepo;

    @Override
    

    public List<resources> getRes() {
      return resrepo.findAll();
    }
        
    }

