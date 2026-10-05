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
public class TiroArrastre extends AccessoriesDecorator{
    
    public TiroArrastre(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescripcion() {
        return vehicle.getDescripcion() + ", Tiro de arrstre";
    }

    @Override
    public double costo() {
        return 150000 + vehicle.costo();
    }
    
}