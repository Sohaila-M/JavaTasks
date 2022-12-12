/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author options
 */
public class cuboid extends rectangle {
    public double breadth ;
    cuboid(double height ,double width , double breadth)
    {
       
        super(height , width);
         this.breadth=breadth ;
}
public double area(){
return (2*(RectangleArea(this.height , this.width)+RectangleArea(this.height,this.breadth)
        +RectangleArea(this.width,this.breadth)));
}
public double volume(){
    return (RectangleArea(this.height , this.width)*this.breadth);
}

}
