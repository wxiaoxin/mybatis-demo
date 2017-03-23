package com.king.demo.mapper;

import com.king.demo.domain.dto.UserDTO;
import com.king.demo.domain.entity.User;
import com.king.demo.provider.UserMapperSqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by King on 2017/2/21.
 *
 * 用户Mapper
 */

@Mapper
public interface UserMapper {

//    @InsertProvider(type = UserMapperSqlProvider.class, method = "insert")
    int insert(User user);





//    @Select("SELECT * FROM User")
    List<User> listAll();

//    @Select("SELECT * FROM User WHERE id = #{id}")
    User getById(@Param("id") Long id);

    User getByIdWithAddress(@Param("id") Long id);

//    @Delete("DELETE FROM User WHERE id = #{id}")
    void delete(String id);

//    @Update("UPDATE User SET name = #{name}, age = #{age} WHERE id = #{id}")
    void update(User user);

}
