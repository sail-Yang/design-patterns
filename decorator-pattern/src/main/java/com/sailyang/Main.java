package com.sailyang;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new ConcreteCoffee();
        System.out.println(coffee.getDescription() + " costs: " + coffee.getCost());

        Coffee vanillaCoffee = new VanillaCoffee(coffee);
        System.out.println(vanillaCoffee.getDescription() + " costs: " + vanillaCoffee.getCost());

        Coffee milkVanillaCoffee = new MilkCoffee(vanillaCoffee);
        System.out.println(milkVanillaCoffee.getDescription() + " costs: " + milkVanillaCoffee.getCost());
    }
}