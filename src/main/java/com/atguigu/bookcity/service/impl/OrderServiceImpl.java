package com.atguigu.bookcity.service.impl;

import com.atguigu.bookcity.entity.Order;
import com.atguigu.bookcity.mapper.OrderMapper;
import com.atguigu.bookcity.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hxx
 * @since 2021-03-19
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
