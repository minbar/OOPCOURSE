package carfactory.parts.factory;

import carfactory.parts.Buffer;
import carfactory.parts.Engine;

public interface CarPartFactory {

    Engine getEngine();
    Buffer getBuffer();
}
