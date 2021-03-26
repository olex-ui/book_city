package com.atguigu.bookcity.service.impl;

import com.atguigu.bookcity.entity.Book;
import com.atguigu.bookcity.mapper.BookMapper;
import com.atguigu.bookcity.service.BookService;
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
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {


    @Override
    public String addbook(Book book) {
        baseMapper.insert(book);
        return book.getId();
    }
}
