package com.wonbet.entity;

public class User {

    private Long id;
    private String userName;
    private String emailAddress;

    public User(Long id, String userName, String emailAddress){
        this.id = id;
        this.userName = userName;
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, userName=%s, emailAddress=%s]", id, userName, emailAddress
        );
    }
}
