package com.test;

/**
 * Created by admin on 2020/2/5.
 */
public class Person extends Animal {
    private int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public void run() {
        System.out.println("人在转圈");
    }
}
