import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0; i<n ;i++){
            int number = sc.nextInt();
            if(checkPrime(number)){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
    }

    public static boolean checkPrime(int number){
        if (number <=3){
            return number > 1;
        }
        if((number % 2 ==0) || (number % 3 == 0) ){
            return false;
        }
        int i=5;
        while (Math.pow(i, 2) <= number){
            if((number % i == 0) ||(number % (i+2) ==0)){
                return false;
            }
           i+=6;
        }
    return true;
    }
}
