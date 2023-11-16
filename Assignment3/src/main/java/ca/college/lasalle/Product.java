package ca.college.lasalle;
/**
 * Ayrton Amaral - 202234145
 * Bruno Landeiro - 202234156
 * Carolina Ruiz - 202234358
 * */
public abstract class Product {
    private String name;
    protected Product(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
