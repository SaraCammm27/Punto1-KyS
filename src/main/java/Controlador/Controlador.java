/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Controlador;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author kevin
 */

public class Controlador {

    public static void main(String[] args) {
    Vista Vista = new Vista();
        Modelo modelo = new Modelo();
        
        int nota = Vista.pedirNota();
        
        modelo.setNota(nota);
        
        String resultado = modelo.clasificarNota();
        
        Vista.mostrarResultado(resultado);
    
    
    }
    
    
    
}
