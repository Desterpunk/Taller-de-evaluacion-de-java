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

    public static void comparePhrases(String phrase1, String phrase2){
        int at = indexOfDifference(phrase1, phrase2);
        if (phrase1 == null) {
            System.out.println("Differences are: " + phrase2);
        } else if (phrase2 == null) {
            System.out.println("Differences are: " + phrase1);
        } else if (phrase1.equals(phrase2)){
            System.out.println("There are no Differences");
        } else {
            System.out.println("Differences are: " + phrase2.substring(at));
        }

    }

    public static int indexOfDifference(CharSequence cs1, CharSequence cs2) {
        if (cs1 == cs2) {
            return 0;
        }
        if (cs1 == null || cs2 == null) {
            return 0;
        }
        int i;
        for (i = 0; i < cs1.length() && i < cs2.length(); ++i) {
            if (cs1.charAt(i) != cs2.charAt(i)) {
                break;
            }
        }
        if (i < cs2.length() || i < cs1.length()) {
            return i;
        }
        return 0;
    }

    public static void goTo1000(double number){
        for (double i = number; i <= 1000; i=i+2) {
            System.out.println(i);
        }
    }

    public static void NewMenu(){
        boolean running = true;
        while (running){
            System.out.println("GESTION CINEMATOGRAFICA");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            InputText opcion = new InputText("AnotherOpcion");

            switch (opcion.getText()){
                case "1":
                    System.out.println("CREANDO ACTOR...");
                    break;
                case "2":
                    System.out.println("BUSCANDO ACTOR...");
                    break;
                case "3":
                    System.out.println("ELIMINANDO ACTOR...");
                    break;
                case "4":
                    System.out.println("MODIFICANDO ACTOR...");
                    break;
                case "5":
                    System.out.println("LISTA DE ACTORES...");
                    break;
                case "6":
                    System.out.println("LISTA DE PELICULAS DE LOS ACTORES...");
                    break;
                case "7":
                    System.out.println("LISTA DE CATEGORIA DE LAS PELICULAS DE LOS ACTORES...");
                    break;
                case "8":
                    System.out.println("BYE BYE");
                    running = false;
                    break;
                default:
                    System.out.println("INCORRECT OPTION");
                    break;
            }
        }
    }

}
