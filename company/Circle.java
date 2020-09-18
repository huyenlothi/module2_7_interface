package com.company;

import java.util.concurrent.Callable;

public class Circle extends Shape {
    private double radius =1;

    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter() {
        return Math.PI*2*this.radius;
    }
    @Override
    public String toString (){
        return ("A Circle with radius = "+ this.radius + ", which is subclass of "+ super.toString());
    }
}
class CircleTest{
    public static void main(String[] args) {
       Circle circle = new Circle();
        System.out.println(circle);
        circle= new Circle(3.5);
        System.out.println(circle);
        circle= new Circle("red ", false,3.5);
        System.out.println(circle);
    }
}
