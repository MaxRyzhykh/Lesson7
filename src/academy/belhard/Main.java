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


        int count = 0;
        for(int i = 0; i < personList.size(); i++){
            System.out.println(personList.get(i));
            count += 1;
        }
        System.out.println("Общее количество объектов коллекции: " + count);

    }
}
