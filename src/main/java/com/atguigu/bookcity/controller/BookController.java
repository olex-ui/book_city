package com.atguigu.bookcity.controller;


import com.atguigu.bookcity.entity.Book;
import com.atguigu.bookcity.vo.commonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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


}

