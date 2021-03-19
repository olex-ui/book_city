package com.atguigu.bookcity.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author hxx
 * @since 2021-03-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ShoppingCart对象", description="")
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "book_id", type = IdType.ASSIGN_ID)
    private String bookId;

    private String userId;


}
