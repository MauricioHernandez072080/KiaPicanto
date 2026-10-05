/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 

package accessories;

import component.Vehicle;
import decorator.AccessoriesDecorator;


public class PernosSeguridadStarlock extends AccessoriesDecorator {

    public PernosSeguridadStarlock(Vehicle vehicle) {
        super(vehicle);
    }

     @Override
    public String getDescripcion() {
        return vehicle.getDescripcion() + ", Pernos de seguridad STARLOCK";
    }

    @Override
    public double costo() {
        return 156100 + vehicle.costo();
    }
  
}
