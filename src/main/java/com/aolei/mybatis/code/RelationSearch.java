package com.aolei.mybatis.code;


import com.aolei.mybatis.entity.Classes;
import com.aolei.mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * Created by Administrator on 2017/1/5.
 */
public class RelationSearch {
    @Test
    public void testGetClass(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String statement = "com.aolei.mybatis.mapping.classMapper.getClass";
        Classes classes = sqlSession.selectOne(statement,1);
        sqlSession.close();
        System.out.println(classes);
    }
}
