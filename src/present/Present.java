package present;

import personComparator.PresentComparator;
import sweets.Candy;
import sweets.Chocolate;
import sweets.Marmalade;
import sweets.Sweets;

import java.util.ArrayList;
import java.util.List;

public class Present extends PresentComparator {
    private int weight;
    private List list = new ArrayList<>();

    public void addCandy(Candy candy) {
        list.add(candy);
    }

    public void addChocolate(Chocolate chocolate) {
        list.add(chocolate);
    }

    public void addMarmalade(Marmalade marmalade) {
        list.add(marmalade);
    }

    public int weight() {
        for(Object object: list) {

        }
        return weight;
    }

    public List getList() {
        return list;
    }

    public String rangeOfSugarContent(List list, int firstAmountOfSugar, int secondAmountOfSugar) {
       Candy arrayOfSweets[] = new Candy[list.size()];
        Marmalade arrayOfMarmalade[] = new Marmalade[list.size()];
        Chocolate arrayOfChocolate[] = new Chocolate[list.size()];
        int i;
        int j = 0;
        int k  = 0;
        int f  = 0;
        for (i = 0; i < list.size(); i++) {
            if(list.get(i).getClass() == Candy.class) {
                Candy candy = (Candy)list.get(i);
                int amountOfSugar = candy.sugar();
                if (amountOfSugar <= secondAmountOfSugar && amountOfSugar >= firstAmountOfSugar) {
                    arrayOfSweets[j] = candy;
                    j++;
                }
            } else if (list.get(i).getClass() == Marmalade.class) {
                Marmalade marmalade = (Marmalade)list.get(i);
                if(marmalade.sugar() >= firstAmountOfSugar && marmalade.sugar() <= secondAmountOfSugar) {
                    arrayOfMarmalade[k] = marmalade;
                    k++;
                }
            } else if (list.get(i).getClass() == Chocolate.class) {
                Chocolate chocolate = (Chocolate)list.get(i);
                if(chocolate.sugar() >= firstAmountOfSugar && chocolate.sugar() <= secondAmountOfSugar) {
                    arrayOfChocolate[f] = chocolate;
                    f++;
                }
            }
        }
        String string = "\n";
        for (int l = 0; l < arrayOfSweets.length; l++) {
            if(arrayOfSweets[l] != null) {
                string += arrayOfSweets[l].toString() + "\n";
                //System.out.println(arrayOfSweets[l]);
            }
        }
        for (int l = 0; l < arrayOfChocolate.length; l++) {
            if(arrayOfChocolate[l] != null) {
                string += arrayOfChocolate[l].toString() + "\n";

            }
                // System.out.println(arrayOfChocolate[l]);

        }
        for (int l = 0; l < arrayOfMarmalade.length; l++) {
            if(arrayOfMarmalade[l] != null) {
                string += arrayOfMarmalade[l].toString() + "\n";
            }
               // System.out.println(arrayOfMarmalade[l]);
        }

        return string;
    }

    @Override
    public String toString() {
        Object[] objects = list.toArray();
        String result = "";
        for(int i = 0; i< list.size(); i++) {
            result += objects[i];
        }
        return result;
    }



}
