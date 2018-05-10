package com.test.vincent.dubbo.user.dto;

import java.io.Serializable;

public class UserLoginRequest implements Serializable{
    private static final long serialVersionUID = 5496971612713315443L;

    private String name;
    private String password;

    @Override
    public String toString() {
        return "UserLoginRequest{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }
}
