package com.atguigu.bookcity.service.impl;

import com.atguigu.bookcity.Exception.bookCityException;
import com.atguigu.bookcity.entity.ShoppingCart;
import com.atguigu.bookcity.entity.vo.orderVo;
import com.atguigu.bookcity.mapper.ShoppingCartMapper;
import com.atguigu.bookcity.service.ShoppingCartService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    public int addCart(String userId, orderVo orderVo) {
        if (orderVo==null|| StringUtils.isEmpty(userId)){
            throw new bookCityException(201,"信息为空");
        }
        QueryWrapper<ShoppingCart> shoppingCartQueryWrapper = new QueryWrapper<>();
        shoppingCartQueryWrapper.eq("user_id",userId);
        shoppingCartQueryWrapper.eq("book_id",orderVo.getBookId());
        ShoppingCart cart1 = baseMapper.selectOne(shoppingCartQueryWrapper);
        if (cart1!=null){
            cart1.setBookNumber(cart1.getBookNumber()+ orderVo.getBookNumber());
            baseMapper.updateById(cart1);
            return 1;
        }else {
            ShoppingCart shoppingCart = new ShoppingCart();
            BeanUtils.copyProperties(orderVo,shoppingCart);
            shoppingCart.setUserId(userId);
            int insert = baseMapper.insert(shoppingCart);
            return insert;
        }
    }

    @Override
    public void updateNumber(String userId, orderVo orderVo) {
        if (orderVo==null|| StringUtils.isEmpty(userId)){
            throw new bookCityException(201,"信息为空");
        }
        QueryWrapper<ShoppingCart> cartQueryWrapper = new QueryWrapper<>();
        cartQueryWrapper.eq("user_id",userId);
        cartQueryWrapper.eq("book_id",orderVo.getBookId());
        ShoppingCart cart1 = baseMapper.selectOne(cartQueryWrapper);
        if (cart1!=null){
            cart1.setBookNumber(orderVo.getBookNumber());
            baseMapper.updateById(cart1);
        }else {
            throw new bookCityException(201,"信息为空");
        }
    }
}
