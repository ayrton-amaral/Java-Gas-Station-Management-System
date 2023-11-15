package ca.college.lasalle;

public class Gas extends Product{
    private double amountInTheTanks;
    public Gas(String name, double amountInTheTanks) {
        super(name);
        this.amountInTheTanks = amountInTheTanks;
    }

    public void sell(double amount){
        if(amount == 0) {
            throw new RuntimeException("Invalid amount required, has to be more than 0");
        }
        if(amountInTheTanks < amount){
            throw new RuntimeException(String
                    .format("Not enough fuel in the tanks. (%s L available)", this.amountInTheTanks));
        }
        this.amountInTheTanks -= amount;
    }

    public double getAmountInTheTanks(){
        return this.amountInTheTanks;
    }

    @Override
    public String toString() {
        return "Gas{" +
                "amountInTheTanks=" + amountInTheTanks +
                '}';
    }
}
