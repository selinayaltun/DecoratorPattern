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
public class EconomyTicket extends FlightTickets {

    @Override
    String getDescription() {
       return "this is an economy seat";
    }

    @Override
    double cost() {
        return 1000.0;
    }
    
}
