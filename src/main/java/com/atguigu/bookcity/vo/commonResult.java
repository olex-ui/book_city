package com.atguigu.bookcity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hxx
 * @date 2021/3/14 21:10
 */
@Data
public class commonResult {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<>();

    //把构造方法私有
    private commonResult() {}

    //成功静态方法
    public static commonResult ok() {
        commonResult r = new commonResult();
        r.setSuccess(true);
        r.setCode(resultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    //失败静态方法
    public static commonResult error() {
        commonResult r = new commonResult();
        r.setSuccess(false);
        r.setCode(resultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    public commonResult success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public commonResult message(String message){
        this.setMessage(message);
        return this;
    }

    public commonResult code(Integer code){
        this.setCode(code);
        return this;
    }

    public commonResult data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public commonResult data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
