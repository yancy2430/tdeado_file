package com.tdeado.file.utils;

import org.apache.commons.lang3.StringUtils;

public class Ret {
    private int code;
    private String msg;
    private Object data;
    public static Ret ok(Object object){
        Ret ret=new Ret();
        ret.setCode(0);
            ret.setMsg("success");
        ret.setData(object);
        return ret;
    }
    public static Ret err(String msg){
        Ret ret=new Ret();
        ret.setCode(500);
        ret.setMsg(msg);
        ret.setData(null);
        return ret;
    }
    private static Ret err(String msg,int code){
        Ret ret=new Ret();
        ret.setCode(code);
        ret.setMsg(msg);
        ret.setData(null);
        return ret;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        if (StringUtils.isBlank(msg)){
            this.msg = "error";
        }else {
            this.msg = msg;
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Ret{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
