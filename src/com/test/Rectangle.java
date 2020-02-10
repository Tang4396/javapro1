package com.test;

/**
 * Created by admin on 2020/2/6.
 */
public class Rectangle extends Shap {
    private double width;
    private double height;
    public Rectangle(double width,double height,String color){
        super(color);
        this.width=width;
        this.height=height;
    }
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPer() {
        return 2*(width+height);
    }

    @Override
    public void showAll() {
        System.out.println("矩形的面积"+getArea());
        System.out.println("矩形的周长"+getPer());
        System.out.println("矩形的颜色"+getColor());
    }
}
