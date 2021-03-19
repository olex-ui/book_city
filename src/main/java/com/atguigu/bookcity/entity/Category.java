package com.atguigu.bookcity.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
@ApiModel(value="Category对象", description="")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String title;

    private String parentId;

    private String description;

    private Date gmtCreate;

    private Date gmtModified;


}
