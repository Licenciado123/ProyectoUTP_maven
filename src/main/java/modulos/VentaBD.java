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
    
    public String NroOrden() {
        String orden = "";
        String sql = "SELECT max(orden_venta) from VENTA";
        try {
            con = conexion.establecerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                orden = rs.getString(1);
            }    
        } catch (Exception e) {    
        } 
        return orden;
    }
    
    public double ventaDia(String fecha) {
        double vd = 0;
        String sql = "SELECT sum(monto_venta) from VENTA where fecha_venta=?";
        try {
            con = conexion.establecerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, fecha);
            rs = ps.executeQuery();
            while(rs.next()) {
                vd = Double.parseDouble(rs.getString(1));
            }
        } catch (Exception e) {        
        } 
        return vd;
    }
    
    public int idVenta() {
        int idv = 0;
        String sql = "SELECT max(id_venta) from VENTA";
        try {
            con = conexion.establecerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                idv = rs.getInt(1);
            }
        } catch (Exception e) {        
        } 
        return idv;
    }
    
    public int registrarVentas(Venta v) {
        String sql = "insert into venta(id_emp, dni_cli, nom_cli, orden_venta, monto_venta, fecha_venta) values(?,?,?,?,?,?)";
        try {
            con = conexion.establecerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, v.getId_emp());
            ps.setString(2, v.getDni_cli());
            ps.setString(3, v.getNom_cli());
            ps.setString(4, v.getOrden());
            ps.setDouble(5, v.getMonto());
            ps.setString(6, v.getFecha());
            r = ps.executeUpdate();
        } catch (Exception e) {   
        }
        return r;
    } 
    
    public int registrarDetalleVenta(DetalleVenta dv) {
        String sql = "insert into detalle_venta(id_venta, id_prod, cant_deven, precio_venta) values(?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getId_venta());
            ps.setInt(2, dv.getId_prod());
            ps.setInt(3, dv.getCantidad());
            ps.setDouble(4, dv.getPrecioVenta());
            ps.executeUpdate();
        } catch (Exception e) {   
        }
        return r;
    }
}
