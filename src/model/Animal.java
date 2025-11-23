package model;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    boolean haveTail;

    public Animal(String name, int age, boolean haveTail) {
        this.age = age;
        this.haveTail = haveTail;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", вік: " + age + ", хвіст: " + (haveTail ? "так" : "ні");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && haveTail == animal.haveTail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, haveTail);
    }
}
