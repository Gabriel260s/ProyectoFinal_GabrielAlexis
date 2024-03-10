/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp1;

/**
 *
 * @author gabri
 */
public class Tienda {

    String Nombre;
    int id, precio, cantidad;

    public Tienda(String Nombre, int id, int precio, int cantidad) {
        this.Nombre = Nombre;
        this.id = id;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Tienda() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ID= " + id + ", Nombre=" + Nombre + ", precio=" + precio + ", cantidad=" + cantidad;
    }
}
