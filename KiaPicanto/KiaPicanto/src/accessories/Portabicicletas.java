/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessories;

import component.Vehicle;
import decorator.AccessoriesDecorator;

/**
 *
 * @author LENOVO
 */
public class Portabicicletas extends AccessoriesDecorator{
    
    public Portabicicletas(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescripcion() {
        return vehicle.getDescripcion() + ", Portabicicletas x2 puestos";
    }

    @Override
    public double costo() {
        return 950000 + vehicle.costo();
    }
}