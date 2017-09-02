package com.wonbet.service;

import com.wonbet.entity.User;
import com.wonbet.entity.builder.UserBuilder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceMock implements UserService {

    @Override
    public List<User> findAllUsers(){
        User u1 = new UserBuilder().withId(1).withUserName("user1").withEmailAddress("user1@mock.org").build();
        User u2 = new UserBuilder().withId(2).withUserName("user2").withEmailAddress("user2@mock.org").build();
        List<User> users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);

        return users;
    }
}
