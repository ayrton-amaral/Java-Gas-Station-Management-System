package ca.college.lasalle;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public static List<Product> initialProducts() {
        LocalDate expiryDate = LocalDate.now().plusYears(1);
        List<Product> productList = new ArrayList<>();
        //Gas
        productList.add(new Gas("Gas", new BigDecimal(1.64), 1000));
        //Chocolate Bars
        productList.add(new ChocolateBar("Kit Kat", new BigDecimal(1.75), 518, expiryDate));
        productList.add(new ChocolateBar("Aero",new BigDecimal(2.25) ,230, expiryDate));
        //Sandwich
        productList.add(new Sandwich("Chicken Sandwich", new BigDecimal(5.64), 283, expiryDate, SandwichSize.MEDIUM, SandwichMainIgredient.CHICKEN));
        productList.add(new Sandwich("Boeuf Sandwich", new BigDecimal(7.64), 362, expiryDate, SandwichSize.LARGE, SandwichMainIgredient.MEAT));
        productList.add(new Sandwich("Veggie Sandwich", new BigDecimal(10.64), 266, expiryDate, SandwichSize.SMALL, SandwichMainIgredient.VEGGIE));
        //Coffe
        productList.add(new Coffee("Black Coffee", new BigDecimal(1.25), 5, expiryDate));
        productList.add(new Coffee("Iced Latte", new BigDecimal(3.50), 130, expiryDate));
        productList.add(new Coffee("Mochaccino", new BigDecimal(4.75), 212, expiryDate));

        return productList;
    }

}
