package org.bb.creational.factory.abstractFactory.Monitor;

public class AsusMonitor implements Monitor { //ConcreteProduct
    @Override
    public void assemble() {
        System.out.println("Assembling ASUS Monitor");
    }
}
