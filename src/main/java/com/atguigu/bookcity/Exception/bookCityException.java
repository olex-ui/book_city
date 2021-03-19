package com.atguigu.bookcity.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hxx
 * @date 2021/2/19 19:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class bookCityException extends RuntimeException{
    private Integer code;
    private String msg;
}
