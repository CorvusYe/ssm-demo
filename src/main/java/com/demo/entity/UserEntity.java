package com.demo.entity;

/**
 * 用户实体类
 *
 * @author Wwwwei
 */
public class UserEntity {
    private String id; //用户id
    private String username;//用户名
    private String password;//用户密码

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
