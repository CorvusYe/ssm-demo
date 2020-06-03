package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.entity.UserEntity;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * 用户服务实现类
 *
 * @author Wwwwei
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public Integer createUser(UserEntity userEntity) {
        userEntity.setId(UUID.randomUUID().toString());
        return userDao.insert(userEntity);
    }

    public Integer updateUser(UserEntity userEntity) {
        return userDao.update(userEntity);
    }

    public Integer deleteUser(Integer id) {
        return userDao.delete(id);
    }

    public UserEntity getUserById(Integer id) {
        return userDao.selectById(id);
    }

    public List<UserEntity> getUsers() {
        return userDao.selectAll();
    }
}
