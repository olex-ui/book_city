package com.atguigu.bookcity.controller;


import com.atguigu.bookcity.entity.vo.orderVo;
import com.atguigu.bookcity.vo.commonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
}

