package org.bb.creational.factory.simpleFactory;

public class Restaurant { //Client

    public Burger orderBurger(String request){
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger burger = factory.createBurger(request);
        burger.prepareBurger();
        return burger;
    }

    public static void main(String[] args){
        Restaurant restaurant = new Restaurant();
        restaurant.orderBurger("VEGGIE");
        restaurant.orderBurger("CHICKEN");
    }
}
