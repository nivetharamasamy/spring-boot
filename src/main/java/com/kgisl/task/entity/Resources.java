package com.kgisl.task.entity;



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

public class Resources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resid;
    private String name;
    private String type;
    private String url;
    private String tech;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the resid
     */
    public Long getResid() {
        return resid;
    }

    /**
     * @return the tech
     */
    public String getTech() {
        return tech;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param resid the resid to set
     */
    public void setResid(Long resid) {
        this.resid = resid;
    }

    /**
     * @param tech the tech to set
     */
    public void setTech(String tech) {
        this.tech = tech;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public Resources(Long resid, String name, String tech, String type, String url) {
        this.resid = resid;
        this.name = name;
        this.tech = tech;
        this.type = type;
        this.url = url;

    }

    public Resources() {
       
    }


}