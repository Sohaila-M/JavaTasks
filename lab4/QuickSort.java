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
public class QuickSort {
    public static void quick_sort(int [] array, int left, int right) {
 if (left < right) {
 int q = position(array, left, right);
 quick_sort(array, left, q-1);
 quick_sort(array, q+1, right);
 }
 }
 private static int position(int array [], int left, int right) {
 int i = left - 1;
 for (int j = left ; j < right ; j++) {
 if (array[j] < array[right]) {
 i++;
 swap(array, i, j);
 }}
 swap(array, i+1, right);
 return i+1;
 } 
 private static void swap(int [] array, int i, int j) {
 int temp = array[i];
 array[i] = array[j];
 array[j] = temp;
 }
    
}
