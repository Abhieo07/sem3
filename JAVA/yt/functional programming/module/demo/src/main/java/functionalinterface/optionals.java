package functionalinterface;

import java.util.Optional;

public class optionals {
    public static void main(String[] args) {
        //optionals value = Optional.ofNullable("hello")
            //.orElseThrow(() -> new IllegalStateException("exception"))
            //System.out.println(value);
        //Optional.ofNullable("john@gmail.com")
            //.ifPresent(email -> System.out.println("sending email to " + email));


        Optional.ofNullable(null)
            .ifPresentOrElse(
                email -> System.out.println("sending email to " + email), 
                () -> {
                    System.out.println("Cannot send email");
                });
    }
}
