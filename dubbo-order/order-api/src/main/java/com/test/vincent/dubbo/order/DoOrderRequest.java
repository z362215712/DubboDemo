package com.test.vincent.dubbo.order;

import java.io.Serializable;

public class DoOrderRequest implements Serializable {
    private static final long serialVersionUID = -1519348656683669941L;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge( Integer age ) {
        this.age = age;
    }
}
