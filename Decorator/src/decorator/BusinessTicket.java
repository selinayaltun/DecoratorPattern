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
public class BusinessTicket extends FlightTickets{

    @Override
    String getDescription() {
         return "this is an business seat";
    }

    @Override
    double cost() {
       return 4000.0;
    }
    
}
