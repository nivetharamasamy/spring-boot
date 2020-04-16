package com.kgisl.task.entity;

import java.util.Optional;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * Team
 */
@Entity
 @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;
private  String username;
private String usermailid;
private String password;
    


/**
 * @return the password
 */
public String getPassword() {
    return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
    this.password = password;
}

/**
 * @return the usermailid
 */
public String getUsermailid() {
    return usermailid;
}
/**
 * @return the username
 */
public String getUsername() {
    return username;
}

/**
 * @param usermailid the usermailid to set
 */
public void setUsermailid(String usermailid) {
    this.usermailid = usermailid;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
    this.username = username;
}
  /**
   * @return the userid
   */
  public Long getUserid() {
      return userid;
  }
  /**
   * @param userid the userid to set
   */
  public void setUserid(Long userid) {
      this.userid = userid;
  }
public Optional<User> findByUserId(Long id) {
	return null;
}
public User save(User existingVehicle) {
	return null;
}

public User(Long userid,String username,String usermailid) {
    this.username = username;
    this.userid=userid;
    this.usermailid=usermailid;
    
    }
    public User(){
       
    }


}