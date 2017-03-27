package com.example.ykchung.mytestchart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LineChart lineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lineChart = (LineChart) findViewById(R.id.lineChart);

        ArrayList<String> xAXES = new ArrayList<>();
        ArrayList<Entry> yAXESin = new ArrayList<>();
        ArrayList<Entry> yAXEScos = new ArrayList<>();
        double x =0;
        int numDataPoints = 1000;
        xAXES.add(0,String.valueOf(0.1d));
        yAXESin.add(new Entry(0.1f,0));
        yAXEScos.add(new Entry(0.1f,0));

        String[] xaxes = new String[xAXES.size()];
        xaxes[0] = xAXES.get(0).toString();

        ArrayList<ILineDataSet> lineDataSets = new ArrayList<>(); //added second ilinedataset

        LineDataSet lineDataSet1 = new LineDataSet(yAXEScos,"cos");
        lineDataSet1.setDrawCircles(false);

        LineDataSet lineDataSet2 = new LineDataSet(yAXESin, "sin");

        lineDataSets.add(lineDataSet1);
        lineDataSets.add(lineDataSet2);

        LineData data = new LineData(lineDataSets);

        lineChart.setData(data);

    }
}
