package tutorial1;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: " );
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if(s.equals(age >= 18)) {
            System.out.println("Input your fav food");
            String food = sc.nextLine();

            if(food.equals("pizza")){
                System.out.println("Mine too");
            }
        }
        else if(s.equals(age >= 13)){
            System.out.println("you are a teenager");
        }
        else {
            System.out.println("You are neither a teen nor an adult" );
        }

    }
}
