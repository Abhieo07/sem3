import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        char[] arr2 = new char[str.length()];

        for(int i = 0; i < str.length(); i++) {
            arr2[i] = arr[str.length()-i-1];
        }
        System.out.println("Reverse string: ");
        for(int i = 0; i < str.length(); i++) {
            System.out.print(arr2[i]);
        }
    }
}
