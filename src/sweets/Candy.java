package sweets;

import present.Present;
import typeOfCandy.TypeOfCandy;

public class Candy extends Sweets {
    private TypeOfCandy typeOfCandy;
   // private Present present = new Present();
   public Candy(){};
   public Candy(int weight, int amountOfSugar, int amountOfCalories, TypeOfCandy typeOfCandy) {
       this.setAmountOfSugar(amountOfSugar);
       this.setWeight(weight);
       this.setAmountOfCalories(amountOfCalories);
       this.typeOfCandy = typeOfCandy;
   }

    @Override
    public int getAmountOfSugar() {
        return super.amountOfSugar;
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
    public int getAmountOfCalories() {
        return super.amountOfCalories;
    }

    @Override
    public int getWeight() {
        return super.weight;
    }

    public TypeOfCandy getTypeOfCandy() {
       return typeOfCandy;
    }

    public void setTypeOfCandy(TypeOfCandy typeOfCandy) {
        this.typeOfCandy = typeOfCandy;
    }

    public void setPresent() {

    }

    @Override
    public String toString() {
       String result = "Candy: weight: " + this.getWeight() +
               ", amountOfSugar:  " + this.getAmountOfSugar() +
               ", amountOfCalories: " + this.getAmountOfCalories() +
               ", typeOfCandy: " + this.getTypeOfCandy() +"\n";
       return result;
    }
}
