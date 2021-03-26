package com.atguigu.bookcity.service.impl;

import com.atguigu.bookcity.entity.User;
import com.atguigu.bookcity.mapper.UserMapper;
import com.atguigu.bookcity.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
