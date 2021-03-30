package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east);
    }

    public void goToSoumu(View view) {
        Intent toESoumu =new Intent(this, ESoumuActivity.class);
        startActivity(toESoumu);
    }

    public void goToHoken(View view) {
        Intent toEHoken =new Intent(this, EHokenActivity.class);
        startActivity(toEHoken);
    }

    public void goToEGakusyuusien(View view) {
        Intent toEGakusyuusien =new Intent(this, EGakuseisien.class);
        startActivity(toEGakusyuusien);
    }

    public void goToE1Houzin(View view) {
        Intent toE1Houzin =new Intent(this, E1HouzinActivity.class);
        startActivity(toE1Houzin);
    }

    public void goToEast2(View view) {
        Intent toEast2 =new Intent(this,East2Activity.class);
        startActivity(toEast2);
    }

    public void goToEast3(View view) {
        Intent toEast3 =new Intent(this,East3Activity.class);
        startActivity(toEast3);
    }

    public void goToEast4(View view) {
        Intent toEast4 =new Intent(this,East4Activity.class);
        startActivity(toEast4);
    }

    public void goToMain(View view) {
        Intent toMain =new Intent(this,MainActivity.class);
        startActivity(toMain);
    }
}