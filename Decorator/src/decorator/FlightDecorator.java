/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author SELİNAY
 */
public abstract class FlightDecorator extends FlightTickets{
    FlightTickets f;

    public FlightDecorator(FlightTickets f) {
        this.f = f;
    }
    
    @Override
    abstract String getDescription();
    @Override
    abstract double cost();
   
}
