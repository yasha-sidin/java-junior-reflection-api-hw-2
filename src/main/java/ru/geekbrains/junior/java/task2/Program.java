package ru.geekbrains.junior.java.task2;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
        Employee employee = new Employee("Jacob", "yashasidin333@yandex.ru");
        System.out.println(QueryBuilder.buildInsertQuery(employee));
        System.out.println(QueryBuilder.buildSelectQuery(Employee.class, employee.getId()));
        employee.setEmail("set@gmail.com");
        System.out.println(QueryBuilder.buildUpdateQuery(employee));
        System.out.println(QueryBuilder.buildDeleteQuery(employee.getClass(), employee.getId()));
    }
}
