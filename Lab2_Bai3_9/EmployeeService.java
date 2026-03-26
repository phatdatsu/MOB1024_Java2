/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2_Bai3_9;

/**
 *
 * @author truongphatdat
 */
import java.util.*;

public class EmployeeService {
    private List<Employee> list = new ArrayList<>();

    public void add(Employee e) {
        list.add(e);
    }

    public void display() {
        list.forEach(System.out::println);
    }

    public Employee findById(String id) {
        for (Employee e : list) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }

    public void updateSalary(String id, double newSalary) {
        Employee e = findById(id);
        if (e != null) {
            e.setSalary(newSalary);
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Không tìm thấy!");
        }
    }
}