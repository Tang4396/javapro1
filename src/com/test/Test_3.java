package com.test;

/**
 * Created by admin on 2020/2/5.
 */
public class Test_3 {
    public static void main(String[] args) {
        MyArray myarray= new MyArray();
        for (int i = 0; i <=100 ; i++) {
            myarray.add(i);
        }
        for (int i = 0; i <myarray.getSize() ; i++) {
            System.out.println(myarray.get(i));
        }
    }
}
