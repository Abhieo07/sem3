import java.util.*;
class swap
{
    public static void main(String args[])
    {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = t.nextInt();
        int b = t.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+"b = "+b);
    }
}