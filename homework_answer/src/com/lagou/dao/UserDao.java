package com.lagou.dao;

import com.lagou.domain.User;

import java.sql.SQLException;

public interface UserDao {

    /*
        用户登陆
     */
    public User login(String username,String password) throws SQLException;

    /*
        用户添加
     */
    public void addUser(User user) throws SQLException;

    /*
     用户添加
  */
    public void addUser7(User user) throws SQLException;


    /*
     用户添加
  */
    public void addUser8(User user) throws SQLException;


    /*
     用户添加
  */
    public void addUser9(User user) throws SQLException;




}
