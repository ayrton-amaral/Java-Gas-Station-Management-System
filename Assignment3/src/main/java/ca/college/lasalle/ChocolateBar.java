package ca.college.lasalle;

import java.time.LocalDate;

public class ChocolateBar extends Product implements Edible {
    private double numberOfCalories;
    private LocalDate expiryDate;
    protected ChocolateBar(String name, double numberOfCalories, LocalDate expiryDate) {
        super(name);
        this.numberOfCalories = numberOfCalories;
        this.expiryDate = expiryDate;
    }

    @Override
    public double getNumberOfCalories() {
        return this.numberOfCalories;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    @Override
    public String toString() {
        return "ChocolateBar{" +
                "numberOfCalories=" + numberOfCalories +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
