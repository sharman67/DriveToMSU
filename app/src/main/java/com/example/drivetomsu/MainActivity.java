package com.example.drivetomsu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Map(View view){
        //Create URI for the destination
        Uri mapURI = Uri.parse("google.navigation:q=Montclair+State+University,+Montclair+New+Jersey");
        //Create new intent
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,mapURI);
        mapIntent.setPackage("com.google.android.apps.maps");
        //Start the activity to invoke Google Maps App by passing the destination
        startActivity(mapIntent);

    }
}