package com.my.report.entity;

public class Student {

    String name;

    int age;

    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public boolean equalsTo(Student a) {
        return (this.name.equals(a.getName())
                && this.age == a.getAge()
                && this.grade == a.getGrade());
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
