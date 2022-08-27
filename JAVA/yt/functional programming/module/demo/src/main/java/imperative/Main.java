package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> People = List.of( //for java 9 List<Person> People = List.of(...........);
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Alisa", FEMALE),
            new Person("Sanna", FEMALE),
            new Person("Maanika", FEMALE),
            new Person("LEO", MALE)
        );

        System.out.println("//Imperative approach:");

        //imperative approach
        List<Person> females = new ArrayList<>();

        for(Person person : People) {
            if(FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for(Person female : females) {
            System.out.println(female);
        }

        System.out.println("//Declarative approach:");
        //Declarative approach
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        
        List<Person> females2 = People.stream()
            .filter(personPredicate)
            .collect(Collectors.toList());
        females2.forEach(System.out::println);
        }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name="+ name + "\'" + 
                    ", gender=" + gender + 
                    '}';
        }

    }

    enum Gender {
        MALE, FEMALE
    }
}
