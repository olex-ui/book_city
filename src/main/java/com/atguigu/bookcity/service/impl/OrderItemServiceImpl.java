package com.atguigu.bookcity.service.impl;

import com.atguigu.bookcity.entity.Category;
import com.atguigu.bookcity.entity.orderItem;
import com.atguigu.bookcity.mapper.CategoryMapper;
import com.atguigu.bookcity.mapper.OrderItemMapper;
import com.atguigu.bookcity.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author hxx
 * @date 2021/3/26 23:03
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, orderItem> implements OrderItemService {

}
