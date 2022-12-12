/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Scanner ;
/**
 *
 * @author options
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      System.out.println("Enter string :");
   String x=input.next();
   x=x.replace(",","");
   System.out.println(x) ;
    System.out.println("-------------------------");
   
   circle c = new circle();
   System.out.println("Enter circle radius");
   c.radius=input.nextDouble();
  System.out.println("Area:"+c.area());
  System.out.println("Circumference: "+c.circumference());
  triangle t = new triangle() ;
  System.out.println("Enter triangle sides");
  t.x=input.nextDouble() ;
  t.y=input.nextDouble() ;
  t.z=input.nextDouble() ;
  System.out.println("Area:"+t.area()) ;
  System.out.print("Circumference: "+t.circumference()) ;
    }
    
}
