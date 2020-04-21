package com.kgisl.task.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.task.entity.Resources;
import com.kgisl.task.repository.ResRepo;

@Service
@Transactional
public class ResourcesServiceImpl implements ResourcesService {


    @Autowired
    ResRepo resrepo;



    Resources resources = new Resources();


    @Override
    

    public List<Resources> getRes() {
      return resrepo.findAll();
    }

	@Override
	public Resources createres(Resources res) {
	
              

                resources.setName(res.getName());
                resources.setType(res.getType());
                resources.setUrl(res.getUrl());
                resources.setTech(res.getTech());


                 return resrepo.save(resources);
	}
        
    }

