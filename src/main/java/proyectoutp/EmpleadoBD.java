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
    
    public Empleado ValidarEmpleado(String em_contraseña, String em_user){
        Empleado em = new Empleado();
        String sql = "select * from empleado where em_contraseña=? and em_user=?";
        try {
            con = conexion.establecerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em_contraseña);
            ps.setString(2, em_user);
            rs = ps.executeQuery();
            while (rs.next()) {
                em.setId(rs.getInt(1));
                em.setNombre(rs.getString(2));
                em.setTelefono(rs.getString(3));
                em.setUser(rs.getString(4));
                em.setContraseña(rs.getString(5));
            }    
        } catch (Exception e) { 
            
        }
        return em;
    }
}
