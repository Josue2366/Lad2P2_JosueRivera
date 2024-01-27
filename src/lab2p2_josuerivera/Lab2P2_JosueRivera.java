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
            System.out.println("Ingrese la contraseña");
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
                    while(opcion == 1){
                        switch(opcion){
                            case 1:
                                if (biblioteca.isEmpty()){
                                    System.out.println("La biblioteca esta vasia");
                                    break;
                                }else{
                                    listar(biblioteca);
                                    break;
                                }
                                
                        }
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
                    if (opcion == 2){
                        System.out.println("////MENU/////");
                        System.out.println("1. iniciar seccion");
                        System.out.println("2. Salir");
                        respuesta = sc.nextInt();
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
                    while(opcion> 0 && opcion <3){
                        switch (opcion){
                            case 1:
                                if (biblioteca.isEmpty()){
                                    System.out.println("La biblioteca esta vasia");
                                    break;
                                }
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
                                break;
                        }
                        System.out.println("////MENU////");
                        System.out.println("1. Lista");
                        System.out.println("2. crear");
                        System.out.println("3. Salir");
                        System.out.println("Ingrese su opcion:");
                        opcion = sc.nextInt();
                    }
                    if (opcion == 3){
                        System.out.println("////MENU/////");
                        System.out.println("1. iniciar seccion");
                        System.out.println("2. Salir");
                        respuesta = sc.nextInt();
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
                                if (biblioteca.isEmpty()){
                                    System.out.println("La biblioteca esta vasia");
                                    break;
                                }
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
                                break;
                            case 3:
                                if (biblioteca.isEmpty()){
                                    System.out.println("La biblioteca esta vasia");
                                    break;
                                }
                                listar(biblioteca);
                                System.out.println("Introduzca su opcion para eliminar:");
                                int eliminar = sc.nextInt();
                                while (eliminar < 0 || eliminar >= biblioteca.size()){
                                    listar(biblioteca);
                                    System.out.println("Introduzca su opcion para eliminar:");
                                    eliminar = sc.nextInt();
                                }
                                biblioteca.remove(eliminar);
                                break;
                                
                            case 4:
                                if (biblioteca.isEmpty()){
                                    System.out.println("La biblioteca esta vasia");
                                    break;
                                }
                                listar(biblioteca);
                                System.out.println("introduzca el usuario que quiera modificar:");
                                int modificar = sc.nextInt();
                                while (modificar < 0 || modificar >= biblioteca.size()){
                                    listar(biblioteca);
                                    System.out.println("Introduzca su opcion para modificar:");
                                    modificar = sc.nextInt();
                                }
                                if (biblioteca.get(modificar) instanceof Libros){
                                    
                                    System.out.println("Introduzca el titulo:");
                                    String titulo = cs.next();
                                     ((Libros)biblioteca.get(modificar) ).setTitulo(titulo);
                                    System.out.println("Introduzca el autor:");
                                    String autor = cs.next();
                                    ((Libros)biblioteca.get(modificar) ).setAutor(autor);
                                    System.out.println("introduzca el genero:");
                                    String genero = cs.next();
                                    ((Libros)biblioteca.get(modificar) ).setGenero(genero);
                                    System.out.println("introduzca el año");
                                    String año = cs.next();
                                    ((Libros)biblioteca.get(modificar) ).setAño(año);
                                    System.out.println("Introduzca su disponibilidad");
                                    String dispo = cs.next();
                                    ((Libros)biblioteca.get(modificar) ).setDispo(dispo);
                                    
                                    break;
                                }
                                else if (biblioteca.get(modificar) instanceof Articulos){
                                    System.out.println("Introduzca el titulo:");
                                    String titulo = cs.next();
                                    ((Articulos)biblioteca.get(modificar) ).setTitulo(titulo);
                                    System.out.println("Introduzca el autor:");
                                    String autor = cs.next();
                                    ((Articulos)biblioteca.get(modificar) ).setAutor(autor);
                                    System.out.println("introduzca el tema:");
                                    String tema = cs.next();
                                    ((Articulos)biblioteca.get(modificar) ).setTema(tema);
                                    System.out.println("introduzca la fecha en el formato dd/MM/yyyy");
                                    String fn = cs.next();
                                    SimpleDateFormat formato_dia = new SimpleDateFormat(
                                            "dd/MM/yyyy");
                                    Date fecha = formato_dia.parse(fn);
                                    ((Articulos)biblioteca.get(modificar) ).setFecha(fecha);
                                    System.out.println("Introduzca su disponibilidad");
                                    String dispo = cs.next();
                                    ((Articulos)biblioteca.get(modificar) ).setDispo(dispo);

                                    break;
                                }
                                else if (biblioteca.get(modificar) instanceof Cursos_En_Linea){
                                    System.out.println("Introduzca el titulo:");
                                    String titulo = cs.next();
                                    ((Cursos_En_Linea)biblioteca.get(modificar) ).setTitulo(titulo);
                                    System.out.println("Introduzca el instructor:");
                                    String instructor = cs.next();
                                    ((Cursos_En_Linea)biblioteca.get(modificar) ).setInstructor(instructor);
                                    System.out.println("Duracion en semanas:");
                                    int semanas = sc.nextInt();
                                    ((Cursos_En_Linea)biblioteca.get(modificar) ).setDuracion(semanas);
                                    System.out.println("Plataforma de enseñanza");
                                    String plataforma = cs.next();
                                    ((Cursos_En_Linea)biblioteca.get(modificar) ).setPlataforma(plataforma);
                                    break;
                                }
                                else if (biblioteca.get(modificar) instanceof Cursos_En_Linea){
                                    System.out.println("Introduzca el titulo:");
                                    String titulo = cs.next();
                                    ((Conferencias_Virtuales)biblioteca.get(modificar) ).setTitulo(titulo);
                                    System.out.println("Introduzca el conferencista");
                                    String confe = cs.next();
                                    ((Conferencias_Virtuales)biblioteca.get(modificar) ).setConferencista(confe);
                                    System.out.println("fecha de la conferencia:");
                                    String fn = cs.next();
                                    SimpleDateFormat formato_dia = new SimpleDateFormat(
                                            "dd/MM/yyyy");
                                    Date fecha = formato_dia.parse(fn);
                                    ((Conferencias_Virtuales)biblioteca.get(modificar) ).setFecha(fecha);
                                    System.out.println("Introduzca la duracion del curso");
                                    int duracion = sc.nextInt();
                                    ((Conferencias_Virtuales)biblioteca.get(modificar) ).setDuracion(duracion);
                                    System.out.println("Introduzca el enlace del curso");
                                    String enlace = cs.next();
                                    ((Conferencias_Virtuales)biblioteca.get(modificar) ).setEnlace(enlace);
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
                    if (opcion == 5){
                        System.out.println("////MENU/////");
                        System.out.println("1. iniciar seccion");
                        System.out.println("2. Salir");
                        respuesta = sc.nextInt();
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
        System.out.println("Lista:");
        for (int i = 0; i < lista.size(); i++) {
            
            System.out.println(i +". "+ lista.get(i));
        }
    }
    
}
