package carfactory.parts.factory;

import carfactory.parts.Buffer;
import carfactory.parts.Engine;
import carfactory.parts.VolvoBuffer;
import carfactory.parts.VolvoEngine;

public class VolvoCarPartFactory implements CarPartFactory {

    @Override
    public Engine getEngine() {
        return new VolvoEngine();
    }

    @Override
    public Buffer getBuffer() {
        return new VolvoBuffer();
    }
}
