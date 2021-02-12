package com.company;

import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String consumo;
        String procedencia;
        String sintonizador;
        double precio;
        int capacidad;
        int pulgadas;
        int i = 0;
        int cantidadNeveras = 0;
        int cantidadTelevisores = 0;
        double totalNeveras = 0;
        double totalTelevisores = 0;
        double totalElectrodomesticos = 0;

        Map<Integer, Nevera> mapNeveras = new LinkedHashMap<Integer, Nevera>();
        Map<Integer, Televisor> mapTelevisores = new LinkedHashMap<Integer, Televisor>();


        while (i!=4) {
            i = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el electrodoméstico: \n " +
                    "1. Neveras\n " +
                    "2. Televisores\n" +
                    "3. Facturación \n" +
                    "4. Salir"
            ));

            switch (i) {
                case 1:
                    capacidad = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ingrese la capacidad de la nevera"));
                    consumo = (JOptionPane.showInputDialog(
                            "Ingrese el consumo de la nevera"));
                    procedencia = (JOptionPane.showInputDialog(
                            "Ingrese la procedencia de la nevera"));


                    Nevera eleccionNevera = new Nevera(capacidad, consumo, procedencia);
                    eleccionNevera.tipoProcedencia();
                    eleccionNevera.tipoConsumo();
                    eleccionNevera.calcularPrecio();
                    System.out.println(eleccionNevera.getPrecio());
                    mapNeveras.put(cantidadNeveras, eleccionNevera );
                    cantidadNeveras++;
                    totalNeveras += eleccionNevera.getPrecio();
                    break;

                case 2:
                    pulgadas = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ingrese las pulgadas del televisor"));
                    sintonizador = (JOptionPane.showInputDialog(
                            "Ingrese si o no según corresponda a la presencia de el sintonizador "));
                    consumo = (JOptionPane.showInputDialog(
                            "Ingrese el consumo de la nevera"));
                    procedencia = (JOptionPane.showInputDialog(
                            "Ingrese la procedencia de la nevera"));

                    Televisor eleccionTelevisor = new Televisor(pulgadas, sintonizador, consumo, procedencia);
                    eleccionTelevisor.tipoProcedencia();
                    eleccionTelevisor.tipoConsumo();
                    eleccionTelevisor.calcularPulgadas();
                    eleccionTelevisor.presenciaSintonizador();
                    System.out.println(eleccionTelevisor.getPrecio());
                    mapTelevisores.put(cantidadTelevisores, eleccionTelevisor);
                    cantidadTelevisores++;
                    totalTelevisores += eleccionTelevisor.getPrecio();
                    break;

                case 3:
                    System.out.println("La cantidad de neveras vendidas fueron: "+ cantidadNeveras +
                            " por un total de $" + totalNeveras);
                    System.out.println("La cantidad de televisores vendidos fueron: "+ cantidadTelevisores +
                            " por un total de $" + totalTelevisores);
                    totalElectrodomesticos = totalNeveras + totalTelevisores;
                    System.out.println("En total se vendio un total de: $" + totalElectrodomesticos);



            }
        }
    }


}
