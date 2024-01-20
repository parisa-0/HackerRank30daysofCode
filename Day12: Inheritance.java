import java.io.*;
import java.util.*;

class Person {
    
}

class Student extends Person {
    String firstName;
    String lastName;
    int idNumber;
    int[] scores;
    
    Student(String firstName,  String lastName, int idNumber, int[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.scores = scores;
    }
    
    static char calculate(int a) {
        if(90 <= a && a <= 100) {
            return 'O';
        }
        else if(80 <= a && a <= 90) {
            return 'E';
        }
        else if(70 <= a && a <= 80) {
            return 'A';
        }
        else if(55 <= a && a <= 70) {
            return 'P';
        }
        else if(40 <= a && a <= 55) {
            return 'D';
        }
        return 'T';
        }
    }


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);  
        
        String firstName = scanner.next();
        String lastName = scanner.next();
        int id = scanner.nextInt();
        
        
        int count = scanner.nextInt();
        int grade = 0;
        while(scanner.hasNextInt()) {
            grade += scanner.nextInt();  
        }  
        
        String finalGrade = "Grade: " + Student.calculate(grade/count);
        
        System.out.println("Name: " + lastName + ", " + firstName);   
        System.out.println("ID: " + id); 
        System.out.println(finalGrade);  
    }
}
