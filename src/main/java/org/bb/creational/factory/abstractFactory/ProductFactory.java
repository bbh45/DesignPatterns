package org.bb.creational.factory.abstractFactory;

import org.bb.creational.factory.abstractFactory.Gpu.Gpu;
import org.bb.creational.factory.abstractFactory.Monitor.Monitor;

public interface ProductFactory { //AbstractFactory
    public abstract Gpu createGPU();
    public abstract Monitor createMonitor();

}
