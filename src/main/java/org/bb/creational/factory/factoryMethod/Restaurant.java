package org.bb.creational.factory.factoryMethod;

public class Restaurant { //Client
    public static void main(String[] args) {
        BurgerFactory chickenBurgerBurgerFactory =  new ChickenBurgerFactory();
        chickenBurgerBurgerFactory.orderBurger();

        BurgerFactory veggieBurgerBurgerFactory = new VeggieBurgerFactory();
        veggieBurgerBurgerFactory.orderBurger();
    }
}
