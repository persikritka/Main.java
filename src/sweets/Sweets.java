package sweets;

public abstract class Sweets {
    protected int amountOfSugar;
    protected int weight;
    protected int amountOfCalories;

    public abstract void setAmountOfSugar(int amountOfSugar);

    public abstract void setWeight(int weight);

    public abstract void setAmountOfCalories(int amountOfCalories);

    public abstract int getWeight();

    public abstract int getAmountOfCalories();

    public abstract int getAmountOfSugar();


}
