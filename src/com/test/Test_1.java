package com.test;

/**
 * Created by admin on 2020/2/5.
 */
public class Test_1 {
    public static void main(String[] args) {
       // 冒泡排序
      /*  int array[]={90,56,78,23,65,45,70,80,34,53,30};
        for (int i = 0; i <array.length-1 ; i++) {
            int flag=0;
            for (int j = 0; j <array.length-1-i; j++) {
                int temp;
                if (array[j]>array[j+1] ) {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag++;
                }
            }
            if (flag==0){
                break;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);

        }*/

         //选择排序
        /* int array[]={90,56,78,23,65,45,70,80,34,53,30};
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                int temp;
                if (array[i]>array[j]){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }*/


        //二分搜索

   /*     int [] array=new int[100000];
        for (int i = 0; i <array.length ; i++) {
            array[i]=i+1;
        }
        int a=30000;
        int index = search(array,a);
        System.out.println(index);

    }*/
  /*  public static  int find(int[] array,int value){
        int count=0;
        for (int i = 0; i <array.length ; i++) {
            count++;
            if (array[i]==value){
                System.out.println("查找了"+count+"次");
                return i;
            }
        }
        return -1;
    }*/
    /*public static int search(int[] array,int value ){
        int min=0;
        int max=array.length-1;
        int mid;
        int count=0;
        while (min<max){
            count++;
            mid=(min+max)/2;
            if (value==array[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if(value<array[mid]){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return -1;*/
        Person p1 = new Person();
        p1.setNo(001);
        p1.setAge(10);
        p1.setName("张三");
        p1.run();
        System.out.println(p1.getAge()+"、"+p1.getNo()+"、"+p1.getName());
        System.out.println("==============================");
        Dog d1 = new Dog();
        d1.setName("金毛");
        d1.setAge(4);
        d1.run();
        System.out.println(d1.getName()+"、"+d1.getAge());
        System.out.println("=====================");

        Cat c1= new Cat();
        c1.setAge(6);
        c1.setName("caty");
        c1.run();
        System.out.println(c1.getName()+"、"+c1.getAge());

    }
}
