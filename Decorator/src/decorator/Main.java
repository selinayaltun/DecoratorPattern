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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //In Decorator Pattern, our goal is to extend the behavior of an object by avoiding inheritance
        //when we need to change the way an object behaves.
        //By replacing the helper object associated with the Decorator Pattern with
        //another object, we can change the behavior of the main object at runtime.
        //We can use Decorator Pattern to add extra features to objects at runtime without breaking the code.
        FlightTickets myFly = new BusinessTicket();
        myFly = new Meal(new ExtraLugWeight(myFly));
        System.out.println("" + myFly.getDescription());
        System.out.println("" + myFly.cost());
    }
    
}
