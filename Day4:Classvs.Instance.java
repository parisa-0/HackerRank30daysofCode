import java.io.*;
import java.util.*;
class Person {
    int age;
    
    Person(int initialAge) {
        if(initialAge < 1) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else {
            age = initialAge;
        }
    }
    
    void yearPasses() {
        age++;
    }
    
    void amIOld() {
        if(age < 13) {
            System.out.println("You are young.");
        }
        else if(age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        }
        else {
           System.out.println("You are old."); 
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for(int i = 0; i < T; i++) {
        int age = scanner.nextInt();
        Person person = new Person(age);
        person.amIOld();
     
        for(int j = 0; j < 3; j++) {
            person.yearPasses();
        }
        
        person.amIOld();
        System.out.println();
        } 
    }
}
