package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function takes one argument and return one.
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiple = multipleBy10.apply(increment2);
        System.out.println(multiple);

        Function<Integer,Integer> addBy1ThenMultiplyBy10 = 
                incrementByOneFunction.andThen(multipleBy10);
        System.out.println(addBy1ThenMultiplyBy10.apply(4));
        
        //BiFunction takes two arguments and return one.
        System.out.println(incrementAndMul.apply(4,100));

    }

    static BiFunction<Integer,Integer,Integer> incrementAndMul =
            (numInc, numMul) -> (numInc + 1) * numMul;

    static Function<Integer, Integer> incrementByOneFunction = 
            number -> number + 1;

    static Function<Integer,Integer> multipleBy10 =
            number -> number * 10;

    static int incrementByOne(int number) {
        return number + 1;
    }
}
