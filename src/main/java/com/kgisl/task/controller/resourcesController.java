package com.kgisl.task.controller;

import java.util.List;

import com.kgisl.task.entity.Resources;

import com.kgisl.task.service.ResourcesService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@RestController
@RequestMapping("/res")



public class resourcesController {


    @Autowired
    ResourcesService resourcesservice;



    @GetMapping("/")
    public @ResponseBody ResponseEntity<List<Resources>> all() {
        return new ResponseEntity<>(resourcesservice.getRes(), HttpStatus.OK);
    }

    
    @PostMapping(value = "/", headers = "Accept=application/json")
    public ResponseEntity<Resources> createTeam(@RequestBody Resources res) {
        Resources respost=resourcesservice.createres(res);
        HttpHeaders headers = new HttpHeaders();
        
        return new ResponseEntity<>(respost,headers, HttpStatus.CREATED);
    }

}
