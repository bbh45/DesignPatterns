package org.bb.creational.factory.factoryMethod;

/*
Suitable for single product hierarchies where you want to delegate the instantiation to subclasses.

The Factory Method pattern defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
Use Cases:
Single Product Type with Variants:
    When your system requires a single type of product but allows different variations of that product. For example, different types of burgers (ChickenBurger, VeggieBurger) in a burger restaurant.

Simpler Object Creation:
    When object creation is straightforward and doesn’t require multiple related objects.

Subclasses Decide Object Creation:
    When you want to delegate the responsibility of object creation to subclasses.
*/


public abstract class BurgerFactory {  //Creator or Factory
    //follows single responsibility and open closed principle
    //open for extension and closed for modification
    //use it if you have no idea of the exacty type of objects your code will work with
    //allows introducing new products without breaking existing code
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepareBurger();
        return burger;
    }

    protected abstract Burger createBurger(); //Factory Method
}
