package com.hotlel.demo.bean.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create By LB on 2020/5/28.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespResult<T> {

    private Integer code;
    private String message;
    private T data;

}
