package com.example.android_nivelbasico;

import com.example.android_nivelbasico.Auto;

public class Autobus extends Auto {


    private  int cantPasajeros;
    private double altura;
    private  int numPuertas;



   public Autobus(String marca, String modelo, String color, String matricula, double precio, double descuento, int cantPasajeros
                 , double altura, int numPuertas){
       super(marca, modelo, color, matricula, precio, descuento);
       this.cantPasajeros = cantPasajeros;
        this.altura= altura;
        this.numPuertas = numPuertas;

   }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public double getAltura() {
        return altura;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
/////////////// IMPLEMENTAR METODOS
    @Override
    public void Arrancar() {
        super.Arrancar();
    }

    @Override
    public void Detenerse() {
        super.Detenerse();
    }

    @Override
    public void Acelerar() {
        super.Acelerar();
    }

    @Override
    public void Frenar() {
        super.Frenar();
    }

    @Override
    public void verPrecio() {
        super.verPrecio();
    }

    @Override
    public void verDescuento() {
        super.verDescuento();
    }
}
