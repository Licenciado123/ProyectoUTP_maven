/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoutp;

/**
 *
 * @author ESTEBAN MEJIA
 */
public class Empleado {
    int id;
    String nombre;
    String telefono;
    String estado;
    String user;
    String contraseña;
    
    public Empleado() {    
    }
    
    public Empleado(int id, String nombre, String telefono, String estado, String user, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public String getUser() {
        return user;
    }

    public String getContraseña() {
        return contraseña;
    }  
}
