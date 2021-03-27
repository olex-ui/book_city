package com.atguigu.bookcity.service.impl;

import com.atguigu.bookcity.entity.OrderForm;
import com.atguigu.bookcity.entity.orderItem;
import com.atguigu.bookcity.entity.vo.orderVo;
import com.atguigu.bookcity.mapper.OrderMapper;
import com.atguigu.bookcity.service.OrderItemService;
import com.atguigu.bookcity.service.OrderService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;


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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderForm> implements OrderService {
    @Resource
    private OrderItemService orderItemService;

    @Resource
    private OrderService orderService;

    @Override
    public HashMap<String, Object> getorderMsg(String userId) {
        QueryWrapper<OrderForm> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",userId);
        queryWrapper.select("id");
        List<OrderForm> orderList = baseMapper.selectList(queryWrapper);
        HashMap<String, Object> hashMap = new HashMap<>();
        for (OrderForm order : orderList) {
            String orderId = order.getId();
            QueryWrapper<orderItem> itemQueryWrapper = new QueryWrapper<>();
            itemQueryWrapper.eq("order_id",orderId);
            itemQueryWrapper.select("book_id","book_number");
            List<orderItem> orderItems = orderItemService.list(itemQueryWrapper);
            hashMap.put(orderId,orderItems);
        }
        return hashMap;
    }

    @Override
    public boolean createOrder(List<orderVo> orderVoList, String userId) {
        OrderForm order = new OrderForm();
        order.setStatus(0);
        order.setUserId(userId);
        orderService.save(order);
        String orderId = order.getId();
        for (orderVo orderVo : orderVoList) {
            orderItem orderItem = new orderItem();
            BeanUtils.copyProperties(orderVo,orderItem);
            orderItem.setOrderId(orderId);
            boolean save = orderItemService.save(orderItem);
            if (!save){
                return false;
            }
        }
        return true;
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
