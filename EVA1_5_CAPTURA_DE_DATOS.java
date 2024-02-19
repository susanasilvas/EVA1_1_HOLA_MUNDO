/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura_de_datos;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA1_5_CAPTURA_DE_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        // DECLARAR NUESTRA VARIABLE
        String nombre;
        int edad;
        System.out.println("Introduce tu nombre:");
        //CREAR NUESTRO SCANNER
        Scanner captura = new Scanner(System.in);
        //CAPTURA
        nombre = captura.nextLine();
        System.out.println("Introduce tu edad");
        edad = captura.nextInt();
        System.out.println("Tu nombre es:");
        System.out.println(nombre);
        System.out.println("Tu edad es:s");
        System.out.println(edad);
    }
    
}
