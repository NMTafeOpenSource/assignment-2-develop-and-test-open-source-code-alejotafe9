/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclestarter;

import java.util.Random;

/**
 * Starter code for Vehicle application. 
 * This class displays sample output to the console.
 * @author AUTHORNAME
 */
public class VehicleStarter {

    /** Main entry point to the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Vehicle v = new Vehicle("Ford", "T812", 2014, "8Litres", "2HP897", "14000km", "8.4", "$25", "10000km");
		
		// Vehicle sample distance
            //v.addFuel(new Random().nextDouble()*10, 1.3);

            v.printDetails();                
            System.out.println("\n\n");
    }
    
}
