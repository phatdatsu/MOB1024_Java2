/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2_Bai2_9;

/**
 *
 * @author truongphatdat
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("P01", "Banh", 10, ProductCategory.FOOD));
        list.add(new Product("P02", "Sua", 15, ProductCategory.FOOD));
        list.add(new Product("P03", "TV", 500, ProductCategory.ELECTRONIC));
        list.add(new Product("P04", "Laptop", 1000, ProductCategory.ELECTRONIC));
        list.add(new Product("P05", "Ao", 20, ProductCategory.CLOTHING));
        list.add(new Product("P06", "Quan", 25, ProductCategory.CLOTHING));
        list.add(new Product("P07", "Tai nghe", 50, ProductCategory.ELECTRONIC));
        list.add(new Product("P08", "Banh mi", 5, ProductCategory.FOOD));

        // Hiển thị
        System.out.println("=== Danh sách sản phẩm ===");
        list.forEach(System.out::println);

        // Đếm số lượng
        Map<ProductCategory, Integer> countMap = new HashMap<>();

        for (Product p : list) {
            countMap.put(p.getCategory(),
                countMap.getOrDefault(p.getCategory(), 0) + 1);
        }

        System.out.println("\n=== Số lượng theo loại ===");
        for (Map.Entry<ProductCategory, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Tổng giá trị
        Map<ProductCategory, Double> sumMap = new HashMap<>();

        for (Product p : list) {
            sumMap.put(p.getCategory(),
                sumMap.getOrDefault(p.getCategory(), 0.0) + p.getPrice());
        }

        System.out.println("\n=== Tổng giá trị theo loại ===");
        for (Map.Entry<ProductCategory, Double> entry : sumMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}