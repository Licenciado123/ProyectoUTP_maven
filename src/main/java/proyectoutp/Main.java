/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoutp;

/**
 *
 * @author ESTEBAN MEJIA
 */
public class Main {
    public static void main(String[] args) {
        
        EmpleadoBD ebd = new EmpleadoBD();
        Empleado em = new Empleado();
        String contraseña = "123";
        String user = "emp01";
        em = ebd.ValidarEmpleado(contraseña, user);
        System.out.println(em.getUser());
        System.out.println(em.getContraseña());
    }
}
