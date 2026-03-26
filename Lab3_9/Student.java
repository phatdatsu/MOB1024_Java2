/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3_9;

/**
 *
 * @author truongphatdat
 */
public class Student {
    private String id;
    private String name;
    private StudentType type;
    private double gpa;

    public Student(String id, String name, StudentType type, double gpa) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public StudentType getType() {
        return type;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + type + " - GPA: " + gpa;
    }
}
