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
import static java.util.Arrays.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       // int N = Integer.parseInt(bufferedReader.readLine().trim());
/*
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        */
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        
        String[] arrayName = new String[N];

        for(int i = 0; i < arrayName.length;i++) {
            String name = scanner.next();
            String email = scanner.next();
            Matcher m = pattern.matcher(email);

            if (m.find()) {
                arrayName[i] = name;
            }
        }
       Arrays.sort(arrayName, Comparator.nullsLast(Comparator.naturalOrder()));

        for(int j = 0; j < arrayName.length;j++) {
            if(arrayName[j] != null) {
            System.out.println(arrayName[j]);
            }
        }

     //   bufferedReader.close();
    }
}
