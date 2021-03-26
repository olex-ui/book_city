package com.atguigu.bookcity.service.impl;

import com.atguigu.bookcity.Exception.bookCityException;
import com.atguigu.bookcity.entity.Category;
import com.atguigu.bookcity.mapper.CategoryMapper;
import com.atguigu.bookcity.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Override
    public void updatefirstCategory(Category vo) {
        updateById(vo);
    }

    /**
     * 添加一级分类
     *
     * @param category 一级分类对象
     * @return 返回唯一的id
     */
    @Override
    public String addfirstCategory(Category category) {
        category.setParentId("0");
        baseMapper.insert(category);
        return category.getId();
    }

    @Override
    public void deletefirstCategory(String id) {
        baseMapper.delete(new QueryWrapper<Category>().eq("parent_id",id));
        baseMapper.deleteById(id);
    }

    @Override
    public String addsecondCategory(Category category) {

        if (category.getDescription() != null || category.getTitle() != null || category.getParentId() != null) {
            baseMapper.insert(category);
            return category.getId();
        }
        else
            throw new bookCityException(201,"添加失败");
    }

    @Override
    public void deletesecondCategory(String id) {
        if (id!=null)
        baseMapper.deleteById(id);
        else throw new bookCityException(201,"删除失败");
    }

    @Override
    public void updatesecondCategory(Category category) {
        baseMapper.updateById(category);
    }
}
