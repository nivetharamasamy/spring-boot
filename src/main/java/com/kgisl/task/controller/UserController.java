package com.kgisl.task.controller;

import java.util.List;

import com.kgisl.task.entity.User;
import com.kgisl.task.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


/**
* TeamController
*/

@CrossOrigin(origins = "*")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;
 
    // @Autowired
    // private ModelMapper modelMapper;
 
    @PostMapping(value = "/", headers = "Accept=application/json")
    public ResponseEntity<User> createTeam(@RequestBody User username) {
        User actualTeam=userService.createUser(username);
        HttpHeaders headers = new HttpHeaders();
        // headers.setLocation(ucBuilder.path("/{id}").buildAndExpand(team.getTeamid()).toUri());
        return new ResponseEntity<>(actualTeam,headers, HttpStatus.CREATED);
    }
 



    @GetMapping("/")
    public @ResponseBody ResponseEntity<List<User>> all() {
        return new ResponseEntity<>(userService.getUser(), HttpStatus.OK);
    }
 
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
        User User = userService.findByUserId(id);
        if (User == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(User, HttpStatus.OK);
    }
 
    @PutMapping(value = "/{id}", headers="Accept=application/json")
    public ResponseEntity<User> updateTeam(@PathVariable("id") long id,@RequestBody User username)
    {
        User team=userService.updateUser(id,username);
        return new ResponseEntity<>(team,HttpStatus.OK);
    }
 

    @DeleteMapping(value="/{id}", headers ="Accept=application/json")
    public ResponseEntity<User> deleteTeam(@PathVariable("id") Long id){
        User user = userService.findByUserId(id);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
   @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
    public int getUserlogin(@RequestParam String username,@RequestParam String password)  {
        System.out.println("happy ending");
        System.out.println(username);
        System.out.println(password);
        System.out.println("happy starting");
        int User=userService.Userlogin(username,password);
       
        return User;
    }

}
