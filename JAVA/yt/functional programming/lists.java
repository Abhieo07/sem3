import java.util.*;

public class lists {
    public static void main(String[] args) {
        List<Person> list = List.of(
            new Person("name1"),
            new Person("name2"),
            new Person("name3")
        );

        List<Person> names = new ArrayList<>();
        for(Person name: list) {
            names.add(name);
        }

        for(Person people: names) {
            System.out.println(people);
        }
    }

    
    static class Person {
        private final String name;

        Person(String name) {
            this.name = name;
        }

    }
}