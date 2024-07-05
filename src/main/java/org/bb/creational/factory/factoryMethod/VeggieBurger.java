package org.bb.creational.factory.factoryMethod;

public class VeggieBurger extends Burger { //Concrete Product

    public VeggieBurger(){
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
