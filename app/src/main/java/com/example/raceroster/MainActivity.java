package com.example.raceroster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import com.example.raceroster.achievements.CustomAdapter;
import com.example.raceroster.dao.DataHelper;
import com.example.raceroster.dao.IDataHelper;

/**
 * This Class displays the achievements of the user.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IDataHelper dataHelper = new DataHelper();

        //Personal record
        RecyclerView recyclerView = findViewById(R.id.personalRecordRecyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getBaseContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        CustomAdapter customAdapter = new CustomAdapter(dataHelper.getPersonalRecord());
        recyclerView.setAdapter(customAdapter);

        //Virtual race record
        RecyclerView raceView = findViewById(R.id.virtualRaceList);
        GridLayoutManager gridLayout = new GridLayoutManager(getBaseContext(), 2);
        raceView.setLayoutManager(gridLayout);

        CustomAdapter customAdapter1 = new CustomAdapter(dataHelper.getVirtualRace());
        raceView.setNestedScrollingEnabled(false);
        raceView.setAdapter(customAdapter1);
    }

}