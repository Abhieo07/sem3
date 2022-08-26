package tutorial1;

import java.util.Scanner;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int [] arr = {1,5,7,3,4,5};
        String[] names = new String[5];
        Scanner s = new Scanner(System.in);

        int count = 0;
        for(int ele: arr) {
            System.out.println("index " + count + " ele : " + ele);
            count++;
        }

        for(int i = 0; i < names.length; i++) {
            System.out.print("enter");
            String input = s.nextLine();
            names[i] = input;
        }

        for(String n:names) {
            System.out.println(n);
            if(n.equals("abhi")) {
                break;
            }
        }
    }
}
