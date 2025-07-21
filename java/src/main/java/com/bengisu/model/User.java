package com.bengisu.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "User_name")
    private String name;
    @Column(name = "Last_name")
    private String lastName;

    public User()
    {

    }

    public User(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return "User{id=" + id + ", firstName='" + name + "', lastName='" + lastName + "'}";
    }
}
