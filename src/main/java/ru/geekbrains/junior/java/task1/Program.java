package ru.geekbrains.junior.java.task1;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> personClass = Class.forName("ru.geekbrains.junior.java.task1.Person");

        Arrays.stream(personClass.getDeclaredFields()).forEach((field) -> System.out.println(field.getName()));

        Object personInstance = personClass.getConstructors()[1].newInstance("Bob", 14);
        System.out.println(personInstance);
    }
}