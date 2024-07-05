package org.bb.creational.factory.abstractFactory.Monitor;

public class MsiMonitor implements Monitor{ //ConcreteProduct
    @Override
    public void assemble() {
        System.out.println("Assembling MSI Monitor");
    }
}
