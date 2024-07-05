package org.bb.creational.factory.factoryMethod;

import java.util.Arrays;

public class ChickenBurgerFactory extends BurgerFactory { //ConcreteCreator
    public Burger createBurger(){
        System.out.println("Order placed to create Chicken Burger");
        Burger burger = new ChickenBurger();
        burger.setMainIngredient("chicken");
        burger.setAddOns(Arrays.asList("lettuce","Onions"));
        return burger;
    }
}
