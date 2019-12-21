package model;

import java.util.List;

public class Slide {

    private final String title;
    private final List<String> bulletPoints;

    public Slide(String title, List<String> bulletPoints) {
        this.title = title;
        this.bulletPoints = bulletPoints;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getBulletPoints() {
        return bulletPoints;
    }

    @Override
    public String toString() {
        return "Slide{" +
                "title='" + title + '\'' +
                ", bulletPoints=" + bulletPoints +
                '}';
    }
}
