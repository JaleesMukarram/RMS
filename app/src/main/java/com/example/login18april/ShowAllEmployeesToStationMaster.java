package com.example.login18april;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

public class ShowAllEmployeesToStationMaster extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterForShowingEmployeeToStationManagement adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_employees_to_station_master);

        //recyclerView = findViewById(R.id.RV)

    }


}
