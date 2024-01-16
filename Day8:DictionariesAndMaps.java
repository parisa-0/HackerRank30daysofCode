import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Map<String,Integer> phoneBook = new HashMap<>();
        
        
         Scanner scanner = new Scanner(System.in);  
         int numberOfEntries = scanner.nextInt();
        
        for(int i = 0; i < numberOfEntries; i++) {
            String name = scanner.next();
            int phoneNumber = scanner.nextInt();
            phoneBook.put(name, phoneNumber);
        }
        
         while(scanner.hasNextLine()) {
             String name = scanner.next();
             if(phoneBook.containsKey(name)) {
                 System.out.println(name + "=" + phoneBook.get(name));
             }  
             else {
                 System.out.println("Not found");
             }        
        }
    }
}
