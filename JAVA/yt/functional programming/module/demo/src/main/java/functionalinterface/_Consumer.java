package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //normal java function
        Customer maria = new Customer("Maria", "999999");
        greet(maria);
        greetV2(maria, false);

        //Functional interface
        greetCustomer.accept(maria);

        greetCustomerV2.accept(maria, false);
        
    }

    static BiConsumer<Customer, Boolean> greetCustomerV2 = (customer, showNumber) -> 
        System.out.println("BiConsumer way: Hello "+ customer.name + 
        ", thanks for registering phone number "
        + (showNumber ? customer.phone : "***********"));

    static Consumer<Customer> greetCustomer = customer -> 
        System.out.println("Consumer way: Hello "+ customer.name + 
        ", thanks for registering phone number "
        + customer.phone);

    static void greet(Customer customer) {
        System.out.println("Hello "+ customer.name + 
        ", thanks for registering phone number "
        + customer.phone);
    }

    static void greetV2(Customer customer, boolean showNumber) {
        System.out.println("Traditional way for BiConsumer method: Hello "+ customer.name + 
        ", thanks for registering phone number "
        + (showNumber ? customer.phone : "***********"));
    }

    static class Customer {
        private final String name;
        private final String phone;

        Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
