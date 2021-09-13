package com.example.android_nivelbasico;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private  double precio;
    private double descuento;

    private  double presionLlanta;
    private  double cantLitrosGasolina;
    private  double nivelAceite;

    public Auto(String marca, String modelo, String color, String matricula, double precio, double descuento) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.precio = precio;
        this.descuento = descuento;

    }



    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPresionLlanta() {
        return presionLlanta;
    }

    public double getCantLitros() {
        return cantLitrosGasolina;
    }

    public double getNivelAceite() {
        return nivelAceite;
    }


    public void setPresionLlanta(double presionLlanta) {
        this.presionLlanta = presionLlanta;
    }

    public void setCantLitrosGasolina(double cantLitrosGasolina) {
        this.cantLitrosGasolina = cantLitrosGasolina;
    }

    public void setNivelAceite(double nivelAceite) {
        this.nivelAceite = nivelAceite;
    }

    public void  Arrancar(){

    }

    public void  Detenerse(){

    }

    public void  Acelerar(){

    }

    public void  Frenar(){

    }
    public void  verPrecio(){

    }

    public void  verDescuento(){

    }

    public  String mensaje(){
        return  "Los chevys son muy practicos";
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
