import java.io.*;
import java.util.*;

class MyBook {
    String title;
    String author;
    int price;
    
    MyBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void print() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);  
        String title;
        String author;
        int price;
           
        title = scanner.nextLine();
        author = scanner.nextLine();
        price = scanner.nextInt();
        
        MyBook myBook = new MyBook(title, author, price);
        
        myBook.print();
        
    }
}
