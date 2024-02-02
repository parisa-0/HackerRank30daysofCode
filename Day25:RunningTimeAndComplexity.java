import java.io.*;
import java.util.*;

public class Solution {
       static void isItAPrimeNumber(int N) {
           if(N == 1) {
               System.out.println("Not prime");
               return;
           }
       int i = 2;
       while(1 <= i && i <= N/2) {
           if(N%i == 0) {
               System.out.println("Not prime");
               return;
           }
           else {
               i++;
           }
       }
         System.out.println("Prime");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);  
        int T = scanner.nextInt();
        
        for(int i = 1; i <= T; i++) {
        isItAPrimeNumber(scanner.nextInt());
        }
    }
}
