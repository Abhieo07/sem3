package tutorial1;
import java.util.Scanner;

public class Input {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter:");
        String scanned = s.next();

        int x = Integer.parseInt(scanned); // type casting string into integer.

        System.out.println(scanned);
        System.out.println(x);
    }
    
}
