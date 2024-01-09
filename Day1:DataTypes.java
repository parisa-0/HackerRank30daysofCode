import java.io.*;
import java.util.*;

public class Solution {
    

    public static void main(String[] args) {
       int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    int newInt = 0;
    double newDouble = 0.0;
    String newString = "";
    
    Scanner scanner = new Scanner(System.in);  

    newInt = scanner.nextInt();
    newDouble = scanner.nextDouble();

    while(scanner.hasNextLine()) {
    newString = newString + scanner.next() + " "; 
    }
    
    System.out.println(i + newInt);
    System.out.println(d + newDouble);
    System.out.println(s + newString);
    
    }
}
