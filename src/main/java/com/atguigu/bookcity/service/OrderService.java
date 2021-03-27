package com.atguigu.bookcity.service;

import com.atguigu.bookcity.entity.OrderForm;
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
public interface OrderService extends IService<OrderForm> {
    HashMap<String, Object> getorderMsg(String userId);

    boolean createOrder(List<orderVo> orderVoList, String userId);

//    void createOrder(List<orderVo> orderVoList);
}
