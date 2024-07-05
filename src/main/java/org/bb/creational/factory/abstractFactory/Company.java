package org.bb.creational.factory.abstractFactory;

import org.bb.creational.factory.abstractFactory.Gpu.Gpu;
import org.bb.creational.factory.abstractFactory.Monitor.Monitor;

/*
Abstract Factory Pattern:
Suitable for systems requiring families of related products, ensuring compatibility and consistency among products.
Follows Open closed and Single responsibility principle
Centralises the object creation code in one place

Definition:
The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

Key Characteristics:
    Multiple Product Families:
        It focuses on creating families of related or dependent products.
    Composition-Based:
        Uses composition to delegate the responsibility of creating products to concrete factory classes.
    Ensures Consistency:
        Ensures that the products created by a factory are compatible with each other.
 */

public class Company {
    public static void main(String[] args){
        ProductFactory msiProductFactory = new MsiProductFactory();
        Gpu msiGpu = msiProductFactory.createGPU();
        msiGpu.assemble();
        Monitor msiMonitor = msiProductFactory.createMonitor();
        msiMonitor.assemble();


        ProductFactory asusProductFactory = new AsusProductFactory();
        Gpu asusGpu = asusProductFactory.createGPU();
        asusGpu.assemble();
        Monitor asusMonitor = asusProductFactory.createMonitor();
        asusMonitor.assemble();
    }
}
