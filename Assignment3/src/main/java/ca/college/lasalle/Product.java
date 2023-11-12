package ca.college.lasalle;

public abstract class Product {
    private String name;
    protected Product(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
