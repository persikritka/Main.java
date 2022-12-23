package sweets;

public class Marmalade extends Sweets{
    private int juiceShare;

    public Marmalade(){};
    public Marmalade(int weight, int amountOfSugar, int amountOfCalories, int juiceShare) {
        this.setAmountOfSugar(amountOfSugar);
        this.setWeight(weight);
        this.setAmountOfCalories(amountOfCalories);
        this.juiceShare = juiceShare;
    }

    public void setJuiceShare(int juiceShare) {
        this.juiceShare = juiceShare;
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

    @Override
    public String toString() {
        String result = "Marmalade: weight: " + this.getWeight() +
                ", amountOfSugar:  " + this.getAmountOfSugar() +
                ", amountOfCalories: " + this.getAmountOfCalories() +
                ", juice share: " + this.juiceShare + "\n";
        return result;
    }
}
