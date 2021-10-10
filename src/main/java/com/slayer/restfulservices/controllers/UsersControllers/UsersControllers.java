package com.slayer.restfulservices.controllers.UsersControllers;

import java.util.List;

import com.slayer.restfulservices.Dao.UsersDao.UsersDao;
import com.slayer.restfulservices.Models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersControllers {

    @Autowired
    UsersDao usersDao;

    @GetMapping(value = "/users")
    public List<User> retreiveAllUsers() {
        return usersDao.getAllUsers();
    }

    @GetMapping(value = "/users/{id}")
    public User retrieveUser(@PathVariable Integer id) {
        return usersDao.getUser(id);
    }

    @PostMapping(value = "/users")
    public void saveUser(@RequestBody User user) {
        usersDao.save(user);
    }
}
