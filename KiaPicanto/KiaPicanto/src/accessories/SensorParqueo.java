/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessories;

import component.Vehicle;
import decorator.AccessoriesDecorator;


public class SensorParqueo extends AccessoriesDecorator{
    
    public SensorParqueo(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescripcion() {
        return vehicle.getDescripcion() + ", Sensor de parqueo";
    }

    @Override
    public double costo() {
        return 150000 + vehicle.costo();
    }
    
}