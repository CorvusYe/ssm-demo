package com.demo.service;

import com.demo.entity.UserEntity;

import java.util.List;

/**
 * 用户服务类
 *
 * @author Wwwwei
 */
public interface UserService {

    Integer createUser(UserEntity userEntity);

    Integer updateUser(UserEntity userEntity);

    Integer deleteUser(Integer id);

    UserEntity getUserById(Integer id);

    List<UserEntity> getUsers();
}
