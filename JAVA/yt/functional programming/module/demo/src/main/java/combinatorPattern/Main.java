package combinatorPattern;

import java.time.LocalDate;

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

        System.out.println(new CustomerValidatorService().isValid(customer));

        // We can store customer in db
    }
}
