package academy.belhard;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Max","Ryzhykh", Gender.MALE);
        Person person2 = new Person("Mark","Travolt", Gender.MALE);
        Person person3 = new Person("Evgeny","Khrapan", Gender.MALE);
        Person person4 = new Person("Maya","Clinton", Gender.FEMALE);
        Person person5 = new Person("Julia","Edward", Gender.FEMALE);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        for(int i = 0; i < personList.size(); i++){
            System.out.println(personList.get(i));
        }
        System.out.println("Total count of object in personList: " + personList.size());


        Person person6 = new Person("Max","Ryzhykh", Gender.MALE);
        Person person7 = new Person("Max","Ryzhykh", Gender.MALE);
        Person person8 = new Person("Evgeny","Khrapan", Gender.MALE);
        Person person9 = new Person("Julia","Edward", Gender.FEMALE);
        Person person10 = new Person("Julia","Edward", Gender.FEMALE);

        Set<Person> personSet = new HashSet<>();
        personSet.add(person6);
        personSet.add(person7);
        personSet.add(person8);
        personSet.add(person9);
        personSet.add(person10);

        for (Person person: personSet){
            System.out.println(person);
        }
        System.out.println("Total count of object in personSet: " + personSet.size());


        Person person11 = new Person("Max","Ryzhykh", Gender.MALE);
        Person person12 = new Person("Donald","Travis", Gender.MALE);
        Person person13 = new Person("Fil","Trump", Gender.MALE);
        Person person14 = new Person("Maya","Clinton", Gender.FEMALE);
        Person person15 = new Person("Matew","Kai", Gender.FEMALE);

        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1,person11);
        personMap.put(221,person12);
        personMap.put(2036,person13);
        personMap.put(473,person14);
        personMap.put(1043,person15);

        for(Map.Entry<Integer, Person> entry: personMap.entrySet()){
            System.out.println("ID: " + entry.getKey() + "   " + entry.getValue());
        }
        System.out.println("Total count of object in personMap: " + personMap.size());
    }
}