/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2_Bai1_9;

/**
 *
 * @author truongphatdat
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("S01", "An", StudentType.REGULAR));
        list.add(new Student("S02", "Binh", StudentType.PART_TIME));
        list.add(new Student("S03", "Chi", StudentType.INTERNATIONAL));
        list.add(new Student("S04", "Dung", StudentType.REGULAR));
        list.add(new Student("S05", "Em", StudentType.PART_TIME));
        list.add(new Student("S06", "Phong", StudentType.INTERNATIONAL));

        // Hiển thị tất cả
        System.out.println(" Danh sách sinh viên ");
        list.forEach(System.out::println);

        // Hiển thị theo từng loại
        System.out.println("\n=== Theo từng loại ===");
        for (StudentType type : StudentType.values()) {
            System.out.println("\n" + type + ":");
            list.stream()
                .filter(s -> s.getType() == type)
                .forEach(System.out::println);
        }

        // Đếm số lượng
        System.out.println("\n=== Số lượng mỗi loại ===");
        for (StudentType type : StudentType.values()) {
            long count = list.stream()
                             .filter(s -> s.getType() == type)
                             .count();
            System.out.println(type + ": " + count);
        }
    }
}