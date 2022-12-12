/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner ;
/**
 *
 * @author options
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        /* First Program to find the largest element in an array entered by the user */
        System.out.print("Enter number of elements in array ");
        int n = input.nextInt();
       double arr []=new double[n] ;
       System.out.print("Enter array elements");
       for(int i=0 ;i<n;i++){
           arr[i]=input.nextInt();
    }
      double max = arr[0];
       for(double num : arr){
           if(num>max)
               max=num ;
    }
       System.out.println("max = "+ max);
       System.out.println("----------------");
        /* Second program to find the transpose og a 2D array */
 int r1 = 2, c1 = 3;
 int r2 = 3, c2 = 2;
 int[][]Matrix = { {3, -2, 5}, {3, 0, 4} };
 int[][] transposedMatrix = new int [r2][c2];
 for (int i=0 ; i<r2;i++){
     for(int j=0 ; j<c2 ; j++){
         transposedMatrix[i][j]=Matrix[j][i];
         
     }
 }
    for (int i=0 ; i<r2;i++){
     for(int j=0 ; j<c2 ; j++){
         System.out.print(transposedMatrix[i][j]+"\t");
         
     }
     System.out.print("\n");
 }
} }
