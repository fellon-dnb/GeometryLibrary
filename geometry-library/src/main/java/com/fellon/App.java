package com.fellon;

import java.util.Scanner;

@Deprecated
public class App
{
    public static void main( String[] args ) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("выбери фигуру: 1 - круг, 2 - прямоугольник, 3 - треугольник");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("введи радиус круга");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("площадь - " + circle.getArea() + " периметр - " + circle.getPerimeter());
                    break;

                case 2:
                    System.out.println("введи сторону прямоугольника");
                    double wight = scanner.nextDouble();
                    System.out.println("введи еще сторону прямоугольника");
                    double height = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(wight, height);
                    System.out.println("площадь - " + rectangle.getArea() + " периметр - " + rectangle.getPerimeter());
                    break;
                case 3:
                    System.out.println("введи сторону треугольника");
                    double a = scanner.nextDouble();
                    System.out.println("ещё введи сторону треугольника");
                    double b = scanner.nextDouble();
                    System.out.println("и ещё введи сторону треугольника");
                    double c = scanner.nextDouble();
                    Triangle triangle = new Triangle(a, b, c);
                    System.out.println("площадь - " + triangle.getArea() + " периметр - " + triangle.getPerimeter());
                    break;
                default:
                    System.out.println("неверный выбор");
                    break;
            }
            scanner.close();


    }
}
