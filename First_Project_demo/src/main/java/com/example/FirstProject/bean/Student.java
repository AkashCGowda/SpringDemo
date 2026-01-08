package com.example.FirstProject.bean;

public class Student {
    private Integer ID;
    private String firstname;
    private String secondname;

    public Student(Integer ID, String firstname, String secondname) {
        this.ID = ID;
        this.firstname = firstname;
        this.secondname = secondname;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }
}