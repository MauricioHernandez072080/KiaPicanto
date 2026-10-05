/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessories;

import component.Vehicle;
import decorator.AccessoriesDecorator;


public class RinAluminio14 extends AccessoriesDecorator {

    public enum Color { NEGRO, GRIS }

    private final Color color;

    public RinAluminio14(Vehicle vehicle, Color color) {
        super(vehicle);
        this.color = color;
    }

    @Override
    public String getDescripcion() {
        return vehicle.getDescripcion() + ", Rin aluminio 14\" " + color.name().toLowerCase() + " mecanizado";
    }

    @Override
    public double costo() {
        return 500000 + vehicle.costo();
    }
}