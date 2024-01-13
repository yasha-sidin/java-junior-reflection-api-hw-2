package ru.geekbrains.junior.java.hw;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal {
    private int tailSize;
    public Cat(String name, int age, int tailSize) {
        super(name, age);
        this.tailSize = tailSize;
    }

    private void meow() {
        System.out.println("I'm meowing...");
    }

    @Override
    protected void makeSound() {
        meow();
    }
}
