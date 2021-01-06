import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Stack stack1 = new Stack();
        while(n>0){
          int  remainderN = n % 2;
          n = n/2;
            stack1.push(remainderN);
        }
        int count = 0;
        int maxCount = 0;
        int size = stack1.size();

        for(int i=0; i< size; i++){
            if(stack1.pop()==1){
                count++;
                if(count > maxCount){
                    maxCount=count;
                }

            }else{
                count=0;
            }

        }
        System.out.println(maxCount);

        scanner.close();
    }
}
