package ru.geekbrains.junior.java.task2;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Table(name = "users")
public class Employee {
    @Column(name = "id", primaryKey = true)
    private UUID id;
    @Column(name = "username")
    private String username;
    @Column(name = "username")
    private String email;
    private int someParam;

    public Employee(String username, String email) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.email = email;
    }


}
