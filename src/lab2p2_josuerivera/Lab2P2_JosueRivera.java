/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_josuerivera;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Lab2P2_JosueRivera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);//numeros
        Scanner cs = new Scanner(System.in);//Strings
        String tipo = "";
        int cont= 0;
        ArrayList <Object> biblioteca = new ArrayList();
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
                    System.out.println("2. Salir");
                    System.out.println("Ingrese su opcion:");
                    opcion = sc.nextInt();
                    while(opcion < 1 || opcion >2){
                        
                        System.out.println("////MENU////");
                        System.out.println("1. Lista");
                        System.out.println("2. Salir");
                        System.out.println("Ingrese su opcion:");
                        opcion = sc.nextInt();
                    }
                    
                    
                }
                else if(tipo.equals("Maestro")){
                    System.out.println("////MENU////");
                    System.out.println("1. Lista");
                    System.out.println("2. crear");
                    System.out.println("3. Salir");
                    System.out.println("Ingrese su opcion:");
                    opcion = sc.nextInt();
                    while(opcion < 1 || opcion >3){
                        
                        System.out.println("////MENU////");
                        System.out.println("1. Lista");
                        System.out.println("2. crear");
                        System.out.println("3. Salir");
                        System.out.println("Ingrese su opcion:");
                        opcion = sc.nextInt();
                    }
                }
                else if (tipo.equals("Biblotecario")){
                    System.out.println("////MENU////");
                    System.out.println("1. Lista");
                    System.out.println("2. crear");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Modificar");
                    System.out.println("5. Salir");
                    System.out.println("Ingrese su opcion:");
                    opcion = sc.nextInt();
                    while(opcion < 1 || opcion >5){
                        
                        System.out.println("////MENU////");
                        System.out.println("1. Lista");
                        System.out.println("2. crear");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Modificar");
                        System.out.println("5. Salir");
                        System.out.println("Ingrese su opcion:");
                        opcion = sc.nextInt();
                    }
                    while (opcion != 5){
                        switch (opcion){
                            case 1:
                                listar(biblioteca);
                                break;
                                
                            case 2:
                                System.out.println("////MENU////");
                                System.out.println("1. Libros");
                                System.out.println("2. Articulos");
                                System.out.println("3. Cursoso en linea");
                                System.out.println("4. Conferencias virtuales");
                                int opcion2 = sc.nextInt();
                                while(opcion2 < 1 || opcion2 > 4){
                                    System.out.println("////MENU////");
                                    System.out.println("1. Libros");
                                    System.out.println("2. Articulos");
                                    System.out.println("3. Cursoso en linea");
                                    System.out.println("4. Conferencias virtuales");
                                    opcion2 = sc.nextInt();
                                }
                                switch (opcion2){
                                    case 1:
                                        System.out.println("Introduzca el titulo:");
                                        String titulo = cs.next();
                                        System.out.println("Introduzca el autor:");
                                        String autor = cs.next();
                                        System.out.println("introduzca el genero:");
                                        String genero = cs.next();
                                        System.out.println("introduzca el año");
                                        String año = cs.next();
                                        System.out.println("Introduzca su disponibilidad");
                                        String dispo = cs.next();
                                        Libros libro = new Libros(titulo,autor,genero,año,dispo);
                                        biblioteca.add(libro);
                                        break;
                                        
                                    case 2 :
                                        System.out.println("Introduzca el titulo:");
                                        titulo = cs.next();
                                        System.out.println("Introduzca el autor:");
                                        autor = cs.next();
                                        System.out.println("introduzca el tema:");
                                        String tema = cs.next();
                                        System.out.println("introduzca la fecha en el formato dd/MM/yyyy");
                                        String fn = cs.next();
                                        SimpleDateFormat formato_dia = new SimpleDateFormat(
                                                "dd/MM/yyyy");
                                        Date fecha = formato_dia.parse(fn);
                                        System.out.println("Introduzca su disponibilidad");
                                        dispo = cs.next();
                                        Articulos articulo = new Articulos(titulo,autor,tema,fecha,dispo);
                                        biblioteca.add(articulo);
                                        break;
                                        
                                    case 3:
                                        System.out.println("Introduzca el titulo:");
                                        titulo = cs.next();
                                        System.out.println("Introduzca el instructor:");
                                        String instructor = cs.next();
                                        System.out.println("Duracion en semanas:");
                                        int semanas = sc.nextInt();
                                        System.out.println("Plataforma de enseñanza");
                                        String plataforma = cs.next();
                                        Cursos_En_Linea curso = new Cursos_En_Linea(titulo,instructor,semanas,plataforma);
                                        biblioteca.add(curso);
                                        break;
                                        
                                    case 4:
                                        System.out.println("Introduzca el titulo:");
                                        titulo = cs.next();
                                        System.out.println("Introduzca el conferencista");
                                        String confe = cs.next();
                                        System.out.println("fecha");
                                        fn = cs.next();
                                        formato_dia = new SimpleDateFormat(
                                                "dd/MM/yyyy");
                                        fecha = formato_dia.parse(fn);
                                        System.out.println("Introduzca la duracion del curso");
                                        int duracion = sc.nextInt();
                                        System.out.println("Introduzca el enlace del curso");
                                        String enlace = cs.next();
                                        Conferencias_Virtuales conferencia = new Conferencias_Virtuales(titulo,confe,fecha,duracion,enlace);
                                        biblioteca.add(conferencia);
                                        break;
                                        
                                        
                                }
                                
                        }
                                System.out.println("////MENU////");
                                System.out.println("1. Lista");
                                System.out.println("2. crear");
                                System.out.println("3. Eliminar");
                                System.out.println("4. Modificar");
                                System.out.println("5. Salir");
                                System.out.println("Ingrese su opcion:");
                                opcion = sc.nextInt();
                        
                    }
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
    public static void listar(ArrayList<Object> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    
}
