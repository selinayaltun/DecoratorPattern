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
public class Meal extends FlightDecorator {

    public Meal(FlightTickets f) {
        super(f);
    }
    

    @Override
    String getDescription() {
        return this.f.getDescription() + "Also you have a meal";
    }

    @Override
    double cost() {
        return this.f.cost() +1250;
    }
    
    
}
