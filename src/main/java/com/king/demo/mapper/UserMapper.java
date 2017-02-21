package com.king.demo.mapper;

import com.king.demo.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/2/21.
 */

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM User")
    List<User> findAll();

    @Select("SELECT * FROM User WHERE id = #{id}")
    User findById(@Param("id") String id);

    @Insert("INSERT INTO User VALUES(#{id}, #{name}, #{age})")
    void insert(User user);

    @Delete("DELETE FROM User WHERE id = #{id}")
    void delete(String id);

    @Update("UPDATE User SET name = #{name}, age = #{age} WHERE id = #{id}")
    void update(User user);

}
