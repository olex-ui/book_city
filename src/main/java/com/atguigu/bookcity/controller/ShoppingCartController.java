package com.atguigu.bookcity.controller;


import com.atguigu.bookcity.entity.ShoppingCart;
import com.atguigu.bookcity.entity.vo.orderVo;
import com.atguigu.bookcity.service.ShoppingCartService;
import com.atguigu.bookcity.vo.commonResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hxx
 * @since 2021-03-19
 */
@RestController
@RequestMapping("/bookcity/shopping-cart")
public class ShoppingCartController {


    @Resource
    private ShoppingCartService cartService;

    //添加购物车
    @PostMapping("/addCart")
    public commonResult addCart(@RequestParam("userId") String userId,
                                @RequestBody orderVo orderVo) {
        int num=cartService.addCart(userId,orderVo);
        if (num>0){
            return commonResult.ok();
        }
        return commonResult.error();
    }

    //修改数量
    @PostMapping("/updateNumber")
    public commonResult updateNum(@RequestParam("userId") String userId,
                                  @RequestBody orderVo orderVo) {
        //购物车中的商品数量修改，根据条件update书的数量
        cartService.updateNumber(userId,orderVo);
        return commonResult.ok();
    }


}



