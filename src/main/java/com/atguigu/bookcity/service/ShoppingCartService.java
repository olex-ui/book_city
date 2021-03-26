package com.atguigu.bookcity.service;

import com.atguigu.bookcity.entity.ShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
public interface ShoppingCartService extends IService<ShoppingCart> {

    void addCart(String bookId, int number, HttpServletRequest httpServletRequest);
}
