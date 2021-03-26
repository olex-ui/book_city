package com.atguigu.bookcity.service;

import com.atguigu.bookcity.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
public interface CategoryService extends IService<Category> {

    void updatefirstCategory(Category vo);

    String addfirstCategory(Category category);

    void deletefirstCategory(String id);

    String addsecondCategory(Category category);

    void deletesecondCategory(String vo );

    void updatesecondCategory(Category category);
}
