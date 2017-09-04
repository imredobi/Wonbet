package com.wonbet.entity.builder;

import com.wonbet.entity.User;

public class UserBuilder {
    private static Long uniqueId = 0L;
    private Long id;
    private String userName;
    private String emailAddress;

    public UserBuilder withId(Long id){
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

    public static Long getNextId(){
        return uniqueId;
    }

    public User build(){
        User user = new User(this.id,this.userName,this.emailAddress);
        return user;
    }

    public User buildNextUser(){
        User user = new User(uniqueId, "mockUser"+uniqueId, "user" + uniqueId + "@mock.org");
        uniqueId++;
        return user;
    }
}
