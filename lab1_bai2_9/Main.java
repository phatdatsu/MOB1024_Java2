/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_bai2_9;

/**
 *
 * @author truongphatdat
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new FulltimeEmployee("E1", "An", 1000, 200, 50));
        list.add(new FulltimeEmployee("E2", "Bình", 1200, 150, 30));
        list.add(new ParttimeEmployee("E3", "Cường", 50, 10));
        list.add(new ParttimeEmployee("E4", "Dũng", 40, 12));
        list.add(new Employee("E5", "Em", 800));

        Employee max = list.get(0);

        for (Employee e : list) {
            System.out.println(e);
            System.out.println("Income: " + e.income());

            if (e.income() > max.income()) {
                max = e;
            }
        }

        System.out.println("\nNhân viên thu nhập cao nhất:");
        System.out.println(max + " | Income: " + max.income());
    }
}
