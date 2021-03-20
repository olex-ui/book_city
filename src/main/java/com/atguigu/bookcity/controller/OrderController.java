package com.atguigu.bookcity.controller;


import com.atguigu.bookcity.entity.vo.orderVo;
import com.atguigu.bookcity.vo.commonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/order")
public class OrderController {

    @ApiOperation(value = "传递生成订单的商品的json形式的数组")
    @PostMapping("/createOrder")
    public commonResult createOrder(@RequestBody List<orderVo> orderVoList){
        return commonResult.ok();
    }

    //点击付款后直接修改status
    @PostMapping("/updateStatus/{orderId}")
    public commonResult updateStatus(@PathVariable("orderId") String orderId){
        //修改status为1
        return commonResult.ok();
    }

    //点击我的订单，查询订单信息
    @GetMapping("/getAllOrder/{userId}")
    public commonResult getAllOrder(@PathVariable("userId") String userId){
        return commonResult.ok();
    }
}

