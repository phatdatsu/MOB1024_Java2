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
import java.util.stream.Collectors;

public class Bai2_9 {
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

        System.out.println("=== Danh sách nhân viên ===");
        list.forEach(e -> System.out.println(e));

        System.out.println("\n=== Nhân viên salary >= 15_000_000 ===");
        list.stream()
                .filter(e -> e.getSalary() >= 15000000)
                .forEach(e -> System.out.println(e));

        System.out.println("\n=== Sắp xếp lương giảm dần ===");
        list.stream()
                .sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
                .forEach(e -> System.out.println(e));

        System.out.println("\n=== Danh sách tên nhân viên ===");
        List<String> nameList = list.stream()
                .map(e -> e.getName())
                .collect(Collectors.toList());

        nameList.forEach(n -> System.out.println(n));

        System.out.println("\n=== Đếm số nhân viên có tên bắt đầu bằng A ===");
        long countA = list.stream()
                .filter(e -> e.getName().toUpperCase().startsWith("A"))
                .count();

        System.out.println("Số nhân viên tên bắt đầu bằng A: " + countA);
    }
}
