package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToEast(View view) {
        Intent toEast = new Intent(this, EastActivity.class);
        startActivity(toEast);
    }

    public void goToWest(View view) {
        Intent toWest = new Intent (this, WestActivity.class);
        startActivity(toWest);
    }
}
