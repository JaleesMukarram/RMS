package com.example.login18april;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.login18april.TrainClasses.Train;
import com.example.login18april.TrainClasses.TrainStation;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Date;
import java.util.Map;

public class StationTesting extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference ReferenceNode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_testing);
        Button button = findViewById(R.id.AddStationToDatabase);
        firebaseDatabase = FirebaseDatabase.getInstance();
        ReferenceNode = firebaseDatabase.getReference("TrainStations");
        ReferenceNode.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                try{
                    Iterable<DataSnapshot> iterable = dataSnapshot.getChildren();



                }catch (Exception ex){

                }



            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




//                TrainStation trainStation  = new TrainStation("Rawalpindi Cant Station","Ralwalpindi", new Date(13,3,2005));
//
//                try {
//                    String key = ReferenceNode.push().getKey();
//
//                    ReferenceNode.child(key).setValue(trainStation);
//                    Toast.makeText(StationTesting.this, "Added", Toast.LENGTH_SHORT).show();
//                }catch (Exception x){
//                    Toast.makeText(StationTesting.this, "Failed"+x.toString(), Toast.LENGTH_SHORT).show();
//                }



            }
        });


    }
}
