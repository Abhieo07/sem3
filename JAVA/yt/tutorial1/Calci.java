package tutorial1;
import java.util.Scanner;
//-------------------LOAN CALCULATOR------------------
public class Calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amt: ");
        int amount = sc.nextInt();
        int amt = amount;
        int intrest,loanAmt = 0,remain;
        for(int i = 0; i < 3; i++) {
            intrest = amount / 10;
            amount -= amount / 10;
            loanAmt += intrest;
        }
        remain = amt - loanAmt;
        System.out.println("Remaining amt: " + remain);
    }   
}
