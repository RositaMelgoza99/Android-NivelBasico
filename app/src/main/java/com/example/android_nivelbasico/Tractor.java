package com.example.android_nivelbasico;

import com.example.android_nivelbasico.Auto;

public class Tractor extends Auto {

    private String tamaño;
    private  double potencia;
    private String tipoCosechadora;
    public Tractor(String marca, String modelo, String color, String matricula, double precio, double descuento,
                   String tamaño, double potencia, String tipoCosechadora) {
        super(marca, modelo, color, matricula, precio, descuento);
        this.tamaño = tamaño;
        this.potencia = potencia;
        this.tipoCosechadora = tipoCosechadora;
    }

    public String getTamaño() {
        return tamaño;
    }

    public double getPotencia() {
        return potencia;
    }

    public String getTipoCosechadora() {
        return tipoCosechadora;
    }
/// IMPLEMENTAR METODOS

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
