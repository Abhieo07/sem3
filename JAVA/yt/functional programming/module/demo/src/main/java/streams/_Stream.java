package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Aisha", FEMALE),
            new Person("Alex", MALE),
            new Person("Alexia", ANOTHER),
            new Person("Alice", FEMALE)
        );

        // by using functional interface
        // Function<Person, String> personStringFunction = person -> person.name;
        // ToIntFunction<String> length = String::length;
        // IntConsumer println = System.out::println;

        // people.stream()
        //         .map(person -> person.name)
        //         .mapToInt(String::length)
        //         .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
        .allMatch(personPredicate);

        System.out.println(containsOnlyFemales);

    }

static class Person {
    private final String name;
    private final Gender gender;

    Person(String name, Gender gender) {
        this.name = name;
        this.gender =gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name ='" + name + '\'' +
                ", gender = " + gender + '}';
    }
}

enum Gender {
    MALE,
    FEMALE,
    ANOTHER
}
}
