package com.wonbet.DAO;

import com.wonbet.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
    public boolean removeUser(Long id);
    public User addUser(User user);
    public User getUserById(Long id);
}
