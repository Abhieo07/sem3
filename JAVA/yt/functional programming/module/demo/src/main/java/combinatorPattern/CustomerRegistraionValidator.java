package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static combinatorPattern.CustomerRegistraionValidator.*;
import static combinatorPattern.CustomerRegistraionValidator.ValidationResult.*;

public interface CustomerRegistraionValidator 
       extends Function <Customer, ValidationResult> {

    static CustomerRegistraionValidator isEmailValid() {
        System.out.println("running email validation...");
        return customer -> customer.getEmail().contains("@") ?
               SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistraionValidator isPhoneValid() {
        System.out.println("running phone validation...");
        return customer -> customer.getPhone().startsWith("+91") ?
               SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistraionValidator isAnAdult() {
        System.out.println("running age validation...");
        return customer -> 
                Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                    SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistraionValidator and (CustomerRegistraionValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }
    
    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
