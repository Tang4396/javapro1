package com.test;

/**
 * Created by admin on 2020/2/5.
 */
public class Guo extends Teacher{
    public Guo(String name,int age){
        super(name,age);
    }
    @Override
    public void teach() {
        System.out.println("郭老师能讲课");
    }
}
