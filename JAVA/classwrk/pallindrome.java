import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = reverse(s1);

        if(s1.equals(s2))
        System.out.println("String is pallindrome");
        else
        System.out.println("String is not pallindrome");
    }
    static String reverse(String s1) {
        char temp;
        char a[] = s1.toCharArray();
        int i = 0;
        int j = s1.length() - 1;

        while(i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        String p = new String(a);
        return p;
    }
}
