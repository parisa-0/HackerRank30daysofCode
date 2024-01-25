import java.io.*;
import java.util.*;

class Calculator {
    int power(int n, int p) throws Exception {
        if(n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n,p);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int numberOfTestCases = scanner.nextInt();
        
         while(scanner.hasNextInt()) {
            int n = scanner.nextInt();  
            int p = scanner.nextInt();
            try {
            System.out.println(calculator.power(n,p));
            }
            catch (Exception e) {
                System.out.println(e.getMessage());  
            }
        }  
        
    }
}
