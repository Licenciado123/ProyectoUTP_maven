/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulos;

/**
 *
 * @author ESTEBAN MEJIA
 */
public class Empleado {
    int id;
    String nombre;
    String telefono;
    String user;
    String contraseña;
    
    public Empleado() {    
    }
    
    public Empleado(int id, String nombre, String telefono, String user, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.user = user;
        this.contraseña = contraseña;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
        
    public String getUser() {
        return user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
