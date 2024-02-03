import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        //Date returned
        int D1 = scanner.nextInt();
        int M1 = scanner.nextInt();
        int Y1 = scanner.nextInt();
        
        //Due date
        int D2 = scanner.nextInt();
        int M2 = scanner.nextInt();
        int Y2 = scanner.nextInt();
        
        int fine = 0;
        
        if(Y1 <= Y2 && M1 <= M2 && D1 <= D2) {
            fine = 0;
        }
        else if(Y1==Y2 && M1==M2 && D1 > D2) {
            fine = 15 * (D1 - D2);
        }
        else if(Y1 == Y2 && M1 > M2) {
            fine = 500 * (M1 - M2);
        }
        else if(Y1 > Y2) {
            fine = 10000;
        }
        System.out.println(fine);
    }
}
