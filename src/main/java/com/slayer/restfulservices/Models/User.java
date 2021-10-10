package com.slayer.restfulservices.Models;

import java.util.Date;
import java.util.Objects;

public class User {
    private Integer id;
    private String username;

    public User(Integer id, String username, Integer age, Date birthDate) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User id(Integer id) {
        setId(id);
        return this;
    }

    private Integer age;
    private Date birthDate;

    public User() {
    }

    public User(String username, Integer age, Date birthDate) {
        this.username = username;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public User username(String username) {
        setUsername(username);
        return this;
    }

    public User age(Integer age) {
        setAge(age);
        return this;
    }

    public User birthDate(Date birthDate) {
        setBirthDate(birthDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(age, user.age)
                && Objects.equals(birthDate, user.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age, birthDate);
    }

    @Override
    public String toString() {
        return "{" + " username='" + getUsername() + "'" + ", age='" + getAge() + "'" + ", birthDate='" + getBirthDate()
                + "'" + "}";
    }
}
