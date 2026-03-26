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

public class Bai5 {
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

        // Đếm số sinh viên theo loại
        Map<StudentType, Long> countMap = list.stream()
                .collect(Collectors.groupingBy(Student::getType, Collectors.counting()));

        System.out.println("=== Số lượng sinh viên theo loại ===");
        countMap.forEach((k, v) -> System.out.println(k + ": " + v));

        // GPA trung bình theo loại
        Map<StudentType, Double> avgMap = list.stream()
                .collect(Collectors.groupingBy(Student::getType,
                        Collectors.averagingDouble(Student::getGpa)));

        System.out.println("\n=== GPA trung bình theo loại ===");
        avgMap.forEach((k, v) -> System.out.println(k + ": " + v));

        // Tìm loại có GPA cao nhất
        StudentType bestType = avgMap.entrySet().stream()
                .max((a, b) -> Double.compare(a.getValue(), b.getValue()))
                .get()
                .getKey();

        System.out.println("\nLoại sinh viên có GPA trung bình cao nhất: " + bestType);
    }
}
