package com.fellon.geometry;

import com.fellon.Shape;

public class GeometryUtils {

    public static double centsToMeters(double cm) {
        return cm/100;
    }
    public static double centsToMilimetrs(double cm){
        return cm*100;
    }
    public static int compareAreas(Shape shape1, Shape shape2){
        return Double.compare(shape1.getArea(), shape2.getArea());
    }
    public static int comparePerimeters(Shape shape1, Shape shape2){
        return Double.compare(shape1.getPerimeter(), shape2.getPerimeter());
    }
}
