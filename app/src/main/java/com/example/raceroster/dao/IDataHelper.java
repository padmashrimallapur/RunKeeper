package com.example.raceroster.dao;

import com.example.raceroster.model.Achievements;

import java.util.List;

/**
 * Interface to provide provide data
 */
public interface IDataHelper {
     List<Achievements> getPersonalRecord();
     List<Achievements> getVirtualRace();
}
