package com.aolei.mybatis.interfaces;

import com.aolei.mybatis.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by Administrator on 2017/1/5.
 */
public interface IUser {
    @Insert("insert into user(name,dept,website,phone) values (name=#{name},dept=#{dept},website=#{website},phone=#{phone})")
    public int addUser(User user);
    @Select("select * from user")
    public List<User> selectAll();
    @Update("update user set name=#{name},dept=#{dept},phone=#{phone},website=#{website} where id=#{id}")
    public int update(User user);
    @Delete("delete from user where id = #{id}")
    public void delete(int id);

}
