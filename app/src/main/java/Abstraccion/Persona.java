package Abstraccion;

public  abstract class Persona {
    private   String nombre ;
    private    String apellidoPaterno ;
    private   String  apellidoMaterno ;
    private   String RFC;
    private   int edad;
    private int telefono;
    private String nacionalidad;
    private String direcion ;
    private   int numeroIne;
    private   char sexo;
    private   String peliculaFav;
    private   String actorFav;
    private   String comidaFav;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String RFC, int telefono, String nacionalidad, String direcion, int numeroIne, char sexo) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.RFC = RFC;
        this.telefono = telefono;
        this.nacionalidad = nacionalidad;
        this.direcion = direcion;
        this.numeroIne = numeroIne;
        this.sexo = sexo;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getRFC() {
        return RFC;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDirecion() {
        return direcion;
    }

    public int getNumeroIne() {
        return numeroIne;
    }

    public char getSexo() {
        return sexo;
    }

    public String getPeliculaFav() {
        return peliculaFav;
    }

    public String getActorFav() {
        return actorFav;
    }

    public String getComidaFav() {
        return comidaFav;
    }
}
