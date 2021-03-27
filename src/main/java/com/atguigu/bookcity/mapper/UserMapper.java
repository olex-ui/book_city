package com.atguigu.bookcity.mapper;

import com.atguigu.bookcity.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
