package com.atguigu.bookcity.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hxx
 * @since 2021-03-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Admin对象")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String name;

    private String password;


}
