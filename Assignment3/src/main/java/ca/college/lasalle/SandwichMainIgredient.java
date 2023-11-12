package ca.college.lasalle;

public enum SandwichMainIgredient {
    CHICKEN(1, "Chicken"),
    MEAT(2, "Meat"),
    VEGIE(3, "Vegie");
    private int id;
    private String description;
    SandwichMainIgredient(int id, String description){
        this.id = id;
        this.description = description;
    }
    public int getId(){
        return this.id;
    }
    public String getDescription(){
        return this.description;
    }

    @Override
    public String toString() {
        return "SandwichMainIgredient{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
