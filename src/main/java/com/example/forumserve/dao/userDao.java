package com.example.forumserve.dao;

import com.example.forumserve.mybatis.entity.user;

import java.util.List;

public interface userDao {
    public List<user> seleAll();//获取全部用户信息
    public List<user> getUser(user da);//用用户名获取用户信息\模糊查询

}
