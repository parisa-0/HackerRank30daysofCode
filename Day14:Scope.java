import java.io.*;
import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;
    
    Difference(int[] elements) {
        this.elements = elements;
    }

    
    int computeDifference() {
        for(int i = 0; i < elements.length; i++) {
            for(int j = i+1; j < elements.length; j++) {
            int abs = Math.abs(elements[i] - elements[j]);
            if(abs > maximumDifference) {
                maximumDifference = abs;
            }
        }
        }
        return maximumDifference;
    }
} 

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);  
        
        int lengthOfArray = scanner.nextInt();
        int[] elements = new int[lengthOfArray];
        
        for(int i = 0; i < lengthOfArray; i++) {
            elements[i] = scanner.nextInt();
        }
        
        Difference difference = new Difference(elements);
        System.out.println(difference.computeDifference());
        
    }
}
