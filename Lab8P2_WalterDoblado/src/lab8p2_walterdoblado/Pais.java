/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_walterdoblado;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author walter
 */
public class Pais implements Serializable{

    private String nombre;
    ArrayList<Nadador> nadadore = new ArrayList();
    private int medallas;

    public Pais() {
    }

    public Pais(String nombre, int medallas) {
        this.nombre = nombre;
        this.medallas = medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nadador> getNadadore() {
        return nadadore;
    }

    public void setNadadore(ArrayList<Nadador> nadadore) {
        this.nadadore = nadadore;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return "nombre: "+ nombre + "\n"
                + " nadadore=" + nadadore + "\n"
                + " medallas=" + medallas ;
    }

}
