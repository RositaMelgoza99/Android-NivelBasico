public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private  double precio;
    private double descuento;

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
}
