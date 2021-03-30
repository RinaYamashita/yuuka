package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west);
    }

    public void goToWest2(View view) {
        Intent toWest2 =new Intent(this,West2Activity.class);
        startActivity(toWest2);
    }

    public void goToWest3(View view) {
        Intent toWest3 =new Intent(this,West3Activity.class);
        startActivity(toWest3);
    }

    public void goToWest4(View view) {
        Intent toWest4 =new Intent(this,West4Activity.class);
        startActivity(toWest4);
    }

    public void goToMain(View view) {
        Intent toMain =new Intent(this,MainActivity.class);
        startActivity(toMain);
    }
}