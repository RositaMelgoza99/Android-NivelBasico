package com.example.android_nivelbasico;

import com.example.android_nivelbasico.Auto;

public class Camion extends Auto {

    private double capCarga;
    private String tamaño;
    private  int numRemolque;
    public Camion(String marca, String modelo, String color, String matricula, double precio, double descuento,
                   double capCarga, String tamaño, int numRemolque ) {
        super(marca, modelo, color, matricula, precio, descuento);
        this.capCarga = capCarga;
        this.tamaño = tamaño;
        this.numRemolque = numRemolque;
    }

    public double getCapCarga() {
        return capCarga;
    }

    public String getTamaño() {
        return tamaño;
    }

    public int getNumRemolque() {
        return numRemolque;
    }
// Invocar Metodos de la clase padre
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
