package org.bb.creational.factory.abstractFactory.Gpu;

public class AsusGpu implements Gpu{ //ConcreteProduct
    @Override
    public void assemble() {
        System.out.println("Assembling ASUS GPU");
    }
}
