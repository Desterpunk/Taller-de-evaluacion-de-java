package com.sofka;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;

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
            System.out.println("13) Go to 1000 from my number");
            System.out.println("14) Another Menu");
            System.out.println("15) Class of Person");
            System.out.println("16) Class of Electrodomestic");
            System.out.println("17) Class of Series and videogames");
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
                case "13":
                    InputText numberGo1000 = new InputText("number");
                    MathematicFunctions.goTo1000(numberGo1000.getDouble());
                    break;
                case "14":
                    MathematicFunctions.NewMenu();
                    break;
                case "15":
                    InputText nombrePersona = new InputText("nombrePersona");
                    InputText edadPersona = new InputText("edadPersona");
                    InputText sexoPersona = new InputText("sexoPersona");
                    InputText pesoPersona = new InputText("pesoPersona");
                    InputText alturaPersona = new InputText("alturaPersona");
                    Persona personas[] = new Persona[3];
                    personas[0] = new Persona(nombrePersona.getText(),(int) edadPersona.getDouble(), sexoPersona.getText().charAt(0),
                            pesoPersona.getDouble(),alturaPersona.getDouble());
                    personas[1] = new Persona(nombrePersona.getText(),(int) edadPersona.getDouble(), sexoPersona.getText().charAt(0));
                    personas[2] = new Persona();
                    for (int i = 0; i < personas.length; i++) {
                        if (personas[i].calcularMC() == 0){
                            System.out.println("La persona " +(i+1)+ " Esta en su peso ideal");
                        } else if(personas[i].calcularMC() == 1){
                            System.out.println("La persona " +(i+1)+ " Tiene sobrepeso");
                        } else if(personas[i].calcularMC() == -1){
                            System.out.println("La persona " +(i+1)+ " Esta por debajo de su peso ideal");
                        }

                        if (personas[i].esMayorDeEdad()) {
                            System.out.println("La persona " +(i+1)+ " Es mayor de edad");
                        } else {
                            System.out.println("La persona " +(i+1)+ " No es mayor de edad");
                        }
                        System.out.println(personas[i].toAString());
                    }

                    break;
                case "16":
                    Electrodomestico[] electrodomesticos = new Electrodomestico[10];
                    electrodomesticos[0] = new Electrodomestico(200, 60, "blanco", 'd');
                    electrodomesticos[1] = new Lavadora(200, 60, "blanco", 'd',40);
                    electrodomesticos[2] = new Televisor(200, 60, "blanco", 'd',50,true);
                    electrodomesticos[3] = new Electrodomestico(200, 60, "blanco", 'd');
                    electrodomesticos[4] = new Lavadora(200, 60, "blanco", 'd',40);
                    electrodomesticos[5] = new Televisor(200, 60, "blanco", 'd',50,true);
                    electrodomesticos[6] = new Electrodomestico(200, 60, "blanco", 'd');
                    electrodomesticos[7] = new Lavadora(200, 60, "blanco", 'd',40);
                    electrodomesticos[8] = new Televisor(200, 60, "blanco", 'd',50,true);
                    electrodomesticos[9] = new Electrodomestico(200, 60, "blanco", 'd');

                    double totalFactura = 0, facturaLavadora = 0, facturaTelevisor =0,facturaElectrodomestico=0;
                    for (int i = 0; i < electrodomesticos.length; i++) {
                        if (electrodomesticos[i] instanceof Lavadora){
                            facturaLavadora += electrodomesticos[i].getPrecioTotal();
                        } else if (electrodomesticos[i] instanceof Televisor){
                            facturaTelevisor += electrodomesticos[i].getPrecioTotal();
                        } else {
                            facturaElectrodomestico += electrodomesticos[i].getPrecioTotal();
                        }
                    }
                    totalFactura = facturaElectrodomestico+facturaLavadora+facturaTelevisor;

                    System.out.println("Precio final: " + totalFactura + " euros en electrodomesticos");
                    System.out.println("Precio final: " + facturaLavadora + " euros en lavadoras");
                    System.out.println("Precio final: " + facturaTelevisor + " euros en televisores");

                    break;
                case "17":
                    Serie[] series = new Serie[5];
                    Videojuego[] videojuegos = new Videojuego[5];
                    series[0] = new Serie("Vikings",7,false,"Guerra ","Michael Hirstt");
                    series[1] = new Serie("The office",8,false,"Comedia","Greg Daniels");
                    series[2] = new Serie("Naruto",9,false,"Aventuras","Kishimoto");
                    series[3] = new Serie("Dragon Ball",6,false,"Aventuras","Toriyama");
                    series[4] = new Serie("One piece",8,false,"Aventuras","Oda");
                    videojuegos[0] = new Videojuego("Assassin's creed odyssey",50,"Ubisoft");
                    videojuegos[1] = new Videojuego("GTA: San andreas",47,"Rockstar");
                    videojuegos[2] = new Videojuego("Red dead redemption 2",40,"Rockstar");
                    videojuegos[3] = new Videojuego("Fallout 76",34,"Bethesda");
                    videojuegos[4] = new Videojuego("Skyrim",30,"Bethesda");
                    series[0].entregar();
                    series[1].entregar();
                    videojuegos[0].entregar();
                    videojuegos[1].entregar();
                    videojuegos[2].entregar();
                    double contadorEntregadosSeries = 0,contadorEntregadosVideojuegos = 0;
                    int masTemporadas=0, masHoras=0;
                    for (int i = 0; i < series.length; i++) {
                        if (series[i].isEntregado()) {
                            contadorEntregadosSeries++;
                            series[i].devolver();
                        }

                        if (series[masTemporadas].getNumeroDeTemporadas() < series[i].getNumeroDeTemporadas()){
                            masTemporadas = i;
                        }
                    }
                    for (int i = 0; i < videojuegos.length; i++) {
                        if (videojuegos[i].isEntregado()) {
                            contadorEntregadosVideojuegos++;
                            videojuegos[i].devolver();
                        }
                        if (videojuegos[masHoras].getHorasEstimadas() <= videojuegos[i].getHorasEstimadas()){
                            masHoras = i;
                        }
                    }
                    System.out.println("Se entregaron: " +contadorEntregadosSeries+ " Series");
                    System.out.println("Se entregaron: " +contadorEntregadosVideojuegos+ " Videojuegos");

                    System.out.println("La serie con mas temporadas es la " + series[masTemporadas].toString());
                    System.out.println("El videojuego con mas horas estimadas es el " + videojuegos[masHoras].toString());


                    break;
                case "0":
                    System.out.println("Have a good day");
                    running = false;
                    break;
                default:
                    System.out.println("INCORRECT OPTION");
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