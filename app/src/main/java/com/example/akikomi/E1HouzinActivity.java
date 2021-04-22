package com.example.akikomi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

import static android.graphics.Color.DKGRAY;

public class E1HouzinActivity extends AppCompatActivity {

    PieChart pieChart;
    int[] colorClassArray = new int[] {Color.LTGRAY, Color.CYAN, DKGRAY, Color.GREEN, Color.MAGENTA, Color.RED};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e1_houzin);

        pieChart = findViewById(R.id.piechart);

        PieDataSet pieDAtaSet = new PieDataSet(dataValues1(), "");
        pieDAtaSet.setColors(colorClassArray);

        PieData pieData = new PieData(pieDAtaSet);

        pieChart.setData(pieData);
        pieChart.invalidate();
    }

    private ArrayList<PieEntry> dataValues1(){
        ArrayList<PieEntry> dataVals = new ArrayList<>();

        dataVals.add(new PieEntry(15, "Sun"));
        dataVals.add(new PieEntry(34, "Mon"));
        dataVals.add(new PieEntry(23, "Tue"));
        dataVals.add(new PieEntry(86, "Wed"));
        dataVals.add(new PieEntry(26, "Thu"));
        dataVals.add(new PieEntry(17, "Fri"));
        dataVals.add(new PieEntry(63, "Sat"));
        return dataVals;
    }
}