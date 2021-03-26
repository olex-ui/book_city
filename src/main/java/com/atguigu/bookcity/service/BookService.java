package com.atguigu.bookcity.service;

import com.atguigu.bookcity.entity.Book;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
public interface BookService extends IService<Book> {

    String addbook(Book book);
}
