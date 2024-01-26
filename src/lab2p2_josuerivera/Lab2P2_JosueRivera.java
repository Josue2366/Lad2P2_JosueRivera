/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_josuerivera;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Lab2P2_JosueRivera {
static Scanner sc= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("////MENU/////");
        System.out.println("1. iniciar seccion");
        System.out.println("2. Salir");
        int respuesta = sc.nextInt();
        while (respuesta < 1|| respuesta > 2){
            System.out.println("////MENU/////");
            System.out.println("1. iniciar seccion");
            System.out.println("2. Salir");
            respuesta = sc.nextInt();
        }
        while(respuesta != 2){
            System.out.println("ok1");
            break;
        }
    }
    
}
