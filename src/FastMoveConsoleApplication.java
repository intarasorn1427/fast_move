
import base.Bike;
import java.util.Scanner;







/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praisan
 */
public class FastMoveConsoleApplication {
   Bike bikes;
   
   public FastMoveConsoleApplication(){
       Scanner scn1 = new Scanner(System.in);
       System.out.println("Enter your licensePlate");
       String name = scn1.next();
       Scanner scn2 = new Scanner(System.in);
       System.out.println("Enter your engineCapacity");
       int num = scn2.nextInt();
       this.bikes = new Bike(name, num);
       
   
   }
    
}
