package edu.codeup.codeupspringblog.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Dogs")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int(11) UNSIGNED")
    private long id;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(nullable = false, columnDefinition = "tinyint(3)")
    private int age;

    @Column(nullable = false, columnDefinition = "char(2) DEFAULT 'XX'")
    private char reside_state ;

    public Dog(long id, String name, int age, char reside_state) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.reside_state = reside_state;
    }

    public Dog() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public char getReside_state() {
        return reside_state;
    }

    public void setReside_state(char reside_state) {
        this.reside_state = reside_state;
    }

    @Column(columnDefinition = "TEXT")
    private char reside_state ;
}
