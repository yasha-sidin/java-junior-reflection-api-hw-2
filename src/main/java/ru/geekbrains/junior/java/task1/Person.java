package ru.geekbrains.junior.java.task1;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    public Person() {
        name = "Name";
        age = 25;
    }
}
