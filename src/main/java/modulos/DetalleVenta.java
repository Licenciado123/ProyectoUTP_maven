/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulos;

/**
 *
 * @author ESTEBAN MEJIA
 */
public class DetalleVenta {
    int id;
    int id_venta;
    int id_prod;
    int cantidad; 
    double precioVenta;
    
    public DetalleVenta() {
    }

    public DetalleVenta(int id, int id_venta, int id_prod, int cantidad, double precioVenta) {
        this.id = id;
        this.id_venta = id_venta;
        this.id_prod = id_prod;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_ventas() {
        return id_venta;
    }

    public void setId_ventas(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
