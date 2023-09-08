package lab8p2_walterdoblado;

public class Nadador {

    private String nombre;
    private String nacionalida;
    private int edad;
    private int estatupra;
    private String estilo;
    private String distanciacomp;
    private int tiempoBest;

    private int numMedallas;

    public Nadador() {
    }

    public Nadador(String nombre, String nacionalida, int edad, int estatupra, String estilo, String distanciacomp, int tiempoBest, int numMedallas) {
        this.nombre = nombre;
        this.nacionalida = nacionalida;
        this.edad = edad;
        this.estatupra = estatupra;
        this.estilo = estilo;
        this.distanciacomp = distanciacomp;
        this.tiempoBest = tiempoBest;
        this.numMedallas = numMedallas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalida() {
        return nacionalida;
    }

    public void setNacionalida(String nacionalida) {
        this.nacionalida = nacionalida;
    }

    public int getEstatupra() {
        return estatupra;
    }

    public void setEstatupra(int estatupra) {
        this.estatupra = estatupra;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getDistanciacomp() {
        return distanciacomp;
    }

    public void setDistanciacomp(String distanciacomp) {
        this.distanciacomp = distanciacomp;
    }

    public int getTiempoBest() {
        return tiempoBest;
    }

    public void setTiempoBest(int tiempoBest) {
        this.tiempoBest = tiempoBest;
    }

    public int getNumMedallas() {
        return numMedallas;
    }

    public void setNumMedallas(int numMedallas) {
        this.numMedallas = numMedallas;
    }

    @Override
    public String toString() {
        return "Nadador{" + "nombre=" + nombre + ", nacionalida=" + nacionalida + ", estatupra=" + estatupra + ", estilo=" + estilo + ", distanciacomp=" + distanciacomp + ", tiempoBest=" + tiempoBest + ", numMedallas=" + numMedallas + '}';
    }

}
