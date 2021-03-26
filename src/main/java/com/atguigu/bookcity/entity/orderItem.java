package com.atguigu.bookcity.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author hxx
 * @date 2021/3/26 22:24
 */
@Data
public class orderItem {
    private static final long serialVersionUID = 1L;

    private String bookId;

    private Integer bookNumber;

    private String orderId;

}
