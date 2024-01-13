package ru.geekbrains.junior.java.hw;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Animal[] animals = new Animal[] { new Dog("Bob", 12, 10), new Cat("Teddy", 1, 10), new Dog("Bim", 12, 20) };
        for (Animal animal : animals) {
            int index = 0;
            System.out.println("\tAnimal's name: " + animal.getName());
            System.out.println("Class name: " + animal.getClass().getSimpleName());
            System.out.println("Fields: ");
            Field[] fieldsSuper = animal.getClass().getSuperclass().getDeclaredFields();
            Field[] fields = animal.getClass().getFields();
            for (Field field : fieldsSuper) {
                field.setAccessible(true);
                System.out.println(++index + ") " + field.getName() + " -> " + field.get(animal));
                field.setAccessible(false);
            }
            for (Field field : fields) {
                field.setAccessible(true);
                System.out.println(++index + ") " + field.getName() + " -> " + field.get(animal));
                field.setAccessible(false);
            }
            System.out.println("Methods: ");
            index = 0;
            Method[] methodsSuper = animal.getClass().getSuperclass().getDeclaredMethods();
            Method[] methods = animal.getClass().getDeclaredMethods();
            Method makeSound = null;
            for (Method method : methodsSuper) {
                if (!method.getName().equals("makeSound")) {
                    System.out.println(++index + ") " + ((method.canAccess(animal)) ? "public " : "private ") + method.getName());
                }
                makeSound = method;
            }
            for (Method method : methods) {
                    System.out.println(++index + ") " + ((method.canAccess(animal)) ? "public " : "private ") + method.getName());
            }
            if (makeSound != null) {
                System.out.println("Execution of 'makeSound()' method:");
                makeSound.setAccessible(true);
                makeSound.invoke(animal);
                makeSound.setAccessible(false);
            }
        }
    }
}
