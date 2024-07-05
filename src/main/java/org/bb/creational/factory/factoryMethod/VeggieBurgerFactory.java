package org.bb.creational.factory.factoryMethod;

import java.util.Arrays;

public class VeggieBurgerFactory extends BurgerFactory { //ConcreteCreator
    public Burger createBurger(){
        System.out.println("Order placed to create Veggie Burger");
        Burger burger = new ChickenBurger();
        burger.setMainIngredient("veggies");
        burger.setAddOns(Arrays.asList("lettuce","tomato","Onions","Olives"));
        return burger;
    }
}
