package org.bb.creational.factory.factoryMethod;

import java.util.List;
import java.util.UUID;

public abstract class Burger { //interface or abstract Product

    protected final String productId;
    protected String mainIngredient;
    protected List<String> addOns;

    Burger(){
        this.productId = String.valueOf(UUID.randomUUID());
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public void setAddOns(List<String> addOns) {
        this.addOns = addOns;
    }

    public abstract void prepareBurger();

}
