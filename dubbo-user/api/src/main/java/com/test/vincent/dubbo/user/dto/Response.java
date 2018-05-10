package com.test.vincent.dubbo.user.dto;

import java.io.Serializable;

public class Response implements Serializable{

    private static final long serialVersionUID = -2251525086598261956L;


    private String code;

    private String memo;

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode( String code ) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo( String memo ) {
        this.memo = memo;
    }
}
