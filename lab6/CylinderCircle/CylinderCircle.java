
package cylinder.circle;


public class CylinderCircle {

    
    public static void main(String[] args) {
        circle c = new circle (5,"blue");
        c.setRadius(7);
        System.out.println(c.getColor());
        System.out.println(c.getRadius());
         System.out.println(c.getArea());
         cylinder d =new cylinder();
         System.out.println(d.getVolume());
        System.out.println( d.getArea());
    }
    
}
