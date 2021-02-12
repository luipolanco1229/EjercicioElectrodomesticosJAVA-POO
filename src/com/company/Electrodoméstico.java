package com.company;

public class Electrodoméstico {

    protected String consumo;
    protected String procedencia;
    protected double precio;


    public Electrodoméstico(String consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
        this.precio = 0;
    }


    public double tipoConsumo (){

        switch (consumo){
            case "A": precio = precio + 450000; break;
            case "B": precio = precio + 350000; break;
            case "C": precio = precio + 250000; break;
            default:
                System.out.println("No ingresaste un valor válido");
        }
        return precio;
    }
    public double tipoProcedencia (){

        switch (procedencia){
            case "nacional": precio = precio + 250000; break;
            case "importado": precio = precio + 350000; break;
            default:
                System.out.println("No ingresaste un valor válido");
        }
        return precio;
    }
    public double getPrecio() {
        return precio;
    }



}
