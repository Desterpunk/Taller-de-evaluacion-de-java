package com.sofka;

public class Lavadora extends Electrodomestico{
    private double carga;
    private double precioCarga;

    public Lavadora() {
        super();
        this.carga = 5;
        setPrecioCarga();
        setPrecioTotal();
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase,peso);
        this.carga = 5;
        setPrecioCarga();
        setPrecioTotal();
    }

    public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga){
        super(precioBase,peso,color,consumoEnergetico);
        this.carga = carga;
        setPrecioCarga();
        setPrecioTotal();
    }

    public double getCarga() {
        return carga;
    }

    public double getPrecioCarga() {
        return precioCarga;
    }

    public void setPrecioCarga(){
        if (this.carga > 30){
            this.precioCarga = 50;
        } else {
            this.precioCarga = 0;
        }
    }

    public void setPrecioTotal() {
        this.precioTotal = this.getPrecioBase()+this.getPrecioConsumoEnergetico()+this.getPrecioPeso()+this.precioCarga;
    }
}
