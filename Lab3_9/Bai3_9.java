/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3_9;

/**
 *
 * @author truongphatdat
 */
import java.util.*;

public class Bai3_9 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("E01", "An", 20000000));
        list.add(new Employee("E02", "Binh", 14000000));
        list.add(new Employee("E03", "Cuong", 18000000));
        list.add(new Employee("E04", "Duc", 12000000));
        list.add(new Employee("E05", "Anh", 16000000));
        list.add(new Employee("E06", "Huy", 10000000));
        list.add(new Employee("E07", "Phuong", 22000000));
        list.add(new Employee("E08", "Minh", 15000000));

        double totalSalary = list.stream()
                .mapToDouble(e -> e.getSalary())
                .sum();

        double avgSalary = list.stream()
                .mapToDouble(e -> e.getSalary())
                .average()
                .orElse(0);

        Employee maxSalaryEmp = list.stream()
                .max((a, b) -> Double.compare(a.getSalary(), b.getSalary()))
                .orElse(null);

        System.out.println("=== THỐNG KÊ LƯƠNG ===");
        System.out.println("Tổng lương: " + totalSalary);
        System.out.println("Lương trung bình: " + avgSalary);
        System.out.println("Nhân viên lương cao nhất: " + maxSalaryEmp);
    }
}
