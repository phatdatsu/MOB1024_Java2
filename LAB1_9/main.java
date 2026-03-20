/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1_9;

/**
 *
 * @author truongphatdat
 */
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<product> ds = new ArrayList<>();

        // Tạo 5 sản phẩm (ít nhất 2 imported)
        ds.add(new product("P1", "Laptop", 1500));
        ds.add(new product("P2", "Phone", 800));
        ds.add(new importedProduct("P3", "Camera", 1000, 0.1, 50));
        ds.add(new importedProduct("P4", "Tablet", 700, 0.15, 40));
        ds.add(new product("P5", "Mouse", 50));

        System.out.println("=== DANH SACH SAN PHAM ===");

        product max = ds.get(0);

        // In danh sách + tìm giá cao nhất
        for(product p : ds){
            System.out.println(p);

            if(p.finalPrice() > max.finalPrice()){
                max = p;
            }
        }

        // In sản phẩm giá cao nhất
        System.out.println("\nSan pham co gia cao nhat:");
        System.out.println(max);
    }
}
