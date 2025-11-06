/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.evaluada.pkg3.daniel.fernandez;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class PracticaEvaluada3DanielFernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadProductos = 0;
        cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de productos"));
        Productos producto = new Productos(cantidadProductos);
        producto.setNombre(cantidadProductos);
        producto.setCantidad(cantidadProductos);
        
        
    }
    
}
