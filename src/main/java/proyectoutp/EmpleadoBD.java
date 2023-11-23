/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoutp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ESTEBAN MEJIA
 */
public class EmpleadoBD {
    PreparedStatement ps;
    ResultSet rs;
    
    CConexion conexion = new CConexion();
    Connection con;
    
    public Empleado ValidarEmpleado(String id_empleado, String em_user){
        Empleado emp = new Empleado();
        String sql = "select * from empleado where id_empleado=? and em_user=?";
        try {
            con = conexion.establecerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, id_empleado);
            ps.setString(2, em_user);
            rs = ps.executeQuery();
        } catch (Exception e) {
            
        }
        return emp;
    }
}
