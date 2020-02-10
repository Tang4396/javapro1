package com.test;

/**
 * Created by admin on 2020/2/6.
 */
public abstract class Shap {
    private double area;
    private double per;
    private String color;
    public Shap(){}
    public Shap(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();
}
