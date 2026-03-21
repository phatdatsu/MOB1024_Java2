/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_bai2_9;

/**
 *
 * @author truongphatdat
 */
public class Employee {
    private String id;
    private String name;
    private double basicSalary;

    public Employee(String id, String name, double basicSalary) {
        setId(id);
        this.name = name;
        setBasicSalary(basicSalary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isEmpty()) {
            System.out.println("ID không hợp lệ!");
        } else {
            this.id = id;
        }
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Lương không hợp lệ!");
        } else {
            this.basicSalary = basicSalary;
        }
    }

    public double income() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Basic Salary: " + basicSalary;
    }
}
