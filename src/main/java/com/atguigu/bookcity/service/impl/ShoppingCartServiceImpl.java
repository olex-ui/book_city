package com.atguigu.bookcity.service.impl;

import com.atguigu.bookcity.Exception.bookCityException;
import com.atguigu.bookcity.entity.ShoppingCart;
import com.atguigu.bookcity.mapper.ShoppingCartMapper;
import com.atguigu.bookcity.service.ShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

    @Override
    public void addCart(String bookId, int number, HttpServletRequest httpServletRequest) {
        HttpSession session = httpServletRequest.getSession();
        String userId = (String) session.getAttribute("userId");
        if (userId==null){
            //验证登录
            //待完善
            throw new bookCityException(201,"添加失败，未登录");
        }

        ShoppingCart cart = baseMapper.selectById(bookId);
        if (cart!=null){
            //购物车存在
            cart.setBookNumber(cart.getBookNumber()+number);
            baseMapper.updateById(cart);
        }else{
            //第一次购买

            cart.setBookNumber(number);
            cart.setUserId(userId);
            baseMapper.insert(cart);
        }

    }
}
