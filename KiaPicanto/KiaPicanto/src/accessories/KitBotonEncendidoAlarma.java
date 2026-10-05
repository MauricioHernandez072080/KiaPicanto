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
public class KitBotonEncendidoAlarma extends AccessoriesDecorator{
    
    public KitBotonEncendidoAlarma(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescripcion() {
        return vehicle.getDescripcion() + ", kit boton de encendido + alarma + 2 controles tipo disparador";
    }

    @Override
    public double costo() {
        return 1500000 + vehicle.costo();
    }
}
