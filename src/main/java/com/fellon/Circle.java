package com.fellon;

public class Circle implements Shape, Rounded{
    private final double radius;
    private final double PI = Math.PI;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea() {
        return PI*radius*radius;
    }
    public double getPerimeter() {
        return 2 * PI * radius;
    }
    public double getRoundedArea() {
        return Math.round(getArea());
    }
    public double getRoundedPerimeter() {
        return Math.round(getPerimeter());
    }
}
