package com.jpms.service;


import com.jpms.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userdao;

    public String validateUser(String username) {
        //validate if user is authorized
        return userdao.getUserRole(username);


    }
}