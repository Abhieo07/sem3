import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and x:");
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i:arr) {
            if(arr[i] == x) {
                System.out.println("Found at " + i);
            }
        }
    }
}
