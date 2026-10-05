/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessories;

import component.Vehicle;
import decorator.AccessoriesDecorator;


public class TapeteTresPiezas extends AccessoriesDecorator{
    
    public TapeteTresPiezas(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescripcion() {
        return vehicle.getDescripcion() + ", Tapete tres piezas alfombra";
    }

    @Override
    public double costo() {
        return 92000 + vehicle.costo();
    }
    
}