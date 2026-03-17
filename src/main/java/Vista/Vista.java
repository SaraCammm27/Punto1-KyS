/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Vista {
    
    private Scanner scanner;
    
    public Vista(){
        scanner = new Scanner(System.in);
    }

public int pedirNota(){
System.out.print("Ingrese la nota (0 a 10): ");
return scanner.nextInt();
}
public void mostrarResultado(String resultado){

    System.out.println("Su puntaje es: "+resultado);

}
    
    
    
    
}
