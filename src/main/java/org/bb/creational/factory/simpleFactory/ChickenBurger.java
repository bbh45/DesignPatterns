package org.bb.creational.factory.simpleFactory;

public class ChickenBurger extends Burger{ //Concrete Product

    public ChickenBurger(){
        super();
    }

    @Override
    public void prepareBurger() {
        System.out.print(productId+ ": Burger prepared with "+ mainIngredient+" patty and addons as ");
        for(String addOn: addOns){
            System.out.print(addOn+ " , ");
        }
        System.out.println();
    }
}
