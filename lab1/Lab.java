/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author options
 */
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* First Program to print the character whose ASCII value is entered by the user
        char asci;
        int num;
         System.out.print("Enter the ASCII : ");
        num = input.nextInt();
        asci = (char) num;
        System.out.println("Value is "+asci);
        System.out.println("----------------------------------------");
        /* Second program to calculate npr
        int n=0, r=0,npr   ,fact=1, numerator, denominator, i=1, sub;
        while(n<=r ||n<=0 ||r<=0 ){
            System.out.println("n must be larger than r larger than zero ");
        System.out.print("Enter the Value of n: ");
 n = input.nextInt();
 System.out.print("Enter the Value of r: ");
 r = input.nextInt(); }
 while(i<=n)
 {
 fact = fact*i;
 i++;
 }
 numerator = fact;
 sub = n-r;
 fact = 1;
 i = 1;
 while(i<=sub)
 {
 fact = fact*i;
 i++;
 }
 denominator = fact;
 npr=numerator/denominator ;
 System.out.println("npr = "+npr);

 
 
 
    }

}
