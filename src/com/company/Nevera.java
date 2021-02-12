package com.company;

public class Nevera extends Electrodoméstico{

    protected int capacidad;

    public  Nevera (int capacidad, String consumo, String procedencia){
        super(consumo, procedencia);
        this.capacidad = capacidad;
    }

    public void calcularPrecio(){
        if (capacidad>120){
            precio = (((capacidad - 120)/10)*(precio * 0.05)) + precio;
        }
    }





}
