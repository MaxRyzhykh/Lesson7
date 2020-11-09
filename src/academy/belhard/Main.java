package academy.belhard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Max","Ryzhykh", Gender.MALE);
        Person person2 = new Person("Max","Ryzhykh", Gender.MALE);
        Person person3 = new Person("Evgeny","Khrapan", Gender.MALE);
        Person person4 = new Person("Julia","Edward", Gender.FEMALE);
        Person person5 = new Person("Eva","Fox", Gender.FEMALE);


        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
        System.out.println(person5.toString());

        System.out.println(personList.get(0));
    }
}
