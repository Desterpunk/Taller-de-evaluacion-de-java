package com.sofka;

import java.io.*;
import java.time.*;
import java.time.format.*;

public class Menu {
    public static void main(String[] args) {
        boolean running = true;
        while(running){
            System.out.println("\n\n Welcome!, Select one operation: ");
            System.out.println("1) Is this number greater,less, or equal?.");
            System.out.println("2) Area of a circle.");
            System.out.println("3) 21% of Iva, life is wonderful");
            System.out.println("4) Even and Odd with while");
            System.out.println("5) Even and Odd with For");
            System.out.println("6) Only positivism!, also with numbers");
            System.out.println("7) Time for work?");
            System.out.println("8) Replacing: 'La sonrisa sera la mejor arma contra la tristeza'" +
                    " with e's and concatenating a phrase ");
            System.out.println("9) String without spaces");
            System.out.println("10) length of a string, and count of vowels");
            System.out.println("11) Equal or Different Phrases");
            System.out.println("12) What time is it?");
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
                case "3":
                    InputText price = new InputText("price");
                    MathematicFunctions.Iva21(price.getDouble());
                    break;
                case "4":
                    MathematicFunctions.EvenAndOdd();
                    break;
                case "5":
                    MathematicFunctions.EvenAndOddFor();
                    break;
                case "6":
                    double number;
                    do {
                        InputText positiveNumber = new InputText("positiveNumber");
                        number = positiveNumber.getDouble();
                    } while (number < 0);
                    System.out.println("Positive number is " + number);
                    break;
                case "7":
                    InputText dayOfWeek = new InputText("dayOfWeek");
                    MathematicFunctions.WorkDay(dayOfWeek.getText());
                    break;
                case "8":
                    String phrase = "La sonrisa sera la mejor arma contra la tristeza";
                    phrase = phrase.replace('a','e');
                    InputText phrase2 = new InputText(" a phrase");
                    System.out.println(phrase + " " + phrase2.getText());
                    break;
                case "9":
                    InputText phraseWithSpaces = new InputText(" PhraseWithSpaces");
                    String phraseWithoutSpaces = phraseWithSpaces.getText().replaceAll(" ","");
                    System.out.println(phraseWithoutSpaces);
                    break;
                case "10":
                    InputText phraseToCount = new InputText("phraseToCount");
                    MathematicFunctions.lengthAndCountPrhase(phraseToCount.getText());
                    break;
                case "11":
                    InputText phareToCompare = new InputText("firstPhraseToCompare");
                    InputText phareToCompare2 = new InputText("secondPhraseToCompare");
                    MathematicFunctions.comparePhrases(phareToCompare.getText(), phareToCompare2.getText());

                    break;
                case "12":
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("AAAA/MM/DD HH:MM:SS");
                    System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
                    break;
                case "0":
                    System.out.println("Have a good day");
                    running = false;
                    break;
                default:
                    System.out.println("Think about it");
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