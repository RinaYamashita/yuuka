package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class North3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north3);
    }

    public void goToNorth(View view) {
        Intent toNorth =new Intent(this,NorthActivity.class);
        startActivity(toNorth);
    }

    public void goToNorth2(View view) {
        Intent toNorth2 =new Intent(this,North2Activity.class);
        startActivity(toNorth2);
    }

    public void goToNorth4(View view) {
        Intent toNorth4 =new Intent(this,North4Activity.class);
        startActivity(toNorth4);
    }
}