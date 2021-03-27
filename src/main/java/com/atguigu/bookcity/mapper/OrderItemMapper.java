package com.atguigu.bookcity.mapper;

import com.atguigu.bookcity.entity.Category;
import com.atguigu.bookcity.entity.orderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hxx
 * @date 2021/3/26 23:07
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<orderItem> {
}
