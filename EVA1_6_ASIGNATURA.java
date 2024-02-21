/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA1_6_ASIGNATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //clave, nombre, creditos, hrteo,hrPr, carera
        String clave, nombre, carrera;
        int creditos, horasTeo, horasPrac;
        boolean tipoMat;
        // capturar
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la clave de la asignatura:");
        clave = captu.nextLine();
        System.out.println("Introduce la nombre de la asignatura:");
        nombre = captu.nextLine(); 
        System.out.println("Introduce la carrera de la asignatura:");
        carrera = captu.nextLine();
        System.out.println("Introduce los creditos de la asignatura:");
        creditos = captu.nextInt();
        System.out.println("Introduce los horasTeo de la asignatura:");
        horasTeo = captu.nextInt();
        System.out.println("Introduce los horasPrac de la asignatura:");
        horasPrac = captu.nextInt();
         System.out.println("Introduce el tipo de asignatura:");
         tipoMat = captu.nextBoolean();
         
         //HACER ALGO CON LOS DATOS CAPTURADOS
         System.out.println("DATOS DE LA ASIGNATURA");
         System.out.println(clave);
         System.out.println(nombre);
         System.out.println(carrera);
         System.out.println(creditos);
         System.out.println(horasTeo);
         System.out.println(horasPrac);
         System.out.println(tipoMat);
         
    }
    
}
