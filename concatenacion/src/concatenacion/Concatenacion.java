/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concatenacion;

import java.util.Scanner;

/**
Este metodo se va encargar de : Solicitar al usuario nombre y apellidos que a continuación se mostraran por pantalla 
 */
public class Concatenacion {
static Scanner dato = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\nIntroduce tu Nombre. \n");
        String datos = dato.nextLine();
        System.out.println("\nIntroduce tu apellido\n");
        String datos2 = dato.nextLine();
        System.out.println(datos + datos2);
    }
    
}
