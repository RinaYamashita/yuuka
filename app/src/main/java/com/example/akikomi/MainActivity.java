package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ZoomButton;

public class MainActivity extends AppCompatActivity {
    ZoomButton zoomIn;
    ZoomButton zoomOut;
    ImageView imageView;
    Button button;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView1);
        button = (Button) findViewById(R.id.法人本部);
        button = (Button) findViewById(R.id.学生相談室);
        button = (Button) findViewById(R.id.保健室);
        button = (Button) findViewById(R.id.東);
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