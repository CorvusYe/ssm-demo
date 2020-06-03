package com.demo.dao;

import com.demo.entity.UserEntity;

import java.util.List;

/**
 * 用户Dao类
 *
 * @author Wwwwei
 */
public interface UserDao {
    /**
     * 插入用户记录
     *
     * @param userEntity
     * @return
     */
    Integer insert(UserEntity userEntity);

    /**
     * 删除用户记录
     *
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 更新用户记录
     *
     * @param userEntity
     * @return
     */
    Integer update(UserEntity userEntity);

    /**
     * 根据用户id查找用户
     *
     * @param id
     * @return
     */
    UserEntity selectById(Integer id);

    /**
     * 这里主要查询多条记录
     * @return
     */
    List<UserEntity> selectAll();
}
