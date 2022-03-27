package org.example.user.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.user.pojo.User;

public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User getUserById(Long id);
}