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

    public void goToEast3(View view) {
        Intent toEast3 =new Intent(this,East3Activity.class);
        startActivity(toEast3);
    }

    public void goToEast4(View view) {
        Intent toEast4 =new Intent(this,East4Activity.class);
        startActivity(toEast4);
    }

    public void goToE2Sinri(View view) {
        Intent toE2Sinri=new Intent(this,E2SinriActivity.class);
        startActivity(toE2Sinri);
    }

    public void goToE2Kiso(View view) {
        Intent toE2Kiso=new Intent(this,E2KisoActivity.class);
        startActivity(toE2Kiso);
    }

    public void goToMain(View view) {
        Intent toMain =new Intent(this,MainActivity.class);
        startActivity(toMain);
    }
}