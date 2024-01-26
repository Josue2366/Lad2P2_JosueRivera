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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);//numeros
        Scanner cs = new Scanner(System.in);//Strings
        String tipo = "";
        int cont= 0;
        ArrayList <Usuario> usuarios = new ArrayList();
        // se crean los usuarios
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
                System.out.println("Usuario existente");
                int opcion = 0;
                cont = 0;
                if (nombre.equals("Josue")){
                    tipo = "Estudiantes";
                }
                else if (nombre.equals("Diego")){
                    tipo = "Maestro";
                }
                else if (nombre.equals("Luis")){
                    tipo = "Biblotecario";
                }
                if (tipo.equals("Estudiantes")){
                    System.out.println("////MENU////");
                    System.out.println("1. Lista");
                    System.out.println("Ingrese su opcion:");
                    opcion = sc.nextInt();
                }
                else if(tipo.equals("Maestro")){
                    System.out.println("////MENU////");
                    System.out.println("1. Lista");
                    System.out.println("2. crear");
                    System.out.println("Ingrese su opcion:");
                    opcion = sc.nextInt();
                }
                else if (tipo.equals("Biblotecario")){
                    System.out.println("////MENU////");
                    System.out.println("1. Lista");
                    System.out.println("2. crear");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Modificar");
                    System.out.println("Ingrese su opcion:");
                    opcion = sc.nextInt();
                }
                    
            }
            else{
                System.out.println("Usuario no registrado");
                System.out.println("////MENU/////");
                System.out.println("1. iniciar seccion");
                System.out.println("2. Salir");
                respuesta = sc.nextInt();
            }
            
        }
    }
    
}
