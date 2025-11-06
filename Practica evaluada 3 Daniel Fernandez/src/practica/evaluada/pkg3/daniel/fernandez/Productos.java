/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.evaluada.pkg3.daniel.fernandez;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Productos {
    private String nombre[];
    private int cantidad[][];
    private String semana[];

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(int cantidadProductos) {
        
        for (int i = 0; i<cantidadProductos; i++){
            nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del producto " + i+1);
        }
    }

    public int[][] getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidadProductos) {
        for(int i = 0; i<6; i++){
            for(int j = 0; j<cantidadProductos; j++){
                cantidad[i][j] =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de " + nombre[i] + "vendido el dia " + semana[i]));
            }
        }
    }

    public String[] getSemana() {
        return semana;
    }

    public void setSemana() {
        for (int i = 0; i<6; i++){
            switch (i){
                case 0:
                    semana[i] = "Lunes";
                    break;
                case 1:
                    semana[i] = "Martes";
                    break;
                case 2:
                    semana[i] = "Miercoles";
                    break;
                case 3:
                    semana[i] = "Jueves";
                    break;
                case 4:
                    semana[i] = "Vieres";
                    break;
                    
                case 5:
                    semana[i] = "Sabado";
                    break;
                case 6:
                    semana[i] = "Domingo";
                    break;
            } 
        }
    }



    public Productos(int cantidadProductos) {
        String nombre[] =  new String [cantidadProductos];
        int cantidad[][] = new int [6][cantidadProductos];
        String semana[] = new String [6];
    }
 
   

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }


    
    
}
