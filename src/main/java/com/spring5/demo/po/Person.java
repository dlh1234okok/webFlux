package com.spring5.demo.po;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/**
 * @author: dulihong
 * @date: 2019/1/21 10:14
 */
public class Person{

    private String id;

    private String name;

    private String pwd;

    public Person(String id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
