/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.Scanner;
/**
 *
 * @author options
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter height , width , breadth of cubiod");
        double  x =input.nextDouble();
         double  y =input.nextDouble();
          double  z =input.nextDouble();
        cuboid c = new cuboid(x,y,z);
        System.out.println("Area of cuboid = "+c.area());
        System.out.println("Volume of cuboid = " +c.volume());
    }
    
}
