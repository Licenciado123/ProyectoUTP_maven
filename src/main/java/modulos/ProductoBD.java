/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    
    public int actualizarStock(int stock, String nombre) {
        String sql = "update producto set stock_prod=? where nom_prod=?";
        try {
            con = conexion.establecerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, stock);
            ps.setString(2, nombre);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public Producto registrarNombre(String nombre) {
        String sql = "select * from producto where nom_prod=?";
        try {
            con = conexion.establecerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while(rs.next()) {
                prod.setId(rs.getInt(1));
                prod.setNombre(rs.getString(2));
                prod.setPrecio(rs.getDouble(3));
                prod.setUnidad(rs.getString(4));
                prod.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        } return prod;
    }
}

