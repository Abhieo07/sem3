package combinatorPattern;

import java.time.LocalDate;
import static combinatorPattern.CustomerRegistraionValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
            "Alice",
            "alice@gmail.com",
            "+9156426564",
            LocalDate.of(2000, 1, 1)
        );

        // CustomerValidatorService validatorService = new CustomerValidatorService();
        // validatorService.isValid(customer);

    //    System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid We can store customer in db

        //using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
