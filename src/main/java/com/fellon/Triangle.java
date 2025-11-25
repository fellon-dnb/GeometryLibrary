package com.fellon;

public class Triangle implements Shape {
    private final double a;
    private final double b;
    private final double c;

public Triangle (double a, double b, double c) {
    this.a=a;
    this.b=b;
    this.c=c;
}
public double getArea() {
    double hp = getPerimeter()/2.0;
return Math.sqrt(hp*(hp-a)*(hp-b)*(hp-c));
}

     public double getPerimeter() {
        return a+b+c;
    }
}

