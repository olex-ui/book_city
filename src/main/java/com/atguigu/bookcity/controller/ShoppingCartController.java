package com.atguigu.bookcity.controller;


import com.atguigu.bookcity.vo.commonResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hxx
 * @since 2021-03-19
 */
@RestController
@RequestMapping("/shopping-cart")
public class ShoppingCartController {

    //添加购物车
    @PostMapping("/addCart")
    public commonResult addCart(@RequestParam("bookId") String bookId,
                                @RequestParam("bookNum") int number,
                                HttpServletRequest httpServletRequest){
        //加入购物车之前，先查看是否有该商品，如果有只增加数量
        //如果已经有该用户商品信息，直接用现成的用户id增加商品
        return commonResult.ok();
    }

    @PostMapping("/updateNumber")
    public commonResult updateNum(@RequestParam("bookId") String bookId,
                                @RequestParam("bookNum") int number,
                                HttpServletRequest httpServletRequest){
        //购物车中的商品数量修改，根据条件update书的数量
        return commonResult.ok();
    }

}

