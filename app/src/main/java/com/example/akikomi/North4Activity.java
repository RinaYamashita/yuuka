package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class North4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north4);
    }

    public void goToNorth(View view) {
        Intent toNorth =new Intent(this,NorthActivity.class);
        startActivity(toNorth);
    }

    public void goToNorth2(View view) {
        Intent toNorth2 =new Intent(this,North2Activity.class);
        startActivity(toNorth2);
    }

    public void goToNorth3(View view) {
        Intent toNorth3 =new Intent(this,North3Activity.class);
        startActivity(toNorth3);
    }
}