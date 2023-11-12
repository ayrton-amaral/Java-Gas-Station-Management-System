package ca.college.lasalle;

public enum SandwichSize {
    SMALL(1, "Small"),
    MEDIUM(2, "Medium"),
    LARGE(3, "Large");
    private int id;
    private String description;
    SandwichSize(int id, String description){
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
        return "SandwichSize{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
