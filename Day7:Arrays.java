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
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] A = new int[N];
        int counter = 0;
        while(scanner.hasNextInt()) {
            A[counter] = scanner.nextInt();
            counter++;
        }
        
        for(int i = N - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
        scanner.close();
    }
}
