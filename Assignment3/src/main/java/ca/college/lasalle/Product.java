package ca.college.lasalle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

/**
 * Ayrton Amaral - 202234145
 * Bruno Landeiro - 202234156
 * Carolina Ruiz - 202234358
 * */

public abstract class Product {
    private static Integer count = 1;
    private Integer id;
    private String name;
    private BigDecimal price;

    protected Product(String name, BigDecimal price){
        this.id = count++;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        if(Objects.nonNull(price))
            return price.setScale(2, RoundingMode.HALF_EVEN);

        return BigDecimal.ZERO;
    }
}