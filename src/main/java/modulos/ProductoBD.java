/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTEBAN MEJIA
 */
public class ProductoBD {
    int r;
    PreparedStatement ps;
    ResultSet rs;
    CConexion conexion = new CConexion();
    Connection con;
    Producto prod = new Producto(); 
    
    public Producto registrarId(int id) {
        Producto p = new Producto();
        String sql = "select * from producto where id_prod=?";
        try {
            con = conexion.establecerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()) {
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setUnidad(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        } return p;
    }
}

