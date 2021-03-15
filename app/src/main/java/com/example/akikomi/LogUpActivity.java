package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.akikomi.ui.login.LoginActivity;

public class LogUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_up);
    }

    public void goToLogin(View view) {
        Intent toLogin = new Intent(this, LoginActivity.class);
        startActivity(toLogin);
    }
}