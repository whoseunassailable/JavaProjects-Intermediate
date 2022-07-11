package com.project.intermediate;

public class Songs {
    String title;
    double duration;

    public Songs(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public Songs() {

    }

    public String getTitle() {
        return getTitle();
    }

    public String getDuration() {
        return getDuration();
    }

    @Override
    public String toString() {
        return "Songs{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
