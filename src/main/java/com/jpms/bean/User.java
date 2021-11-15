/**
 *
 */
package com.jpms.bean;

/**
 * @author Administrator
 *
 */



//import javax.annotation.sql.DataSourceDefinition;
import java.io.Serializable;

public class User implements Serializable {

    private Integer userId;
    private String name;
    private String role;

    public User(Integer userid, String name, String role) {
        this.userId = userid;
        this.name = name;
        this.role = role;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}