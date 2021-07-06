package com.nd.pickAnimal.service;

import com.nd.pickAnimal.model.User;
import com.nd.pickAnimal.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("fakeDao")com.nd.pickAnimal.dao.UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user){
        return userDao.insertUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.selectAllPeople();
    }
}
