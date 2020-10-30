package com.example.raceroster.model;

/**
 * This class represents personal record model object
 */
public class PersonalRecord extends Achievements {

    final private boolean isAchieved;

    public PersonalRecord(int imageId, String trophyName, String data, boolean isAchieved) {
        super(imageId, trophyName, data);
        this.isAchieved = isAchieved;
    }

    public boolean isAchieved() {
        return isAchieved;
    }
}
