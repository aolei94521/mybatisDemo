package com.aolei.mybatis.code;

import com.aolei.mybatis.entity.User;
import com.aolei.mybatis.interfaces.IUser;
import com.aolei.mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2017/1/5.
 */
public class CURDByAnnotation {
    @Test
    public static void addUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        User user = new User(2,"aolei1","ssss","https://www.baidu.com","1588888888888");
        IUser user1 = sqlSession.getMapper(IUser.class);
        int result = user1.addUser(user);
        sqlSession.close();
        System.out.println(result);
    }
    @Test
    public void selectAll(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        IUser user = sqlSession.getMapper(IUser.class);
        List<User> mlist = user.selectAll();
        sqlSession.close();
        for (User user1:mlist) {
            System.out.println(user1.toString());
        }
    }
    @Test
    public void updateUser(){
        User user = new User(2,"aolei1","ssss","https://www.baidu.com","1588888888888");
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        IUser user1 = sqlSession.getMapper(IUser.class);
        int result = user1.update(user);
        sqlSession.close();
        System.out.println(result);
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        IUser user1 = sqlSession.getMapper(IUser.class);
        user1.delete(3);
        sqlSession.close();
    }
}
