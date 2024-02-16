/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;

/**
 *
 * @author Julian Ceballos y Juan Zambrano
 */
public class Producto {
    
    //Atributos
    private int id_Producto;
    private String nombre;
    private double precio;
    private int cantidad;
    
    //Constructores y Metodos
    public Producto() {
    }

    public Producto(int id_Producto, String nombre, double precio, int cantidad) {
        this.id_Producto = id_Producto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //Getters
    
    public int getId_Producto() {
        return id_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    //Setters
    
    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}