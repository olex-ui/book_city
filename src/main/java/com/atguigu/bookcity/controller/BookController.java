package com.atguigu.bookcity.controller;


import com.atguigu.bookcity.entity.Book;
import com.atguigu.bookcity.vo.commonResult;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/book")
public class BookController {

    //增加图书
    @PostMapping("/addbook")
    public commonResult addbook(@RequestBody Book book){
        return commonResult.ok();
    }

    @GetMapping("/getbookbyCategory/{firstCategory}/{secondCategory}")
    public commonResult getbookbyCategory(@PathVariable("firstCategory") String firstCategory,
                                          @PathVariable("secondCategory") String secondCategory){
        //图书表的条件查询
        return commonResult.ok();
    }

    //图书删除
    @GetMapping("/deletebook/{bookId}")
    public commonResult deletebook(@PathVariable("bookId") String bookId){
        return commonResult.ok();
    }

    //图书修改
    @PostMapping("/updatebook")
    public commonResult updatebook(@RequestBody Book book){
        return commonResult.ok();
    }

    //分页查询
    @GetMapping("/getPage/{start}")
    public commonResult getPage(@PathVariable("start") int startPage){
        return commonResult.ok();
    }


    //模糊查询
    @GetMapping("/getbookbycondition")
    public commonResult getPage(@RequestBody Book book){
        return commonResult.ok();
    }

}

