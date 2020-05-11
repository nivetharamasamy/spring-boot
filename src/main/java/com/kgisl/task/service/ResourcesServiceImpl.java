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

 Resources res = new Resources();
	
    @Autowired
    ResRepo resrepo;



    @Override
        public List<Resources> getRes() {
      return resrepo.findAll();
    }

	@Override
	public Resources createres(Resources res) {
	
              

                res.setName(res.getName());
                res.setType(res.getType());
                res.setUrl(res.getUrl());
                res.setTech(res.getTech());
res.setImage(res.getImage());

                 return resrepo.save(res);
	}
        
    }

