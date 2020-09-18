package com.company;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){

    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea (){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }
    @Override
    public String toString(){
        return ("A Rectangle with width = "+ this.width + " and length = " + this.length+ ", which is a subclass of "+ super.toString());
    }
}
class TestRectangle{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3.5, 6.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("blue",false,5,8);
        System.out.println(rectangle);
    }
}
