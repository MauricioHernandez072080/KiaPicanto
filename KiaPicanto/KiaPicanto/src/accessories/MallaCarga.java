/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessories;


import component.Vehicle;
import decorator.AccessoriesDecorator;


public class MallaCarga extends AccessoriesDecorator{
    
    public MallaCarga(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescripcion() {
        return vehicle.getDescripcion() + ", Malla de carga";
    }

    @Override
    public double costo() {
        return 110000 + vehicle.costo();
    }
  
}