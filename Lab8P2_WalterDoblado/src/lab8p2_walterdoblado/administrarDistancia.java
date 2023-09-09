package lab8p2_walterdoblado;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;

public class administrarDistancia extends Thread {

    private JProgressBar progBar_t;
    private JProgressBar progBar_d;
    private int sp_velocidad;
    private boolean avanzar;
    private boolean vive;

    public administrarDistancia(JProgressBar progBar_t,
            JProgressBar progBar_d, int sp_velocidad) {
        this.progBar_t = progBar_t;
        this.progBar_d = progBar_d;
        this.sp_velocidad = sp_velocidad;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                progBar_d.setValue(Math.round(sp_velocidad
                        *10)
                );
                progBar_d.setString(Integer.toString(
                        progBar_d.getValue()) + " metros");

            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {

            }
        }

    }

}
