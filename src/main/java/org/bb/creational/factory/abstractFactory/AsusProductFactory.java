package org.bb.creational.factory.abstractFactory;

import org.bb.creational.factory.abstractFactory.Gpu.AsusGpu;
import org.bb.creational.factory.abstractFactory.Gpu.Gpu;
import org.bb.creational.factory.abstractFactory.Monitor.AsusMonitor;
import org.bb.creational.factory.abstractFactory.Monitor.Monitor;

public class AsusProductFactory implements ProductFactory{ //ConcreteFactory
    @Override
    public Gpu createGPU() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
