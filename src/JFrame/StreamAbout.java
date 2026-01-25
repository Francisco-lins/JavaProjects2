package JFrame;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Person
{
    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    String getName()
    {
        return this.name;
    }

    int getAge()
    {
        return this.age;
    }


}

public class StreamAbout
{
    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Francisco",14));
        people.add(new Person("João",17));
        people.add(new Person("Joaquim", 15));
        people.add(new Person("Vitor",15));

        boolean list = people.stream()
                .allMatch(p -> p.getName().equals("Francisco"));

    }
}
