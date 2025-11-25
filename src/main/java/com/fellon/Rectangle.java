package com.fellon;

public class Rectangle implements Shape {
    private final double wight;
    private final double height;
    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }
        public double getArea() {
            return wight*height;
        }
        public double getPerimeter() {
            return 2*(wight*height);
        }
    }

