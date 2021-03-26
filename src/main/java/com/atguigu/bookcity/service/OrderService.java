package com.atguigu.bookcity.service;

import com.atguigu.bookcity.entity.Order;
import com.atguigu.bookcity.entity.vo.orderVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
public interface OrderService extends IService<Order> {
    HashMap<String, Object> getorderMsg(String userId);


//    void createOrder(List<orderVo> orderVoList);
}
