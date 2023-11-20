package ca.college.lasalle;

import java.math.BigDecimal;
import java.time.LocalDate;
/**
 * Ayrton Amaral - 202234145
 * Bruno Landeiro - 202234156
 * Carolina Ruiz - 202234358
 * */
public class ChocolateBar extends Product implements Edible {
    private Double numberOfCalories;
    private LocalDate expiryDate;

    public ChocolateBar(String name, BigDecimal price, double numberOfCalories, LocalDate expiryDate) {
        super(name, price);
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
        return "ChocolateBar {" +
                " id = " + getId() +
                ", name = " + getName() +
                ", price = $ " + getPrice() +
                ", numberOfCalories = " + numberOfCalories +
                ", expiryDate = " + expiryDate +
                '}';
    }
}
