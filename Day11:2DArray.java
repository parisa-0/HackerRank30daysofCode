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
        int[][] myArray = new int[6][6];
        
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                myArray[i][j] = scanner.nextInt();
            }
        }
        int max = -81;
        for(int k = 0; k < 6; k++) {
            for(int m = 0; m < 6; m++) {
                if (k + 2 < 6 && m + 2 < 6) {
                     int sum = myArray[k][m] + myArray[k][m + 1] + myArray[k][m + 2] + myArray[k + 1][m + 1] + myArray[k + 2][m] + myArray[k + 2][m + 1] + myArray[k + 2][m + 2];
                     if(sum > max) {
                         max = sum;
                     }
                } 
            }
        }
        System.out.println(max);
        scanner.close();
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    

        bufferedReader.close();
        */
    }
}
