package ca.college.lasalle;

import java.math.BigDecimal;
import java.time.LocalDate;
/**
 * Ayrton Amaral - 202234145
 * Bruno Landeiro - 202234156
 * Carolina Ruiz - 202234358
 * */
public class Sandwich extends Product implements Edible {
    private double numberOfCalories;
    private LocalDate expiryDate;
    private SandwichSize size;
    private SandwichMainIgredient mainIgredient;
    protected Sandwich(String name, BigDecimal price, double numberOfCalories, LocalDate expiryDate, SandwichSize size, SandwichMainIgredient mainIgredient) {
        super(name, price);
        this.numberOfCalories = numberOfCalories;
        this.expiryDate = expiryDate;
        this.size = size;
        this.mainIgredient = mainIgredient;
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
        return "Sandwich{" +
                "numberOfCalories=" + numberOfCalories +
                ", expiryDate=" + expiryDate +
                ", size=" + size +
                ", mainIgredient=" + mainIgredient +
                '}';
    }
}
