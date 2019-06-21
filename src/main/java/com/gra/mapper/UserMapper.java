package com.gra.mapper;

import com.gra.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User queryByUserName(@Param("userName") String userName);
}
