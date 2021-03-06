//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBookDict = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBookDict.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBookDict.containsKey(s)){
                System.out.println(s +"="+phoneBookDict.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
