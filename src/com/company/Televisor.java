package com.company;

public class Televisor extends Electrodoméstico{

    protected int pulgadas;
    protected String sintonizador;


    public Televisor (int pulgadas, String sintonizador, String consumo, String procedencia){
        super(consumo, procedencia);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public double calcularPulgadas(){
        if (pulgadas>40){
            precio = (precio * 0.30) + precio;
        }
        return  precio;
    }

    public double presenciaSintonizador (){
        switch (sintonizador){
            case "si": precio = precio + 250000;break;
            case "no": precio = precio; break;
            default:
                System.out.println("No ingresaste un valor válido");
        }
        return  precio;
    }

}
