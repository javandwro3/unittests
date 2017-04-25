package pl.jwrabel;

/**
 * Created by jakubwrabel on 25.04.2017.
 */
public class Person {
    // POLA -- STAN
    private static final String NAME_PREFIX = "IMIĘ: ";
    private String name;

    public Person(String name) {
        this.name = name;
    }

// KONSTRUKTORY
//    public Person(){
//
//    }

    // default - bez modyfikatora, dostęp pakietowy
    // public - publiczny, wszyscy mają dostęp
    // private - wewnątrz klasy
    // protected - wewnątrz klasy + wewnątrz klas dziedziczących

    public String getName() {
        return name;
    }

    // METODY
    void printName() {
        System.out.println(name);
        printName2();
    }

    private void printName2() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                NAME_PREFIX + name + '\'' +
                '}';
    }
}
