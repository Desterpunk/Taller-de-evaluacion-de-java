package com.sofka;

public class Televisor extends Electrodomestico {
    private double resolucion, precioResolucion, precioTdt;
    private boolean tdt;

    public Televisor(){
        super();
        this.resolucion = 20;
        this.tdt = false;
        setPrecioTdt();
        setPrecioTamano();
        setPrecioTotal();
    }
    public Televisor(double precioBase, double peso){
        super(precioBase,peso);
        this.resolucion = 20;
        this.tdt = false;
        setPrecioTdt();
        setPrecioTamano();
        setPrecioTotal();
    }
    public Televisor(double precioBase, double peso, String color, char consumoEnergetico, double resolucion, boolean tdt) {
        super(precioBase,peso,color,consumoEnergetico);
        this.resolucion = resolucion;
        this.tdt = tdt;
        setPrecioTdt();
        setPrecioTamano();
        setPrecioTotal();
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public double getPrecioResolucion() {
        return precioResolucion;
    }

    public double getPrecioTdt() {
        return precioTdt;
    }

    public void setPrecioTamano(){
        if (this.resolucion > 40){
            this.precioResolucion = this.getPrecioTotal()*0.3;
        } else {
            this.precioResolucion = 0;
        }
    }
    public void setPrecioTdt() {
        if (this.tdt) {
            this.precioTdt = 50;
        } else {
            this.precioTdt = 0;
        }
    }
    public void setPrecioTotal() {
        this.precioTotal = this.getPrecioBase()+this.getPrecioConsumoEnergetico()+this.getPrecioPeso()+this.precioResolucion+this.precioTdt;
    }

}