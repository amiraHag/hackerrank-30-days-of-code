import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        int sum=0;
        int numberDays= (d1-d2) + (m1-m2)*30 + (y1 -y2) *365;
        if(numberDays > 365 || y1 > y2){
            sum=10000;
        }
        else if(numberDays > 30){
            sum = (m1-m2) * 500;
        }
        else if(numberDays >=1){
            sum = (d1 - d2) * 15 ;
        }
        else{
            sum=0;
        }

        System.out.println(sum);
    }
}
