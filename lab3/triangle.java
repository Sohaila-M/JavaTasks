/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author options
 */
public class triangle {
    double x , y , z ;
double area()
{double s =((x+y+z)/2);
  double d =(s*(s-x)*(s-y)*(s-z));
  double area=Math.sqrt(d);
  
  return area ;
}
double circumference(){
double circumference=x+y+z;
return circumference ;
    
} }
