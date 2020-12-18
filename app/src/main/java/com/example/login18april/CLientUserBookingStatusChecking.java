package com.example.login18april;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.login18april.TrainClasses.Train;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.File;
import java.io.FileInputStream;

public class CLientUserBookingStatusChecking extends AppCompatActivity {
    TextView BookingShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_user_booking_status_checking);
        BookingShow = findViewById(R.id.TVBookingStatusAdding);
        CheckBookingStatus();



    }

    public void CheckBookingStatus(){
        FirebaseDatabase OnlineDatabase = FirebaseDatabase.getInstance();
        DatabaseReference ReferenceNode = OnlineDatabase.getReference("Bookings");

        ReferenceNode.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                Iterable<DataSnapshot> iterable = dataSnapshot.getChildren();

                for (DataSnapshot child : iterable) {

                    Booking booking = child.getValue(Booking.class);

                    if (booking.getBookingPersonName().equals(getAppUserNameFromLocaFile())){

                        String s = "Name: "+booking.getBookingPersonName()+"\nBooking ID: "+booking.getBookingID()+"\nFrom: "+booking.getStartingStation()
                                +"\nTo: "+booking.getEndingStation()+"\nPrice: "+booking.getBookingPrice()+"\nTrain: "+booking.getTrainName()+"\nCoach: "+booking.getTrainCoach()+"\nSeat: "+booking.getSeatNumber();

                        BookingShow.setText(s);
                    }


                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



    }

    public String getAppUserNameFromLocaFile() {

        try {

            FileInputStream fis = openFileInput("AccountInfo");
            int size = fis.available();


            byte[] data = new byte[size];
            fis.read(data);


            String text = new String(data);
            fis.close();

            String[] accountInfo = text.split("%%%%%", 0);
            if (accountInfo.length == 0) {

                return null;
            } else {
                return accountInfo[1];

            }

        } catch (Exception ex) {
            return "Jalees";

        }




    }

}
