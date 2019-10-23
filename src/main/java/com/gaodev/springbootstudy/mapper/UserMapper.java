package com.gaodev.springbootstudy.mapper;

import com.gaodev.springbootstudy.domain.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户 数据访问层
 */
@Repository
//@Mapper
public interface UserMapper {

    // 使用注解方式，直接写SQL
    @Select("select * from tb_user")
    List<TbUser> findAll();
}
