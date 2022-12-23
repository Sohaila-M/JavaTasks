
package myonlineshop;
import java.util.Scanner ;

public class MyOnlineShop {

    public static void main(String[] args) {
        int sum =0 ;
        product []arr=new product[3];
       arr[0] =new book();
       arr[1]= new childrenbook();
       arr[2]= new childrenbook();
       for (int i=0 ; i<arr.length;i++){
        sum +=arr[i].price();}
        
      System.out.println(sum); 
    }
    
}
