package ru.msaggik.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // данная аннотация помечает классы связанные с БД
@Table(name = "Person") // данная аннотация осуществляет связь с таблицей "Person"
public class Person {

    @Id // аннотация первичного ключа
    @Column(name = "id") // аннотация соответствия поля и столбца в таблице БД
    private int id;

    @Column(name = "name") // аннотация соответствия поля и столбца в таблице БД
    private String name;

    @Column(name = "age") // аннотация соответствия поля и столбца в таблице БД
    private int age;

    // аннотация Entity предполагает в данном классе пустой конструктор
    public Person() {
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

