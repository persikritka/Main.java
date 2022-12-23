import personComparator.PresentComparator;
import present.Present;
import sweets.Candy;
import sweets.Chocolate;
import sweets.Marmalade;
import typeOfCandy.TypeOfCandy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("RitosAbrecos");

        Present present = new Present();

        Path path = Paths.get("demo.txt");

        StringBuilder sb = new StringBuilder();

        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(s -> sb.append(s).append("\n"));

        } catch (IOException ex) {
            // Handle exception
        }

        String contents = sb.toString();
        String delimSpace = "\n";
        String[] arr1  = contents.split(delimSpace);
        for (String uniqVal1 : arr1) {
            String arr2 = uniqVal1;
            String delimSpace1 = " ";
            String[] arr3  = arr2.split(delimSpace1);
            for(int i = 0; i < arr3.length; i++) {
                String s = arr3[i];
                String candy = "Candy";
                if(s.equals(candy)) {
                Candy bee = new Candy();
                int weightOfCandy = 0;
                weightOfCandy = Integer.parseInt(arr3[i+1]);
                bee.setWeight(weightOfCandy);
                int amountOfSugar = 0;
                amountOfSugar = Integer.parseInt(arr3[i+2]);
                bee.setAmountOfSugar(amountOfSugar);
                int amountOfCalories = 0;
                amountOfCalories = Integer.parseInt(arr3[i+3]);
                bee.setAmountOfCalories(amountOfCalories);
                String chocolate = "Chocolates";
                String marmalade = "Marmalades";
                String lollipops = "Lollipops";
                if(arr3[i+4].equals(chocolate))
                    bee.setTypeOfCandy(TypeOfCandy.Chocolates);
                if(arr3[i+4].equals(marmalade))
                    bee.setTypeOfCandy(TypeOfCandy.Marmalades);
                if((arr3[i+4].equals(lollipops)))
                    bee.setTypeOfCandy(TypeOfCandy.Lollipops);
                present.addCandy(bee);
                }

                String chocolate = "Chocolate";
                if(s.equals(chocolate)) {
                    Chocolate bee = new Chocolate();
                    int weightOfChocolate = 0;
                    weightOfChocolate = Integer.parseInt(arr3[i+1]);
                    bee.setWeight(weightOfChocolate);
                    int amountOfSugar = 0;
                    amountOfSugar = Integer.parseInt(arr3[i+2]);
                    bee.setAmountOfSugar(amountOfSugar);
                    int amountOfCalories = 0;
                    amountOfCalories = Integer.parseInt(arr3[i+3]);
                    bee.setAmountOfCalories(amountOfCalories);
                    bee.setNameOfChocolate(arr3[i+4]);
                    present.addChocolate(bee);
                }

                String marmalade = "Marmalade";
                if(s.equals(marmalade)) {
                    Marmalade bee = new Marmalade();
                    int weightOfMarmalade = 0;
                    weightOfMarmalade = Integer.parseInt(arr3[i+1]);
                    bee.setWeight(weightOfMarmalade);
                    int amountOfSugar = 0;
                    amountOfSugar = Integer.parseInt(arr3[i+2]);
                    bee.setAmountOfSugar(amountOfSugar);
                    int amountOfCalories = 0;
                    amountOfCalories = Integer.parseInt(arr3[i+3]);
                    bee.setAmountOfCalories(amountOfCalories);
                    int juiceShare = 0;
                    juiceShare = Integer.parseInt(arr3[i+4]);
                    bee.setJuiceShare(juiceShare);
                    present.addMarmalade(bee);
                }
            }

        }

        List list = new ArrayList<>();
        list = present.getList();
        int weight = 0;

       // System.out.println(list);

        PresentComparator pcomp = new PresentComparator();

     /*   Candy korovka = new Candy(123, 34, 456, TypeOfCandy.Chocolate);
      //  System.out.println(candy);
        Candy candies = new Candy();
        candies.setWeight(134);
        candies.setAmountOfCalories(452);
        candies.setAmountOfSugar(45);
        candies.setTypeOfCandy(TypeOfCandy.Lollipops);
        Candy bee = new Candy(55, 24, 230, TypeOfCandy.Marmalade);
        Chocolate milka = new Chocolate(90, 22, 450, "Milka");
        Marmalade haribo = new Marmalade(60, 20, 300, 5);
       // System.out.println(candies);

        Present present = new Present();
        present.addCandy(korovka);
        present.addCandy(bee);
        present.addChocolate(milka);
        present.addMarmalade(haribo);
       // System.out.println(present);*/



        list.sort(new PresentComparator());

        for(int i=0; i < list.size(); i++) {
            int weightOfCandy = 0;
            int weightOfMarmalade = 0;
            int weightOfChocolate = 0;
            Object element = list.get(i);
            if (element.getClass() == Candy.class) {
                Candy candy = (Candy)element;
                weightOfCandy = candy.getWeight();
            } else if (element.getClass() == Chocolate.class) {
                Chocolate chocolate = (Chocolate)element;
                weightOfChocolate = chocolate.getWeight();
            } else if (element.getClass() == Marmalade.class) {
                Marmalade marmalade = (Marmalade)element;
                weightOfMarmalade = marmalade.getWeight();
            }
            weight += weightOfCandy + weightOfChocolate + weightOfMarmalade;
        }


        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            String text = list.toString();
            writer.write(text);
            String textOfWeight = "Weight of present: " + Integer.toString(weight);
            writer.write(System.lineSeparator());
            writer.write(textOfWeight);
            writer.write(present.rangeOfSugarContent(list, 19, 22));
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

