package JFrame;

import java.util.*;

class Student
{

    String name;
    Integer age;

    Student(String name, Integer age)
    {
        this.age = age;
        this.name = name;
    }

    int getAge()
    {
        return this.age;
    }

    String getName()
    {
        return this.name;
    }


}


public class ComparatorAbout
{
    public static void main(String[] args)
    {
                                                            // Se for maior, retorna 1.    // Se for igual, retorna 0.   //Se for menor, retorna -1.
        Comparator<Student> com = (Student i, Student j) -> {return i.getAge() > j.getAge() ? 1 : i.getAge() == j.getAge() ? 0 : -1;
            };

        List<Student> set = new ArrayList<>();

        set.add(new Student("João", 17));
        set.add(new Student("Francisco", 14));
        set.add(new Student("Joaquim", 15));
        set.add(new Student("Heitor", 14));

        Collections.sort(set, com);

        for (Student s : set)
        {
            System.out.printf("%s, %d Anos\n", s.getName(), s.getAge());
        }


    }
}
