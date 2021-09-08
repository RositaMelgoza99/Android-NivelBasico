public class Grua extends Camion{

    private String tipoGrua;
    public Grua(String marca, String modelo, String color, String matricula, double precio, double descuento, double capCarga, String tamaño, int numRemolque,
             String tipoGrua) {
        super(marca, modelo, color, matricula, precio, descuento, capCarga, tamaño, numRemolque);

        this.tipoGrua = tipoGrua;
    }

    public String getTipoGrua() {
        return tipoGrua;
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
