package model;

import java.util.List;

public class Slides implements TeachingMaterial {

    private final String name;
    private final List<Slide> slides;

    public Slides(final String name, final List<Slide> slides) {
        this.name = name;
        this.slides = slides;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMaterial() {
        return slides.toString();
    }
}
