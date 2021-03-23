package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class East2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east2);
    }

    public void goToEast(View view) {
        Intent toEast =new Intent(this, EastActivity.class);
        startActivity(toEast);
    }
}