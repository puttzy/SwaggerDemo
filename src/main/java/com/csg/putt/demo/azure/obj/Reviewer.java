package com.csg.putt.demo.azure.obj;


import com.mangofactory.swagger.plugin.EnableSwagger;

/**
 * Created by Dan on 3/16/2015.
 */
@EnableSwagger
public class Reviewer {

    String user;
    String about;
    Integer userId;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
