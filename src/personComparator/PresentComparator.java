package personComparator;

import present.Present;
import sweets.Candy;
import sweets.Chocolate;
import sweets.Marmalade;
import sweets.Sweets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PresentComparator implements Comparator<Sweets> {
    private List list = new ArrayList<>();

    @Override
    public int compare(Sweets firstSweets, Sweets secondSweets) {

        Object element_1 = firstSweets;
        Object element_2 = secondSweets;
        if (element_1.getClass() == Candy.class) {
            if(element_2.getClass() == Marmalade.class) {
                Candy candy =(Candy)element_1;
                Marmalade marmalade = (Marmalade)element_2;
                if(candy.getWeight() < marmalade.getWeight()){
                    return -1;
                } else if(candy.getWeight() > marmalade.getWeight()) {
                    return 1;
                } else return 0;
            } else if (element_2.getClass() == Chocolate.class) {
                Candy candy =(Candy)element_1;
                Chocolate chocolate = (Chocolate)element_2;
                if(candy.getWeight() < chocolate.getWeight()){
                    return -1;
                } else if(candy.getWeight() > chocolate.getWeight()) {
                    return 1;
                } else return 0;
            } else if(element_2.getClass() == Candy.class) {
                Candy firstCandy =(Candy)element_1;
                Candy secondCandy =(Candy)element_2;
                if(firstCandy.getWeight() < secondCandy.getWeight()){
                    return -1;
                } else if(firstCandy.getWeight() > secondCandy.getWeight()) {
                    return 1;
                } else return 0;
            }
        } else if(element_1.getClass() == Marmalade.class) {
            if(element_2.getClass() == Marmalade.class) {
                Marmalade firstMarmalade =(Marmalade) element_1;
                Marmalade secondMarmalade = (Marmalade) element_2;
                if(firstMarmalade.getWeight() < secondMarmalade.getWeight()){
                    return -1;
                } else if(firstMarmalade.getWeight() > secondMarmalade.getWeight()) {
                    return 1;
                } else return 0;
            } else if (element_2.getClass() == Chocolate.class) {
                Marmalade marmalade =(Marmalade) element_1;
                Chocolate chocolate = (Chocolate)element_2;
                if(marmalade.getWeight() < chocolate.getWeight()){
                    return -1;
                } else if(marmalade.getWeight() > chocolate.getWeight()) {
                    return 1;
                } else return 0;
            } else if(element_2.getClass() == Candy.class) {
                Marmalade marmalade =(Marmalade) element_1;
                Candy candy =(Candy)element_2;
                if(marmalade.getWeight() < candy.getWeight()){
                    return -1;
                } else if(marmalade.getWeight() > candy.getWeight()) {
                    return 1;
                } else return 0;
            }
        } else if(element_1.getClass() == Chocolate.class) {
            if(element_2.getClass() == Marmalade.class) {
                Chocolate chocolate =(Chocolate) element_1;
                Marmalade marmalade = (Marmalade) element_2;
                if(chocolate.getWeight() < marmalade.getWeight()){
                    return -1;
                } else if(chocolate.getWeight() > marmalade.getWeight()) {
                    return 1;
                } else return 0;
            } else if (element_2.getClass() == Chocolate.class) {
                Chocolate chocolate_1 =(Chocolate) element_1;
                Chocolate chocolate = (Chocolate)element_2;
                if(chocolate_1.getWeight() < chocolate.getWeight()){
                    return -1;
                } else if(chocolate_1.getWeight() > chocolate.getWeight()) {
                    return 1;
                } else return 0;
            } else if(element_2.getClass() == Candy.class) {
                Chocolate chocolate =(Chocolate) element_1;
                Candy candy =(Candy)element_2;
                if(chocolate.getWeight() < candy.getWeight()){
                    return -1;
                } else if(chocolate.getWeight() > candy.getWeight()) {
                    return 1;
                } else return 0;
            }
        }
        return 0;
    }
}
