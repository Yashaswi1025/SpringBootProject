package com.projectdemo.demo.entity;

import jakarta.persistence.*;

@Entity //Table
@Table(name= "Student")
public class Student {
    @Id
    @GeneratedValue
    @Column(name= "RollNo")
    private int Rollno;
    @Column(name= "Name")
    private String Name;
    @Column(name= "Branch")
    private String Branch;
    @Column(name= "Percentage")
    private float Percentage;

    public Student() {
        //default constructor
    }

    //Parameterized constructor
    public Student(int rollno, String name, String branch, float percentage) {
        this.Rollno = rollno;
        this.Name = name;
        this.Branch = branch;
        this.Percentage = percentage;
    }

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public float getPercentage() {
        return Percentage;
    }

    public void setPercentage(float percentage) {
        Percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Rollno=" + Rollno +
                ", Name='" + Name + '\'' +
                ", Branch='" + Branch + '\'' +
                ", Percentage=" + Percentage +
                '}';
    }
}

