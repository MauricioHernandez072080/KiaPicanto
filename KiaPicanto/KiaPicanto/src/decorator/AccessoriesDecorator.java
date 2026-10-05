/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;
import component.Vehicle;

public abstract class AccessoriesDecorator extends Vehicle{

    protected Vehicle vehicle;

    public AccessoriesDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public abstract String getDescripcion();
    
}
