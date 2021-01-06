import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int sum_swap=0;
        for(int i=0; i< n ; i++){
            for(int j=i; j< n ;j++){
                if(a[i]> a[j]){
                  int temp = a[j];
                  a[j] =a[i];
                  a[i] = temp;
                  sum_swap+=1;
                }
            }
        }
        System.out.println("Array is sorted in " + sum_swap +" swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: " +a[n-1]);

    }
}
