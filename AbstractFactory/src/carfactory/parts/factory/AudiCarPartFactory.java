package carfactory.parts.factory;

import carfactory.parts.AudiBuffer;
import carfactory.parts.AudiEngine;
import carfactory.parts.Buffer;
import carfactory.parts.Engine;

public class AudiCarPartFactory implements CarPartFactory {

    @Override
    public Engine getEngine() {
        return new AudiEngine();
    }

    @Override
    public Buffer getBuffer() {
        return new AudiBuffer();
    }
}
