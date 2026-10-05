/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

/**
 *
 * @author Estudiantes
 */
public abstract class Vehicle {
    
    public String descripcion = "vehiculo desconocido";
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public abstract double costo();
           
   
}
