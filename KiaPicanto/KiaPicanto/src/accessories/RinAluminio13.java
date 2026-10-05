/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessories;

import component.Vehicle;
import decorator.AccessoriesDecorator;

public class RinAluminio13 extends AccessoriesDecorator {

    public RinAluminio13(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescripcion() {
        return vehicle.getDescripcion() + ", Rin aluminio 13\" (unidad)";
    }

    @Override
    public double costo() {
        return 350000 + vehicle.costo();
    }
}