package com.aolei.mybatis.code;

import com.aolei.mybatis.entity.User;
import com.aolei.mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Created by Administrator on 2017/1/5.
 */
public class CURDByUserMapper {
    public static String str = "com.aolei.mybatis.mapping.userMapper.";
    @Test
    public void getUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        String statement = str+"getUser";
        User user = sqlSession.selectOne(statement,1);
        sqlSession.close();
        System.out.println(user.toString());
    }
    @Test
    public void getAllUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        String statment = str+"getAllUser";
        List<User> userList = sqlSession.selectList(statment);
        sqlSession.close();
        for (User user:userList) {
            System.out.println(user.toString());
        }
    }
    @Test
    public void addUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        String statment = str + "addUser";
        User user = new User();
        user.setName("张朝伟");
        user.setDept("技术部");
        user.setPhone("13758585858");
        user.setWebsite("http://www.tencent.com");
        sqlSession.insert(statment,user);
        sqlSession.close();
    }
    @Test
    public void delectUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        String statment = str + "deleteUser";
        sqlSession.delete(statment,2);
        sqlSession.close();
    }
    @Test
    public void updateUserNameByUserId(){
        SqlSession sqlSession =  MyBatisUtil.getSqlSession(true);
        String statment = str+"updateUserNameByName";
        User user = new User();
        user.setName("傻逼1");
        sqlSession.update(statment,user);
        sqlSession.close();
    }
}
