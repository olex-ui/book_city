package com.atguigu.bookcity.controller;


import com.atguigu.bookcity.entity.Category;
import com.atguigu.bookcity.vo.commonResult;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hxx
 * @since 2021-03-19
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    //添加一级分类
    @PostMapping("/addfirstCategory/{firstCate}")
    public commonResult addfirstCategory(@PathVariable("firstCate") String firstCate){
        return commonResult.ok();
    }

    //修改一级分类
    @PostMapping("/updatefirstCategory")
    public commonResult updatefirstCategory(@RequestBody Category category){
        return commonResult.ok();
    }

    //删除一级分类
    @PostMapping("/deletefirstCategory/{id}")
    public commonResult deletefirstCategory(@PathVariable("id") String id){
        return commonResult.ok();
    }

    //添加二级分类
    @PostMapping("/addsecondCategory/{firstCate}/{secondCate}")
    public commonResult addsecondCategory(@PathVariable("firstCate") String firstCate,
                                          @PathVariable("secondCate") String secondCate){
        return commonResult.ok();
    }

    //删除二级分类
    @PostMapping("/deletesecondCategory/{secondCate}")
    public commonResult deletesecondCategory(@PathVariable("secondCate") String secondCate){
        return commonResult.ok();
    }

    //修改二级分类
    @PostMapping("/updatesecondCategory")
    public commonResult updatesecondCategory(@RequestBody Category category){
        return commonResult.ok();
    }
}

