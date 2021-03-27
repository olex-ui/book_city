package com.atguigu.bookcity.controller;


import com.atguigu.bookcity.entity.OrderForm;
import com.atguigu.bookcity.entity.vo.orderVo;
import com.atguigu.bookcity.service.OrderService;
import com.atguigu.bookcity.vo.commonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hxx
 * @since 2021-03-19
 */
@RestController
@RequestMapping("/bookcity/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @ApiOperation(value = "传递生成订单的商品的json形式的数组")
    @PostMapping("/createOrder")
    public commonResult createOrder(@RequestBody List<orderVo> orderVoList,
                                    @RequestParam("userId") String userId){
        if (orderService.createOrder(orderVoList,userId)){
            return commonResult.ok();
        }
        return commonResult.error();
    }

    //点击付款后直接修改status
    @PostMapping("/updateStatus/{orderId}")
    public commonResult updateStatus(@PathVariable("orderId") String orderId){
        OrderForm order = new OrderForm();
        order.setId(orderId);
        order.setStatus(1);
        boolean b = orderService.updateById(order);
        if (b){
            //修改status为1
            return commonResult.ok();
        }
        return commonResult.error();

    }

    //点击我的订单，查询订单信息
    @GetMapping("/getAllOrder/{userId}")
    public commonResult getAllOrder(@PathVariable("userId") String userId){
        HashMap<String,Object> resultMap=orderService.getorderMsg(userId);
        return commonResult.ok().data(resultMap);
    }
}

