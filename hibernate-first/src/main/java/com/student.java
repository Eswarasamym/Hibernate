package com;

import javax.persistence.Entity;
import javax.persistence.Id;

/*entity class --- class whose objects are stored in database
 * Rules:
 * 1.annotate class with @Entity
 * 2.declare private data member
 * 3.generate getter and seter for all DM
 * 4.class should have one zero arg constructor
 * 5.class should be non abstract public class 
 * 6
 */


@Entity
public class student {
    @Id
    private int stuId;     
    private String name;   
    private double marks; 
    private long phno;     

    public student() {
        
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }
}

