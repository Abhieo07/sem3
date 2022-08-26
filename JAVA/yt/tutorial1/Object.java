package tutorial1;
import java.util.Scanner;

public class Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // sc.next();

        abhi("Abhi");


    }
    public static void abhi(String str) {
        for(int i :str.toCharArray()) {
            System.out.println("Hello " + str +"!");
        }
    }
}
