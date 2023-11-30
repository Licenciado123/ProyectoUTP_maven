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
public class VentaBD {
    CConexion conexion = new CConexion();
    Connection con;
    
    PreparedStatement ps;
    ResultSet rs;
    
    int r = 0;
    
    public String idVenta() {
        String idv = "";
        String sql = "SELECT max(id_venta) from VENTA";
        try {
            con = conexion.establecerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while(rs.next()) {
                idv = rs.getString(1);
            }
        } catch (Exception e) {        
        } 
        return idv;
    }
    
    public int registrarVentas(Venta v) {
        Venta ventas = new Venta();
        String sql = "insert into ventas() values(?,?,?,?,?,?)";
        try {
            con = conexion.establecerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, v.getId());
            ps.setInt(2, v.getId_emp());
            ps.setString(3, v.getDni_cli());
            ps.setString(4, v.getNom_cli());
            ps.setString(5, v.getOrden());
            ps.setDouble(6, v.getMonto());
            ps.setString(7, v.getFecha());
        } catch (Exception e) {   
        }
        return r;
    } 
    
    public int registrarDetalleVenta(DetalleVenta dv) {
        String sql = "insert into detalle_venta() values(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getId());
            ps.setInt(2, dv.getId_ventas());
            ps.setInt(3, dv.getId_prod());
            ps.setInt(4, dv.getCantidad());
            ps.setDouble(5, dv.getPrecioVenta());
        } catch (Exception e) {   
        }
        return r;
    }
}
