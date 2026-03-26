/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2_Bai3_9;

/**
 *
 * @author truongphatdat
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {
            System.out.println("\n1. Thêm");
            System.out.println("2. Hiển thị");
            System.out.println("3. Tìm");
            System.out.println("4. Cập nhật lương");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Lương: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    service.add(new Employee(id, name, salary));
                    break;

                case 2:
                    service.display();
                    break;

                case 3:
                    System.out.print("Nhập ID: ");
                    Employee e = service.findById(sc.nextLine());
                    System.out.println(e != null ? e : "Không tìm thấy");
                    break;

                case 4:
                    System.out.print("ID: ");
                    String idUpdate = sc.nextLine();
                    System.out.print("Lương mới: ");
                    double newSalary = sc.nextDouble();
                    sc.nextLine();
                    service.updateSalary(idUpdate, newSalary);
                    break;

                case 0:
                    return;
            }
        }
    }
}