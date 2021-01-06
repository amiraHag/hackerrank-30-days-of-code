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
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        int[][] arrResult=new int[3][3];
        int maxSize=0;
        for(int i=0; i< 4; i++){
            for(int j=0; j<4 ; j++){
                arrResult[0][0] = arr[i][j];
                arrResult[0][1]=arr[i][j+1];
                arrResult[0][2]=arr[i][j+2];
                arrResult[1][0] = 0;
                arrResult[1][1]=arr[i+1][j+1];
                arrResult[1][2]=0;
                arrResult[2][0] = arr[i+2][j];
                arrResult[2][1]=arr[i+2][j+1];
                arrResult[2][2]=arr[i+2][j+2];
                int sum = 0;
                for (int k=0; k< 3 ; k++){
                for( int num : arrResult[k]) {
                    sum = sum+num;
                     }
                }
                if( i== 0 && j==0){
                    maxSize = sum;
                }
                if(sum >= maxSize){
                    maxSize = sum;
                }

            }
        }
        System.out.println(maxSize);
    }
}
