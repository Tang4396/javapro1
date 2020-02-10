package com.test;

/**
 * Created by admin on 2020/2/5.
 */
public class MyArray {
    //作为存储数据的数组
    private int[] array;
    //作为实际存入数据的个数
    private int size;
    public MyArray(){
        size=0;
        array= new int[10];
    }
    public int  getSize(){
        return size;
    }
    public void add(int i){
        //如果存放的个数，大于了数组的长度，则需要扩大容量
        if(size>=array.length){
            //扩大容量的方式，定义一个长度更大的数组 ，把之前的数组复制进去
            int[] newarray=new int[size+size/2];
            for (int j = 0; j <array.length ; j++) {
                newarray[j]=array[j];
            }
            array=newarray;
            System.out.println("扩充完成的长度为"+array.length);
        }
        array[size++]=i;

    }
    //通过下标取值
    public int get (int i){
        if (i<0||i>=size){
            System.out.println("索引错误");
            return -1;
        }
        return array[i];
    }

}
