package com.example.raceroster.dao;

import com.example.raceroster.R;
import com.example.raceroster.model.PersonalRecord;
import com.example.raceroster.model.Achievements;
import com.example.raceroster.model.VirtualRace;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements IDataHelper interface to provide the static data.
 */
public class DataHelper implements IDataHelper {
    @Override
    public List<Achievements> getPersonalRecord() {
        List<Achievements> personalRecordList = new ArrayList<>();
        personalRecordList.add(new PersonalRecord(R.drawable.activity, "Longest Run", "00:00", true));
        personalRecordList.add(new PersonalRecord(R.drawable.badge, "Highest Elevation", "2095 ft", true));
        personalRecordList.add(new PersonalRecord(R.drawable.badge_5, "Fastest 5K", "00:00", true));
        personalRecordList.add(new PersonalRecord(R.drawable.badge_2, "10K", "00:00", true));
        personalRecordList.add(new PersonalRecord(R.drawable.badge_4, "Half Marathon", "00:00", true));
        personalRecordList.add(new PersonalRecord(R.drawable.badge_3, "Marathon", "Not Yet", false));
        return personalRecordList;
    }

    @Override
    public List<Achievements> getVirtualRace() {
        List<Achievements> VirtualRaceList = new ArrayList<>();
        VirtualRaceList.add(new VirtualRace(R.drawable.activity, "Virtual Half Marathon Race", "00:00"));
        VirtualRaceList.add(new VirtualRace(R.drawable.badge_2, "Tokyo-Hakone Ekiden 2020", "00:00"));
        VirtualRaceList.add(new VirtualRace(R.drawable.badge_4, "Virtual 10K Race", "00:00"));
        VirtualRaceList.add(new VirtualRace(R.drawable.badge_3, "Hakone Ekiden", "00:00"));
        VirtualRaceList.add(new VirtualRace(R.drawable.badge_4, "Mizuno Singapore Ekiden 2015", "00:00"));
        VirtualRaceList.add(new VirtualRace(R.drawable.badge_5, "Virtual 5k Race", "00:00"));
        return VirtualRaceList;
    }
}
