package com.atguigu.bookcity.service.impl;

import com.atguigu.bookcity.entity.Order;
import com.atguigu.bookcity.mapper.OrderMapper;
import com.atguigu.bookcity.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.HashMap;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
@Slf4j
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Override
    public HashMap<String, Object> getorderMsg(String userId) {
        return null;
    }


//    @Override
//    public void createOrder(List<orderVo> orderVoList) {
//
//        for (orderVo vo : orderVoList) {
//            Order order = null;
//            try {
//                order= new Order();
//                BeanUtils.copyProperties(vo,order);
//                baseMapper.insert(order);
//                if (order.getId().isEmpty()){
//                    throw new bookCityException(201,"");
//                }
//            } catch (BeansException e) {
//                e.printStackTrace();
//
//            }
//            finally {
//                System.out.println(order);
//                log.info("order",order);
//            }


//        }



//    }
}
