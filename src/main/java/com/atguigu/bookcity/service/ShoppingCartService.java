package com.atguigu.bookcity.service;

import com.atguigu.bookcity.entity.ShoppingCart;
import com.atguigu.bookcity.entity.vo.orderVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
public interface ShoppingCartService extends IService<ShoppingCart> {

    int addCart(String userId, orderVo orderVo);

    void updateNumber(String userId, orderVo orderVo);
}
