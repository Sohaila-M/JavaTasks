/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylinder.circle;

/**
 *
 * @author options
 */
public class cylinder extends circle  {
   double height  ;
    cylinder(){
        System.out.println("No parameter constructor called - cylinder class ");
        height = 1.0 ;}
    cylinder (double height){
        this.height=height;}
    cylinder (double height , double radius){
    this.height=height ;
       
    }
    cylinder (double height , double radius , String color){
        this.height=height ;
         setRadius(radius);
         setColor(color);
    }
     double getHeight(){
    return height ;}
     void setHeight(double height ){
        this.height=height ;}
      double getVolume(){
        return height*getArea() ; }
    
    
}
