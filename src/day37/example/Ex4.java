package day37.example;

import day37.example.objects.Food;
import day37.example.objects.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        Food ozbekPilav = new Food();
        ozbekPilav.name = "Ozbek Pilav";
        // this is
        ozbekPilav.ingredients = new ArrayList<>();
        // same as this:->
        int a = 5;
        int b = a;


        // creating rice ingredient
        Ingredient rice = new Ingredient();
        rice.name = "rice";
        rice.price = 1.5f;
        rice.amount = 3;//glass of rice

        ozbekPilav.ingredients.add(rice);



        // creating rice ingredient
        Ingredient meat = new Ingredient("meat", 3.67, 2);
        ozbekPilav.ingredients.add(meat);

        ozbekPilav.ingredients.add(new Ingredient("oil", 1.07, 2));

    }
}
