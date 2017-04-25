package pl.jwrabel;

/**
 * Created by jakubwrabel on 25.04.2017.
 */
public class PersonMain {
    public static void main(String[] args) {
        int x;

//        Person person; // domyślnie null

        int y; // deklaracja
        y = 0; // inicjalizacja

//        Person person = new Person();
//        person.name = "Adam";
//        person.printName();
//
//        Person person2 = new Person();
//        person2.setName("Jan");
//        person2.printName();


        Person person3 = new Person("Kuba");
        person3.printName();

        System.out.println("--- TO STRING ---");
        System.out.println(person3);
    }
}
