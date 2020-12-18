package com.example.login18april;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Random;

public class ClientUser extends AppCompatActivity {
    private static final String TAG = "Tracking";

    private String Username;
    private String Password;
    private int age;
    private String bookingStatus;
    private int ClientUserID;
    private boolean hasBooking;
    private String gender;


    public ClientUser(String username, String password) {
        Username = username;
        Password = password;
    }

    public ClientUser(String username, String password, int age) {
        this(username,password,age,"Nothing",false,"Null");
    }

    public ClientUser(String username, String password, int age, String bookingStatus, boolean hasBooking, String gender) {
        Username = username;
        Password = password;
        this.age = age;
        this.bookingStatus = bookingStatus;
        this.hasBooking = hasBooking;
        this.gender = gender;
        Random random = new Random();
        this.ClientUserID = random.nextInt(1000000)+random.nextInt(1000000);

    }

    public static String getTAG() {
        return TAG;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public boolean isHasBooking() {
        return hasBooking;
    }

    public void setHasBooking(boolean hasBooking) {
        this.hasBooking = hasBooking;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getClientUserID() {
        return ClientUserID;
    }

    public void setClientUserID(int clientUserID) {
        ClientUserID = clientUserID;
    }
}
