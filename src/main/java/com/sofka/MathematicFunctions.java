package com.sofka;

public class MathematicFunctions {
    public static void IsBigger(double num1, double num2){
        if(num1 > num2){
            System.out.println(num1 + " Is bigger than " + num2);
        } else if(num1 < num2){
            System.out.println(num1 + " Is less than " + num2);
        } else if(num1 = num2){
            System.out.println(num1 + " Is equals than " + num2);
        }
    }
}
