package com.wonbet.DAO;

import com.wonbet.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    @Autowired
    private JdbcTemplate template;

    public List<User> getAllUsers(){
        return template.query("SELECT * FROM test;",new UserRowMapper()) ;
    }
    public boolean removeUser(Long id){
        return false;
    }
    public User addUser(User user){
        return null;
    }
    public User getUserById(Long id){
        return null;
    }

    private class UserRowMapper implements RowMapper<User>{

        @Override
        public User mapRow(ResultSet rs, int i) throws SQLException {
            Long id = new Long(rs.getInt("id"));
            String userName = rs.getString("name");
            String emailAddress = rs.getString("email");

            return new User(id,userName,emailAddress);
        }
    }

}
