/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjemplosClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este método es el principal de mi proyecto
        // No olvidar ingresar valores
        
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Por favor ingresar sus nombres");
        nombre = entrada.next();
        System.out.println("Por favor ingresar sus apellidos");
        apellido = entrada.next();
        
        System.out.println("Su nombre es: "+nombre+"\n\n\t Su apellido "
                + "es: " + apellido);
                
        
                
    }
    
}












