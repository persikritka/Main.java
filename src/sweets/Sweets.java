package sweets;

public abstract class Sweets {
    private int amountOfSugar;
    public int weight;
    private int amountOfCalories;
    public abstract int sugar();
    public abstract int weight();
    public abstract int calories();

    public void setAmountOfSugar(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAmountOfCalories(int amountOfCalories) {
        this.amountOfCalories = amountOfCalories;
    }

    public int getWeight() {
        return weight;
    }

    public int getAmountOfCalories() {
        return amountOfCalories;
    }

    public int getAmountOfSugar() {
        return amountOfSugar;
    }


}
