package exercise_5;

import java.util.Objects;

/**
 * Завдання 5
 * Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Animal з ім'ям String, int віком, хвостом Boolean.
 * У класі перевизначити метод toString, щоб висновок був наступним «Ім'я: Васька, вік: 45, хвіст: ні».
 * У класі Animal перевизначити методи equals & hashCode.
 */

public class Animal {
    String name;
    int age;
    Boolean tail;

    public Animal(String name, int age, Boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        if (this.tail) return "І'мя: " + name + ", вік: " + age + ", хвіст: " + "так (" + tail + ");";
        return "І'мя: " + name + ", вік: " + age + ", хвіст: "+ "ні (" + tail + ");";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(tail, animal.tail);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
