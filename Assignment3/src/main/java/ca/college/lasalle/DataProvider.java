package ca.college.lasalle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {



    public static List<Product> initialProducts() {
        LocalDate expiryDate = LocalDate.now().plusYears(1);
        List<Product> productList = new ArrayList<>();
        //Gas
        productList.add(new Gas("Gas", 1000));
        //Chocolate Bars
        productList.add(new ChocolateBar("Coffee Crisp Chocolate Bar", 100, expiryDate));
        productList.add(new ChocolateBar("Neilson Jersey Milk Chocolate Bar", 100,expiryDate));
        //Sandwich
        productList.add(new Sandwich("Sandwich", 200, expiryDate, SandwichSize.MEDIUM, SandwichMainIgredient.CHICKEN));
        productList.add(new Sandwich("Sandwich", 300, expiryDate, SandwichSize.LARGE, SandwichMainIgredient.MEAT));
        //Coffe
        productList.add(new Coffe("Tim Hortons", 10, expiryDate));

        return productList;
    }
}
