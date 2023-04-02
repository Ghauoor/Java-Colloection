package Comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Person {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ghayoor", 100));
        personList.add(new Person("Taimoor", 45));
        personList.add(new Person("Hussain", 50));
        personList.add(new Person("Naruto", 80));

        Collections.sort(personList);

        for (Person person : personList) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
