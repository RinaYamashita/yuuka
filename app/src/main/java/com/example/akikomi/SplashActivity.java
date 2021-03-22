package com.example.akikomi;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent; //追加☆
import android.os.Handler; //☆
import android.preference.PreferenceManager;

import com.example.akikomi.ui.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    final Handler mHandler = new Handler(); //☆

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mHandler.postDelayed(mSplashTask, 3000); //☆

    }

    //以下☆
    @Override
    protected void onStop() {
        super.onStop();
        mHandler.removeCallbacks(mSplashTask);
    }

    private Runnable mSplashTask = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(SplashActivity.this, PrivacyActivity.class);//画面遷移のためのIntentを準備
            startActivity(intent);//実際の画面遷移を開始
            finish();//現在のActivityを削除
        }
    };
}