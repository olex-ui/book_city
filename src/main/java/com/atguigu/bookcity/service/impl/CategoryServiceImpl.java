package com.atguigu.bookcity.service.impl;

import com.atguigu.bookcity.entity.Category;
import com.atguigu.bookcity.mapper.CategoryMapper;
import com.atguigu.bookcity.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hxx
 * @since 2021-03-19
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
