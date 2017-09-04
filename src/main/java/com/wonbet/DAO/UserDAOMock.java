package com.wonbet.DAO;

import com.wonbet.entity.User;
import com.wonbet.entity.builder.UserBuilder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Component
public class UserDAOMock implements UserDAO {

    private static Map<Long, User> database;

    static {
        database = new HashMap<Long, User>();
        database.put(UserBuilder.getNextId(), new UserBuilder().buildNextUser());
        database.put(UserBuilder.getNextId(), new UserBuilder().buildNextUser());
        database.put(UserBuilder.getNextId(), new UserBuilder().buildNextUser());
    }
    public List<User> getAllUsers(){
        return new ArrayList<User>(database.values());
    }

    public boolean removeUser(Long id){
        return database.remove(id) != null;
    }

    public User addUser(User user){
        return database.get(user.getId());
    }

    public User getUserById(Long id){
        return database.get(id);
    }
}
