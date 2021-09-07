package com.sofka;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private String DNI;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
        this.DNI = generarDNI();
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        this.DNI = generarDNI();
    }
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.DNI = generarDNI();
    }

    public int calcularMC(){
        double pesoIdeal = this.peso/(Math.pow(this.altura,2));
        if (Math.round(pesoIdeal) < 20){
            return -1;
        } else if(Math.round(pesoIdeal) >= 20 || Math.round(pesoIdeal) <= 25){
            return 0;
        } else if(Math.round(pesoIdeal) > 25){
            return 1;
        } else {
            return 0;
        }
    }
    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
    public void comprobarSexo(char sexo){
        if (sexo == this.sexo){
            this.sexo = sexo;
        } else {
            this.sexo = 'H';
        }
    }

    public String toAString() {
        return "Nombre: " +this.nombre+  " Edad: " + this.edad + " Sexo: " +this.sexo+
                " Peso: " +this.peso+ " Altura: " +this.altura+ " DNI: " + this.DNI;
    }
    public String generarDNI(){
        double eigthDigits = 0 + Math.random() * 99999999;
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        return String.valueOf((int) eigthDigits)+c;
    }

}
