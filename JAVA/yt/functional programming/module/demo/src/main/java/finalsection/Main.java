package finalsection;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("john", null, value -> {
            System.out.println("no last name provided for " + value);
        });

        hello2("john",
              null,
              () ->  System.out.println("no last name provided"));
    }

    static void hello(String first, String last, Consumer<String> callback) {
        System.out.println(first);
        if(last != null) {
            System.out.println(last);
        } else {
            callback.accept(first);
        }
    }

    static void hello2(String first, String last, Runnable callback) {
        System.out.println(first);
        if(last != null) {
            System.out.println(last);
        } else {
            callback.run();
        }
    }

    // function hello(first,last,callback) {
    //     console.log(first);
    //     if(last) {
    //         console.log(last);
    //     }else 
    //     callback();
    // }
}
