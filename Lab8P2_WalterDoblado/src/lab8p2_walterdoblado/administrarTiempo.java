package lab8p2_walterdoblado;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JProgressBar;

public class administrarTiempo extends Thread {

    private JProgressBar progBar;
    private boolean avanzar;
    private boolean vive;
 

    public administrarTiempo(JProgressBar progBar) {
        this.progBar = progBar;
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
                Scanner l = new Scanner(System.in);
                Random r = new Random();
              int f   = 1+ r.nextInt(13);
                progBar.setValue(progBar.getValue() + f);
                
                //activar y modificar propiedad stringPainted para que esto funciones
                progBar.setString(Integer.toString(progBar.getValue()) );
                
                System.out.println(progBar.getValue());

            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }

    }

}
