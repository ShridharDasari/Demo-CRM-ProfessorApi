package com.jpms.dao;


import com.jpms.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@Repository
public class UserDao {
    //dummy Data List
    public static List<User> users;
    {
        users = new ArrayList();
        users.add(new User(123, "Chitra", "student"));
        users.add(new User(321, "ProfRam", "professor"));
        users.add(new User(111, "adm", "administrator"));
    }

    public String getUserRole(String name){
        String role=null;
        for(User usr:users){
            if(usr.getName().equalsIgnoreCase("name")){
                role=usr.getRole();
            }
        }
        return role;
    }

    private void updateUserPassword(){

    }
    private String createUser(User user){
        boolean userExist=FALSE;
        String reply=null;
        for(User usr:users)    {
            if (user.getName().equalsIgnoreCase(usr.getName())) {
                userExist=TRUE;
            }
            if(!userExist){
                users.add(user);
                reply= "User with username:" + user.getName() + "Created.";
            }else{
                reply= "User with username:" + user.getName() + "Already Exists.";
            }
        }
        return reply;
    }

    private void deleteUser(User user){

        for(User usr:users)    {
            if (user.getName().equalsIgnoreCase(usr.getName())) {
                users.remove(user);
            }
        }
    }

}