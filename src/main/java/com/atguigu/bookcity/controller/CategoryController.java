package com.atguigu.bookcity.controller;


import com.atguigu.bookcity.entity.Category;
import com.atguigu.bookcity.service.CategoryService;
import com.atguigu.bookcity.vo.commonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hxx
 * @since 2021-03-19
 */
@RestController
@RequestMapping("/bookcity/category")
public class CategoryController {

    @Resource
    CategoryService categoryService;

    //添加一级分类
    @PostMapping("/addfirstCategory")
    public commonResult addfirstCategory(@RequestBody Category category) {
        String id = categoryService.addfirstCategory(category);
        return commonResult.ok().data("id",id);
    }


    //修改一级分类
    @PostMapping("/updatefirstCategory")
    public commonResult updatefirstCategory(@RequestBody Category category) {
        categoryService.updatefirstCategory(category);
        return commonResult.ok();
    }

    //删除一级分类
    @PostMapping("/deletefirstCategory/{id}")
    public commonResult deletefirstCategory(@PathVariable("id") String id) {
        categoryService.deletefirstCategory(id);
        return commonResult.ok();
    }

    //添加二级分类
    @PostMapping("/addsecondCategory")
    public commonResult addsecondCategory(@RequestBody Category category) {

        String id = categoryService.addsecondCategory(category);
        return commonResult.ok().data("id",id);
    }

    //删除二级分类
    @PostMapping("/deletesecondCategory/{id}")
    public commonResult deletesecondCategory(@PathVariable String id) {
        categoryService.deletesecondCategory(id);
        return commonResult.ok();
    }

    //修改二级分类
    @PostMapping("/updatesecondCategory")
    public commonResult updatesecondCategory(@RequestBody Category category) {
        categoryService.updatesecondCategory(category);
        return commonResult.ok();
    }
}

