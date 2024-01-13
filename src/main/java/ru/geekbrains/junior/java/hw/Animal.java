package ru.geekbrains.junior.java.hw;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Animal {
    private String name;
    private int age;

    protected abstract void makeSound();
}
