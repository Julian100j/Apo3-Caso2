/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umariana.taller2;

import Mundo.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julian Ceballos y Juan Zambrano
 */
    public class Taller2 {
        
         private ArrayList<Producto> misProductos;
         private Scanner lector;

    public Taller2() {
        
        //Se crea un 
        misProductos = new ArrayList<>();
        lector = new Scanner(System.in);
    }
    
     public void mostrarMenu() {
         //Muestra un menú de opciones al usuario y permite que éste seleccione una opción.
        //Dependiendo de la opción seleccionada, se llama a otro método para realizar la acción correspondiente.
        
        boolean activo = true;

        do {
            
        //Menu:
        
            System.out.println("========= Menu de opciones ==========");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Ordenar inventario de forma descendente");
            System.out.println("4. Elimnar un producto");
            System.out.println("5. Terminar programa");
            System.out.println("Seleccione una opcion");
            System.out.println("=====================================");
        
            int opcion = lector.nextInt();
            
             switch (opcion) {
                case 1:
              // Pide al usuario que ingrese los datos de un nuevo producto y lo agrega al ArrayList misProductos.
                    agregarProducto();
                    break;
                case 2:
              //Muestra los datos de todos los productos del ArrayList misProductos.
                    mostrarInventario();
                    break;
                case 3:
              //Ordena el ArrayList misProductos de forma ascendente según la cantidad de cada producto.
                    ordenAscendente();
                    break;
                    
                case 4:
              //Pide al usuario que ingrese el id de un producto y lo elimina del ArrayList misProductos.
                    eliminarProducto();
                break;
                
                case 5:
              //Al presionar la opcion 5 permite salir del programa
                    activo = false;
                    System.out.println("Programa terminado");
                 break;   
                    
                default:
              //Sale solo si se ingresa un dato incorrecto 
                    System.out.println("Opción no válida, inténtelo nuevamente");
            }
        } while (activo);
    }
                
              //Los metodos:
     
             public void agregarProducto() {
                 
                System.out.println("Ingrese el id del producto:");
                int id_Producto=lector.nextInt();
                
                lector.nextLine();
                System.out.println("Nombre: ");
                String nombre=lector.nextLine();
                
                System.out.println("Precio: ");
                double precio=lector.nextDouble();
                
                System.out.println("cantidad: ");
                int cantidad=lector.nextInt();
                
                //crea del objeto y llenar la informacion
                Producto nuevoProducto = new Producto (id_Producto, nombre, precio, cantidad);
                
                //almacena el objeto en la contenedora
                misProductos.add(nuevoProducto);
                System.out.println("El producto fue agregado satisfactoriamente ");
                
             }
                
             public void mostrarInventario() {
                System.out.println("====== Mostrar Inventario =====");
                for (Producto t: misProductos){
                System.out.println("Id: " +t.getId_Producto());
                System.out.println("Nombre: " +t.getNombre());
                System.out.println("Precio: " +t.getPrecio());
                System.out.println("Cantidad: " +t.getCantidad());
                System.out.println("===============================");
                }

             }
            
            public void ordenAscendente() {
                
                
               int n = misProductos.size();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (misProductos.get(j).getCantidad()> misProductos.get(j + 1).getCantidad()) {
                Producto temp = misProductos.get(j);
                misProductos.set(j, misProductos.get(j + 1));
                misProductos.set(j + 1, temp);
            }
        }
    }

                    
                System.out.println("=====Productos ordenados (Menor a Mayor)=====");               
               
                for (Producto k: misProductos){
                System.out.println("Id: " +k.getId_Producto());
                System.out.println("Nombre: " +k.getNombre());
                System.out.println("Precio: " +k.getPrecio());
                System.out.println("Cantidad: " +k.getCantidad());
                System.out.println("===============================");
                }
}
            
                            
             public void eliminarProducto() {
                
                System.out.println("===============================");
                
                System.out.println("Ingresa el id del producto a eliminar");
                 int id=lector.nextInt();
                    for(Producto p: misProductos){
                        if(p.getId_Producto()==id){
                            misProductos.remove(p);
                            
                            System.out.println("===============================");
                            
                            System.out.println("El producto con id "+id+" ha sido eliminado correctamente");
                          
                        }
                    }
                    
}
        public static void main(String[] args) {
       //En el método main, se crea un objeto Taller2 y se llama al método mostrarMenu() para mostrar el menú de opciones al usuario.
       
        Taller2 organizador = new Taller2();
        organizador.mostrarMenu();
    }
    }
    

