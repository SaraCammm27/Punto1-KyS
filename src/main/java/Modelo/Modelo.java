/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author kevin
 */
public class Modelo {

    private int nota;

    public String clasificarNota() {
        if (nota >= 0 && nota <= 4) {
            return "Insuficiente";
        } else if (nota <= 6) {
            return "Suficiente";
        } else if (nota <= 9) {
            return "Bien";
        } else if (nota == 10) {
            return "Excelente";
        } else {
            return "Nota inválida";

        }

    }
    
    public Modelo() {
    }

    public Modelo(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    
    
    
    
}
