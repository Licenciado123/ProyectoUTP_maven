package login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import login.EntidadesEmpleado;
/**
 *
 * @author Asus
 */
public class EmpleadoDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    EntidadesEmpleado em =new EntidadesEmpleado();
    //INTERTAR LA INSTANCIA A LA 
    //CONEXION A LA BASE DE DATOS
    Connection acceso;
    
        public EntidadesEmpleado ValidarEmpleado (String dni, String user){
        String sql=="select*from vendedor when Dni=? adn User=?";
        try{
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs=ps.executeQuery();
            while(rs.next()){
                em.setId(rs.getInt(1));
                em.setDni(rs.getString(2));
                em.setNom(rs.getString(3));
                em.setTel(rs.getString(4));
                em.setUser(rs.getString(5));
            }
        } catch (Exception e)
        return ev;
    }
    
}
