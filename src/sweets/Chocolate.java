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
    public String toString() {
        String result = "Chocolate: weight: " + this.getWeight() +
                ", amountOfSugar:  " + this.getAmountOfSugar() +
                ", amountOfCalories: " + this.getAmountOfCalories() +
                ", name of chocolate: " + this.nameOfChocolate + "\n";
        return result;
    }

    @Override
    public void setAmountOfSugar(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void setAmountOfCalories(int amountOfCalories) {
        this.amountOfCalories = amountOfCalories;
    }

    @Override
    public int getWeight() {
        return super.weight;
    }

    @Override
    public int getAmountOfCalories() {
        return super.amountOfCalories;
    }

    @Override
    public int getAmountOfSugar() {
        return super.amountOfSugar;
    }
}
