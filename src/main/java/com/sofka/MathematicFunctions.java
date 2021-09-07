package com.sofka;

import java.util.logging.ConsoleHandler;

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

    public static void Iva21(double price) {
            final double IVA = 21;
        System.out.println("The final price of " + price + " with 21% of iva is " + String.format("%.2f",(price + (price*(IVA/100)))));
    }

    public static void EvenAndOdd(){
        double i = 1;
        while (i<=100){
            if (i%2 == 0){System.out.println("Even: " + i);}
            else {System.out.println("Odd: " + i);}
            i++;
        }
    }

    public static void EvenAndOddFor(){
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0){System.out.println("Even: " + i);}
            else {System.out.println("Odd: " + i);}
        }
    }

    public static void WorkDay(String day){
        switch (day.toLowerCase()){
            case "sunday":
                System.out.println(day + " is not a workDay");
                break;
            case "monday":
                System.out.println(day + " is a workDay");
                break;
            case "tuesday":
                System.out.println(day + " is a workDay");
                break;
            case "wednesday":
                System.out.println(day + " is a workDay");
                break;
            case "thursday":
                System.out.println(day + " is a workDay");
                break;
            case "friday":
                System.out.println(day + " is a workDay");
                break;
            case "saturday":
                System.out.println(day + " is a workDay");
                break;
            default:
                System.out.println("Think about it");
                break;
        }

    }

    public static void lengthAndCountPrhase(String phrase){
        System.out.println("The length is: " + phrase.length());
        double countA=0,countE=0,countI=0,countO=0,countU=0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.toLowerCase().charAt(i) == 'a') {
                countA++;
            } else if (phrase.toLowerCase().charAt(i) == 'e'){
                countE++;
            } else if (phrase.toLowerCase().charAt(i) == 'i'){
                countI++;
            } else if (phrase.toLowerCase().charAt(i) == 'o'){
                countO++;
            } else if (phrase.toLowerCase().charAt(i) == 'u'){
                countU++;
            }
        }
        System.out.println("Amount of a: " + countA + "\n" +
                            "Amount of e: " + countE + "\n" +
                            "Amount of i: " + countI + "\n" +
                            "Amount of o: " + countO + "\n" +
                            "Amount of u: " + countU + "\n");
    }

}
