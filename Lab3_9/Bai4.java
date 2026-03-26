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

public class Bai4 {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("S01", "An", StudentType.REGULAR, 3.5));
        list.add(new Student("S02", "Binh", StudentType.PART_TIME, 2.9));
        list.add(new Student("S03", "Chi", StudentType.INTERNATIONAL, 3.3));
        list.add(new Student("S04", "Dung", StudentType.REGULAR, 3.0));
        list.add(new Student("S05", "Huy", StudentType.PART_TIME, 3.1));
        list.add(new Student("S06", "Phong", StudentType.INTERNATIONAL, 3.8));
        list.add(new Student("S07", "Minh", StudentType.REGULAR, 2.7));
        list.add(new Student("S08", "Tuan", StudentType.PART_TIME, 3.4));
        list.add(new Student("S09", "Lan", StudentType.INTERNATIONAL, 3.2));
        list.add(new Student("S10", "Nga", StudentType.REGULAR, 3.9));

        System.out.println("=== INTERNATIONAL GPA >= 3.2 ===");
        list.stream()
                .filter(s -> s.getType() == StudentType.INTERNATIONAL)
                .filter(s -> s.getGpa() >= 3.2)
                .forEach(s -> System.out.println(s));

        System.out.println("\n=== TOP 3 GPA cao nhất ===");
        list.stream()
                .sorted((a, b) -> Double.compare(b.getGpa(), a.getGpa()))
                .limit(3)
                .forEach(s -> System.out.println(s));

        System.out.println("\n=== Danh sách tên sinh viên PART_TIME ===");
        List<String> partTimeNames = list.stream()
                .filter(s -> s.getType() == StudentType.PART_TIME)
                .map(s -> s.getName())
                .collect(Collectors.toList());

        partTimeNames.forEach(n -> System.out.println(n));
    }
}
