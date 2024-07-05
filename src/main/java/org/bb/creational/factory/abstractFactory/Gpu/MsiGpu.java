package org.bb.creational.factory.abstractFactory.Gpu;

public class MsiGpu implements Gpu { //ConcreteProduct

    @Override
    public void assemble() {
        System.out.println("Assembling MSI GPU");
    }
}
