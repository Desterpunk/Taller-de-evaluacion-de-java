package com.sofka;

import java.io.*;

public class Menu {
    public static void main(String[] args) {
        boolean running = true;
        while(running){
            System.out.println("Welcome!, Select one operation: ");
            System.out.println("1) Is this number greater,less, or equal?.");
            System.out.println("2) Area of a circle.");
            System.out.println("3) 21% of Iva, life is wonderful");
            System.out.println("0) Exit");
            InputText opcion = new InputText(" your option");
            switch (opcion.getText()){
                case "1":
                    InputText num1IsBigger = new InputText("num1");
                    InputText num2IsBigger = new InputText("num2");
                    MathematicFunctions.IsBigger(num1IsBigger.getDouble(),num2IsBigger.getDouble());
                    break;
                case "2":
                    InputText radiusCircle1 = new InputText("radius (mm)");
                    MathematicFunctions.AreaOfCircle(radiusCircle1.getDouble());
                    break;
                case "0":
                    System.out.println("Have a good day");
                    running = false;
                    break;
            }

        }

    }
}

class InputText {
    String text = "";

    public InputText(String requiredInfo) {
        System.out.println("Please enter " + requiredInfo + ":");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            text = bufferedReader.readLine();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getText() {
        return text;
    }
    public double getDouble() {
        return Double.parseDouble(text);
    }

}