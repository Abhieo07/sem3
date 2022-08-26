package tutorial1;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] newArr = new String[5];
        System.out.println("Enter value of n and x: ");
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
       
       for(int i = 0; i < arr.length; i++) {
        System.out.print("Enter element");
        arr[i] = sc.nextInt();
       }  
       for(int i = 0; i < arr.length; i++) {
        if(arr[i] == x) {
            System.out.println("FOUND");
            break;
        }
       }
       System.out.print("Elements of array");
       for(int i = 0; i < arr.length; i++) {
        System.out.print("\t" + arr[i]);
       }
    }
    
}
