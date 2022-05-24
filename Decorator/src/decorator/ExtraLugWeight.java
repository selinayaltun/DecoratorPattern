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
public class ExtraLugWeight extends FlightDecorator {

    public ExtraLugWeight(FlightTickets f) {
        super(f);
    }
    
    

    @Override
    String getDescription() {
       return this.f.getDescription() + "Also you have a extra weight for the lugs";
    }

    @Override
    double cost() {
         return this.f.cost() +350;
    }
    
}
