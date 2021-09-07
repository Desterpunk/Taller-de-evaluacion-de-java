package com.sofka;

public class MathematicFunctions {
    public static void IsBigger(double num1, double num2){
        if(num1 > num2){
            System.out.println(num1 + " Is bigger than " + num2);
        } else if(num1 < num2){
            System.out.println(num1 + " Is less than " + num2);
        } else if(num1 == num2){
            System.out.println(num1 + " Is equals than " + num2);
        }
    }

    public static void AreaOfCircle(double radius){
        if (radius<0){
            System.out.println("Think about it");
        } else if(radius >= 0) {
            System.out.println("The area of a circle with " + radius + " mm of radius is " + String.format("%.2f", Math.PI * Math.pow(radius, 2)) + "(mm)^2");
        }
    }
}
