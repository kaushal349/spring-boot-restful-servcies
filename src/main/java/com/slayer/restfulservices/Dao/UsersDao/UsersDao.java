package com.slayer.restfulservices.Dao.UsersDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.slayer.restfulservices.Models.User;

import org.springframework.stereotype.Component;

@Component
public class UsersDao {

    private static List<User> users = new ArrayList<User>();
    private static Integer userCount = 4;
    static {
        users.add(new User(1, "John", 42, new Date()));
        users.add(new User(2, "Michael", 32, new Date()));
        users.add(new User(3, "Haris", 23, new Date()));
    }

    // save user
    public void save(User user) {
        if (user.getId() == null) {
            user.setId(userCount++);
        }
        users.add(user);
    }

    // get all users
    public List<User> getAllUsers() {
        return users;
    }

    // get user by user id....
    public User getUser(Integer id) {
        for (User user : users) {
            if (id == user.getId())
                return user;
        }
        return null;
    }

}
