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
        String result = "Marmalade: weight: " + this.getWeight() +
                ", amountOfSugar:  " + this.getAmountOfSugar() +
                ", amountOfCalories: " + this.getAmountOfCalories() +
                ", juice share: " + this.juiceShare + "\n";
        return result;
    }
}
