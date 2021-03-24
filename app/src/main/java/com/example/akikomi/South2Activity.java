package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class South2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south2);
    }

    public void goToSouth(View view) {
        Intent toSouth =new Intent(this,SouthActivity.class);
        startActivity(toSouth);
    }

    public void goToSouth3(View view) {
        Intent toSouth3 =new Intent(this,South3Activity.class);
        startActivity(toSouth3);
    }

    public void goToSouth4(View view) {
        Intent toSouth4 =new Intent(this,South4Activity.class);
        startActivity(toSouth4);
    }

    public void goToSouth5(View view) {
        Intent toSouth5 =new Intent(this,South5Activity.class);
        startActivity(toSouth5);
    }
}