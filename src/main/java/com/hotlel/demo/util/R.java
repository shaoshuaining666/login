package com.hotlel.demo.util;


import com.hotlel.demo.enums.HotelEnum;
import com.hotlel.demo.exception.AppException;
import com.hotlel.demo.vo.ResultVO;



public class R {

    public static ResultVO ok(Object data){
        ResultVO vo = new ResultVO(0,"",data);
        return vo;
    }

    public static ResultVO ok(){
        return ok(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO vo = new ResultVO(code,msg,null);
        return vo;
    }

    public static ResultVO error(AppException ex){
        ResultVO vo = new ResultVO(ex.getCode(),ex.getMessage(),null);
        return vo;
    }

    public static ResultVO error(HotelEnum jxcEnum){
        ResultVO vo = new ResultVO(jxcEnum.getCode(),jxcEnum.getMsg(),null);
        return vo;
    }

}
