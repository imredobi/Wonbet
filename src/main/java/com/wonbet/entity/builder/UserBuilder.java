package com.wonbet.entity.builder;

import com.wonbet.entity.User;

public class UserBuilder {
    private int id;
    private String userName;
    private String emailAddress;

    public UserBuilder withId(int id){
        this.id = id;
        return this;
    }

    public UserBuilder withUserName(String userName){
        this.userName = userName;
        return this;
    }

    public UserBuilder withEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
        return this;
    }

    public User build(){
        User user = new User(this.id,this.userName,this.emailAddress);
        return user;
    }

    public User buildUser(){
        User user = new User(1,"MockUser","user@mock.org");
        return user;
    }
}
