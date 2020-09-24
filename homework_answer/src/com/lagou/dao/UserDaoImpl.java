package com.lagou.dao;

import com.lagou.domain.User;
import com.lagou.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    /*
        用户登陆方法
     */
    @Override
    public User login(String username, String password) throws SQLException {

        QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select * from user where username = ? and password = ?";
        Object[] param = {username,password};
        User user = queryRunner.query(sql, new BeanHandler<>(User.class), param);
        return user;
    }

    /*
        用户添加方法
     */
    @Override
    public void addUser(User user) throws SQLException {

        QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
        String sql = "insert into user(id,username,password,birthday,sex) values(?,?,?,?,?)";
        Object[] param = {null,user.getName(),user.getPassword(),user.getBirthday(),user.getSex()};
        queryRunner.update(sql, param);
    }

    @Override
    public void addUser2(User user) throws SQLException {

    }

    @Override
    public void addUser3(User user) throws SQLException {

    }

    @Override
    public void addUser4(User user) throws SQLException {

    }
    @Override
    public void aa(User user) throws SQLException {

    }
    @Override
    public void bb(User user) throws SQLException {

    }
    @Override
    public void cc(User user) throws SQLException {

    }
    @Override
    public void dd(User user) throws SQLException {

    }
    @Override
    public void ee(User user) throws SQLException {

    }
    @Override
    public void gg(User user) throws SQLException {

    }
    @Override
    public void addUser7(User user) throws SQLException {

    }
    @Override
    public void addUser8(User user) throws SQLException {

    }
    @Override
    public void addUser9(User user) throws SQLException {

    }
    @Override
    public void test1(User user) throws SQLException {

    }
    @Override
    public void test2(User user) throws SQLException {

    }
    @Override
    public void test3(User user) throws SQLException {

    }
    @Override
    public void test4(User user) throws SQLException {

    }
    @Override
    public void test5(User user) throws SQLException {

    }
    @Override
    public void test6(User user) throws SQLException {

    }

    public void addUser2(){
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
        System.out.println(11);
    }





}
