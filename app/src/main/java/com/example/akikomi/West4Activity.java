package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class West4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west4);
    }

    public void goToWest(View view) {
        Intent toWest =new Intent(this,WestActivity.class);
        startActivity(toWest);
    }

    public void goToWest2(View view) {
        Intent toWest2 =new Intent(this,West2Activity.class);
        startActivity(toWest2);
    }

    public void goToWest3(View view) {
        Intent toWest3 =new Intent(this,West3Activity.class);
        startActivity(toWest3);
    }
}