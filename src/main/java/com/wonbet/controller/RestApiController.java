package com.wonbet.controller;

import com.wonbet.DAO.UserDAO;
import com.wonbet.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestApiController {
    public static final Logger LOGGER = LoggerFactory.getLogger(RestApiController.class);

    @Autowired
    UserDAO userDAO;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers(){
        List<User> users = userDAO.getAllUsers();

        if(users == null || users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<User>>(users,HttpStatus.OK);
    }


}
