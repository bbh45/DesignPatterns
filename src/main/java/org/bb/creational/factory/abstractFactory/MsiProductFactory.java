package org.bb.creational.factory.abstractFactory;

import org.bb.creational.factory.abstractFactory.Gpu.Gpu;
import org.bb.creational.factory.abstractFactory.Gpu.MsiGpu;
import org.bb.creational.factory.abstractFactory.Monitor.Monitor;
import org.bb.creational.factory.abstractFactory.Monitor.MsiMonitor;

public class MsiProductFactory implements ProductFactory{ //ConcreteFactory
    @Override
    public Gpu createGPU() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
