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

public class Bài1_9 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("An");
        names.add("Binh");
        names.add("Cuong");
        names.add("Duc");
        names.add("Hoang");
        names.add("Phuong");
        names.add("Nguyen");
        names.add("Thanh");
        names.add("Huy");
        names.add("Minh");

        System.out.println("=== Danh sách ban đầu ===");
        names.forEach(n -> System.out.println(n));

        System.out.println("\n=== Tên có độ dài > 5 ===");
        names.stream()
                .filter(n -> n.length() > 5)
                .forEach(n -> System.out.println(n));

        System.out.println("\n=== Sắp xếp A-Z ===");
        names.stream()
                .sorted((a, b) -> a.compareToIgnoreCase(b))
                .forEach(n -> System.out.println(n));

        System.out.println("\n=== Sắp xếp theo độ dài tăng dần ===");
        names.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .forEach(n -> System.out.println(n));
    }
}