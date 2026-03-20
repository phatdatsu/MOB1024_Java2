/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1_9;

/**
 *
 * @author truongphatdat
 */
public class product {
    private String id;
    private String name;
    private double basePrice;
   public product(String id, String name, double basePrice) {
        setId(id);
        setName(name);
        setBasePrice(basePrice);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id == null || id.isEmpty()){
            System.out.println("ID khong duoc rong");
        }else{
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        if(basePrice >= 0){
            this.basePrice = basePrice;
        }else{
            System.out.println("Gia phai >= 0");
        }
    }

    public double finalPrice(){
        return basePrice;
    }

    @Override
    public String toString(){
        return "ID: " + id +
               ", Name: " + name +
               ", Base Price: " + basePrice +
               ", Final Price: " + finalPrice();
    }
}