package nl.vintik.kotlin.examples.record;

import java.util.*;

public class Person {
    private final String name;
    private final String occupation;

    public Person(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(occupation, person.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, occupation);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
