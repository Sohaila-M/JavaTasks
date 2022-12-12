/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author options
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 System.out.println("Hello! World!!");
 int [] array= {3, 1, 5, 4, 2};
 QuickSort.quick_sort(array, 0, array.length - 1);
 for (int i = 0 ; i < array.length ; i++) {
 System.out.println(array[i]);
    }
    
} }
