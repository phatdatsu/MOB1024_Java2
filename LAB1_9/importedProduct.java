/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1_9;

/**
 *
 * @author truongphatdat
 */
public class importedProduct extends product {

    private double importTaxRate;
    private double shippingFee;

    public importedProduct(String id, String name, double basePrice,
                           double importTaxRate, double shippingFee) {
        super(id, name, basePrice);
        this.importTaxRate = importTaxRate;
        this.shippingFee = shippingFee;
    }

    public double getimportTaxRate() {
        return importTaxRate;
    }

    public void setmportTaxRate(double importTaxRate) {
        if(importTaxRate >= 0 && importTaxRate <= 1){
            this.importTaxRate = importTaxRate;
        }
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(double shippingFee) {
        if(shippingFee >= 0){
            this.shippingFee = shippingFee;
        }
    }

    @Override
    public double finalPrice(){
        return getBasePrice() + getBasePrice()*importTaxRate + shippingFee;
    }
}
