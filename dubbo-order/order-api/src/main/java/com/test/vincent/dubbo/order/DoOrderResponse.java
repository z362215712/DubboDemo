package com.test.vincent.dubbo.order;

import java.io.Serializable;

public class DoOrderResponse implements Serializable {
    private static final long serialVersionUID = -5922675297660320216L;
    private int code;
    private String memo;
    private Object data;

    @Override
    public String toString() {
        return "DoOrderResponse{" +
                "code=" + code +
                ", memo='" + memo + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode( int code ) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo( String memo ) {
        this.memo = memo;
    }

    public Object getData() {
        return data;
    }

    public void setData( Object data ) {
        this.data = data;
    }
}
