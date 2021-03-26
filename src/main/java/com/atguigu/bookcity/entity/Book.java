package com.atguigu.bookcity.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * 
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Book对象")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String bookName;

    private String cover;

    private BigDecimal price;

    private String author;

    private String press;

    private Date publishingTime;

    private Date printingTime;

    private String firstId;

    private String secondId;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
