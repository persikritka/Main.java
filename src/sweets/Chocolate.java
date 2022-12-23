package sweets;

public class Chocolate extends Sweets{

    private String nameOfChocolate;
    public Chocolate(){};
    public Chocolate(int weight, int amountOfSugar, int amountOfCalories, String nameOfChocolate) {
        this.setAmountOfSugar(amountOfSugar);
        this.setWeight(weight);
        this.setAmountOfCalories(amountOfCalories);
        this.nameOfChocolate = nameOfChocolate;
    }

    public void setNameOfChocolate(String nameOfChocolate) {
        this.nameOfChocolate = nameOfChocolate;
    }

    @Override
    public int sugar() {
        return this.getAmountOfSugar();
    }

    @Override
    public int calories() {
        return this.getAmountOfCalories();
    }

    @Override
    public int weight() {
        return this.getWeight();
    }

    @Override
    public String toString() {
        String result = "Chocolate: weight: " + this.getWeight() +
                ", amountOfSugar:  " + this.getAmountOfSugar() +
                ", amountOfCalories: " + this.getAmountOfCalories() +
                ", name of chocolate: " + this.nameOfChocolate + "\n";
        return result;
    }
}
