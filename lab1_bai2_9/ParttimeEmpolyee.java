/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_bai2_9;

/**
 *
 * @author truongphatdat
 */
class ParttimeEmployee extends Employee {
    private double workingHours;
    private double hourlyRate;

    public ParttimeEmployee(String id, String name,
                            double workingHours, double hourlyRate) {
        super(id, name, 0);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double income() {
        return workingHours * hourlyRate;
    }
}
