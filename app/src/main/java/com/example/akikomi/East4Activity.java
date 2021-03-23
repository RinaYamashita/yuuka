package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class East4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east4);
    }
    public void goToEast(View view) {
        Intent toEast =new Intent(this, EastActivity.class);
        startActivity(toEast);
    }

    public void goToEast2(View view) {
        Intent toEast2 =new Intent(this,East2Activity.class);
        startActivity(toEast2);
    }

    public void goToEast3(View view) {
        Intent toEast3 =new Intent(this,East3Activity.class);
        startActivity(toEast3);
    }
}