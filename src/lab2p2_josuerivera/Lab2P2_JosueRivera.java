/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_josuerivera;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Lab2P2_JosueRivera {
static Scanner sc= new Scanner(System.in);
static Scanner cs = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont= 0;
        ArrayList <Usuario> usuarios = new ArrayList();
        Usuario user = new Usuario("Josue","Jroberto66","Estudiantes");
        Usuario user_2 = new Usuario("Diego","D_Rosales","Maestro");
        Usuario user_3 = new Usuario ("Luis","LFCS","Biblotecario");
        usuarios.add(user);
        usuarios.add(user_2);
        usuarios.add(user_3);
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
            System.out.println("Ingrese nombre de usuario:");
            String nombre = cs.next();
            System.out.println("Ingrese la contrase;;");
            String contraseña = cs.next();
            for (int i = 0; i < usuarios.size(); i++) {
                if (nombre.equals(usuarios.get(i).getName())){
                    if (contraseña.equals(usuarios.get(i).getContraseña())){
                        cont = 1;
                    }
                    else{
                        continue;
                    }
                        
                }
                else{
                    continue;
                }
            }
            if (cont == 1){
                cont = 0;
                
            }
            else{
                System.out.println("////MENU/////");
                System.out.println("1. iniciar seccion");
                System.out.println("2. Salir");
                respuesta = sc.nextInt();
            }
            
        }
    }
    
}
