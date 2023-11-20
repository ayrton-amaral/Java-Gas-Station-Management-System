package ca.college.lasalle;

import java.math.BigDecimal;
import java.time.LocalDate;
/**
 * Ayrton Amaral - 202234145
 * Bruno Landeiro - 202234156
 * Carolina Ruiz - 202234358
 * */
public class Coffe extends Product implements Edible {
    private Double numberOfCalories;
    private LocalDate expiryDate;
    protected Coffe(String name, BigDecimal price, double numberOfCalories, LocalDate expiryDate) {
        super(name,price);
        this.numberOfCalories = numberOfCalories;
        this.expiryDate = expiryDate;
    }

    @Override
    public Double getNumberOfCalories() {
        return this.numberOfCalories;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    @Override
    public String toString() {
        return "Coffe{" +
                "numberOfCalories=" + numberOfCalories +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
