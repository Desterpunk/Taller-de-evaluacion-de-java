package com.sofka;

import javax.swing.*;

public class Electrodomestico {
    private double precioBase;
    private double peso;
    private String color;
    private char consumoEnergetico;
    private double precioConsumoEnergetico;
    private double precioPeso;
    protected double precioTotal;


    public Electrodomestico() {
        this.precioBase = 100;
        this.peso = 5;
        this.color = "blanco";
        this.consumoEnergetico = 'f';
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
        setPrecioConsumoEnergetico();
        setPrecioPeso();
        setPrecioTotal();
    }
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = 'f';
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
        setPrecioConsumoEnergetico();
        setPrecioPeso();
        setPrecioTotal();
    }
    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
        setPrecioConsumoEnergetico();
        setPrecioPeso();
        setPrecioTotal();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPrecioConsumoEnergetico() {
        return precioConsumoEnergetico;
    }

    public double getPrecioPeso() {
        return precioPeso;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void comprobarConsumoEnergetico(char letra){
        if (Character.toLowerCase(letra) != 'a' && Character.toLowerCase(letra) != 'b' && Character.toLowerCase(letra) != 'c' &&
                Character.toLowerCase(letra) != 'd' && Character.toLowerCase(letra) != 'e' && Character.toLowerCase(letra) != 'f'){
            this.consumoEnergetico = 'f';
        }
    }
    public void comprobarColor(String color){
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") ||
                color.equalsIgnoreCase("azul ") || color.equalsIgnoreCase("gris")){
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }
    public void setPrecioConsumoEnergetico(){
        switch (Character.toLowerCase(this.consumoEnergetico)){
            case 'a':
                this.precioConsumoEnergetico = 100;
                break;
            case 'b':
                this.precioConsumoEnergetico = 80;
                break;
            case 'c':
                this.precioConsumoEnergetico = 60;
                break;
            case 'd':
                this.precioConsumoEnergetico = 50;
                break;
            case 'e':
                this.precioConsumoEnergetico = 30;
                break;
            default:
                this.precioConsumoEnergetico = 10;
                break;
        }
    }

    public void setPrecioPeso(){
        if (this.peso < 19){
            this.precioPeso = 10;
        } else if (this.peso >= 20 && this.peso <= 49){
            this.precioPeso = 50;
        } else if (this.peso >= 50 && this.peso <= 79){
            this.precioPeso = 80;
        } else if (this.peso > 79){
            this.precioPeso = 100;
        } else {
            this.precioPeso = 0;
        }
    }

    public void setPrecioTotal(){
        this.precioTotal = this.precioBase + this.precioConsumoEnergetico + this.precioPeso;
    }
}