import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String remainder = "";
        
        List<Integer> remainderList = new LinkedList<>();

        while(n>0) {
            remainderList.add(n%2);
            n = n/2;
        }
        
        int count = 1;
        int max = 0;
        
          for(int i = 0; i < remainderList.size() - 1; i++) {
            if(remainderList.get(i) == 1 && remainderList.get(i)==remainderList.get(i+1)) {
                count++;
            }
            else if(remainderList.get(i) == 0 && count < max) {
                count = 1;
            }
            else if(remainderList.get(i) == 0 && count >= max) {
                max = count;
                count = 1;

            }
        }

       
       if(count > max) {
           max = count;
       }
       System.out.println(max);

        bufferedReader.close();
    }
}
