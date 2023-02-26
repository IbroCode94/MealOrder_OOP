package org.example;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item("drink","coke",1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avacado = new Item("Toppings", "Avacado", 1.40);
        avacado.printItem();

        Burger burger = new Burger("regular", 4.00);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();
        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();
        MealOrder secondMEal = new MealOrder("turkey", "7-up","chilli");
        secondMEal.addBurgerToppings("LETTUCE,","CHEESE", "MAYO");
        secondMEal.setDrinkSize("SMALL");
        secondMEal.printItemizedList();
  }

}