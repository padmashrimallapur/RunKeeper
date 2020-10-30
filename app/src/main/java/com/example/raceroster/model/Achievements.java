package com.example.raceroster.model;

/**
 * Abstract class which holds users achievements
 */
abstract public class Achievements {
    final private int imageId;
    final private String trophyName;
    final private String runTime;

    public Achievements(int imageId, String trophyName, String runTime) {
        this.imageId = imageId;
        this.trophyName = trophyName;
        this.runTime = runTime;
    }

    public Integer getImageId() {
        return imageId;
    }

    public String getTrophyName() {
        return trophyName;
    }

    public String getRunTime() {
        return runTime;
    }
}
