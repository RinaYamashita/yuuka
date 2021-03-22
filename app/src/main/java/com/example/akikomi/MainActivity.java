package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ZoomButton;

import com.example.akikomi.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    ZoomButton zoomIn;
    ZoomButton zoomOut;
    ImageView imageView;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView1);
        zoomIn = (ZoomButton) findViewById(R.id.zoomIn);
        zoomOut = (ZoomButton) findViewById(R.id.zoomOut);

        // 長押ししたときのサンプリング間隔。
        zoomIn.setZoomSpeed(100);
        zoomOut.setZoomSpeed(100);
    }

    public void onClickZoomIn(View myButton) {
        Drawable d = imageView.getDrawable();
        Rect r = d.copyBounds();
        int x = -Math.max(r.width() / 10, 1);
        int y = -Math.max(r.height() / 10, 1);
        r.inset(x, y);
        d.setBounds(r);
        imageView.invalidate();
    }

    public void onClickZoomOut(View myButton) {
        Drawable d = imageView.getDrawable();
        Rect r = d.copyBounds();
        r.inset(r.width() / 10, r.height() / 10);
        d.setBounds(r);
        imageView.invalidate();
    }

    public void goToEast(View view) {
        Intent toEast =new Intent(this, EastActivity.class);
        startActivity(toEast);
    }

    public void goToSouth(View view) {
        Intent toSouth =new Intent(this, SouthActivity.class);
        startActivity(toSouth);
    }

    public void goToWest(View view) {
        Intent toWest =new Intent(this, WestActivity.class);
        startActivity(toWest);
    }

    public void goToNorth(View view) {
        Intent toNorth =new Intent(this, NorthActivity.class);
        startActivity(toNorth);
    }
}