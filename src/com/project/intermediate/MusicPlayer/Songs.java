package com.project.intermediate.MusicPlayer;

public class Songs {

    // Title of the Song
    String title;

    // Duration of the Song
    double duration;

    // Constructor
    public Songs(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public Songs() {

    }

    // getter
    public String getTitle() {
        return getTitle();
    }

    public String getDuration() {
        return getDuration();
    }

    // toString method
    @Override
    public String toString() {
        return "Songs{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

}
