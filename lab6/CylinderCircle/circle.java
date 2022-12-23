package cylinder.circle;
import java.lang.Math ;
import java.lang.String ;
public class circle {
    private double radius;
    private String color ;
    circle(){
        System.out.println("No parameter constructor called - circle class ");
        radius=1;
        color="red";}
    circle(double radius){
        this.radius=radius;}
    circle(double radius , String color){
        this.radius=radius ;
        this.color=color ;
    }
    double getRadius(){
    return radius ;}
    String getColor(){
        return color ;
    }
    void setRadius(double radius ){
        this.radius=radius ;}
    void setColor(String color ){
        this.color=color ;}
    double getArea(){
        return radius*radius*Math.PI ; }
    
    
}
