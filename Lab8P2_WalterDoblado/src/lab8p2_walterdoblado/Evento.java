package lab8p2_walterdoblado;

import java.io.Serializable;

public class Evento implements Serializable{

    private String estilo;
    private int distancia;
    private int recordactual;

    public Evento()  {
    }

    public Evento(String estilo, int distancia, int recordactual) {
        this.estilo = estilo;
        this.distancia = distancia;
        this.recordactual = recordactual;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getRecordactual() {
        return recordactual;
    }

    public void setRecordactual(int recordactual) {
        this.recordactual = recordactual;
    }

    @Override
    public String toString() {
        return "Evento{" + "estilo=" + estilo + ", distancia=" + distancia + ", recordactual=" + recordactual + '}';
    }

}
