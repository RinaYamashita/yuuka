package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class East3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east3);
    }
    public void goToEast(View view) {
        Intent toEast =new Intent(this, EastActivity.class);
        startActivity(toEast);
    }

    public void goToEast2(View view) {
        Intent toEast2 =new Intent(this,East2Activity.class);
        startActivity(toEast2);
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