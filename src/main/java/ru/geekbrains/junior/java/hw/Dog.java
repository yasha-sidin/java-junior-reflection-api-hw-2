package ru.geekbrains.junior.java.hw;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog extends Animal {
    private int size;

    public Dog(String name, int age, int size) {
        super(name, age);
        this.size = size;
    }

    private void bark() {
        System.out.println("I'm barking...");
    }

    @Override
    protected void makeSound() {
        bark();
    }
}
