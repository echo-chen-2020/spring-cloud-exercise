package org.example.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.user.pojo.User;

import java.util.List;

@Mapper
public interface UserMapper {
//    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") Long id);

    List<User> getAllUser();
}