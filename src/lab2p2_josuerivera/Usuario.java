/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_josuerivera;

/**
 *
 * @author josue
 */
public class Usuario {
    private String name;
    private String contraseña;
    private String Tipo_User;

    public Usuario(String name, String contraseña, String Tipo_User) {
        this.name = name;
        this.contraseña = contraseña;
        this.Tipo_User = Tipo_User;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipo_User() {
        return Tipo_User;
    }

    public void setTipo_User(String Tipo_User) {
        this.Tipo_User = Tipo_User;
    }
    
}
