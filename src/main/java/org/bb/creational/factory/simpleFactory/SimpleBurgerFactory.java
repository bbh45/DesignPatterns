package org.bb.creational.factory.simpleFactory;

import java.util.Arrays;

public class SimpleBurgerFactory { //Factory or Creator
    //We have loosened the coupling by separating this products construction code(Factory)
    // from the code that uses this product(Client)
    //This class sole purpose is creating Objects - Follows single responsibility principle
    //But is open for modification
    //When we add more recipes to our menu, we will have to open this method and change it by adding more if statements
    //we can solve this using Factory Method design pattern
    public Burger createBurger(String request){
        Burger burger = null;
        if("CHICKEN".equals(request)){
            burger = new ChickenBurger();
            burger.setMainIngredient("chicken");
            burger.setAddOns(Arrays.asList("lettuce","Onions"));
        }
        if("VEGGIE".equals(request)){
            burger = new VeggieBurger();
            burger.setMainIngredient("veggies");
            burger.setAddOns(Arrays.asList("lettuce","tomato","Onions","Olives"));
        }
        return burger;
    }
}
