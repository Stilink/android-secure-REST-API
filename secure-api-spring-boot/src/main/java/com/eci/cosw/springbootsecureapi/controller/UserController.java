package com.eci.cosw.springbootsecureapi.controller;


import com.eci.cosw.springbootsecureapi.model.User;
import com.eci.cosw.springbootsecureapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "api" )
public class UserController
{

    private final UserService userService;

    @Autowired
    public UserController( UserService userService )
    {
        this.userService = userService;
    }

    @CrossOrigin( origins = "http://localhost:3000" )
    @RequestMapping( value = "/user", method = RequestMethod.GET )
    public List<User> getUsers()
    {
        return userService.getUsers();
    }

    @CrossOrigin( origins = "http://localhost:3000" )
    @RequestMapping( value = "/user/admin", method = RequestMethod.POST )
    public User createUser( @RequestBody User user )
    {
        return userService.createUser( user );
    }
}
