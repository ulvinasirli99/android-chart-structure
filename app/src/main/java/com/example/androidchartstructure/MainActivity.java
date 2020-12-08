package com.example.androidchartstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.eazegraph.lib.charts.StackedBarChart;
import org.eazegraph.lib.charts.ValueLineChart;
import org.eazegraph.lib.models.BarModel;
import org.eazegraph.lib.models.StackedBarModel;
import org.eazegraph.lib.models.ValueLinePoint;
import org.eazegraph.lib.models.ValueLineSeries;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private static final String TAG = "MainActivity";
    private ValueLineChart mCubicValueLineChart;
    private StackedBarChart mStackedBarChart;
    private Button mpChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        //TODO THIS IS CHART FOR  WEATHER POINTS////

        mCubicValueLineChart = findViewById(R.id.cubiclinechart);

        mStackedBarChart = findViewById(R.id.stackedbarchart);

        mpChart = findViewById(R.id.mpBarChart);

        ValueLineSeries series = new ValueLineSeries();
        series.setColor(0xFF56B7F1);

        series.addPoint(new ValueLinePoint("10:00", 2.4f));
        series.addPoint(new ValueLinePoint("11:00", 3.4f));
        series.addPoint(new ValueLinePoint("12:00", .4f));
        series.addPoint(new ValueLinePoint("13:00", 1.2f));
        series.addPoint(new ValueLinePoint("14:00", 2.6f));
        series.addPoint(new ValueLinePoint("16:00", 1.0f));
        series.addPoint(new ValueLinePoint("17:00", 3.5f));
        series.addPoint(new ValueLinePoint("18:00", 2.4f));
        series.addPoint(new ValueLinePoint("19:00", 2.4f));
        series.addPoint(new ValueLinePoint("20:00", 3.4f));
        series.addPoint(new ValueLinePoint("21:00", .4f));
        series.addPoint(new ValueLinePoint("22:00", 1.3f));
        series.addPoint(new ValueLinePoint("23:00", 1.3f));
        series.addPoint(new ValueLinePoint("00:00", 1.3f));

        mCubicValueLineChart.addSeries(series);
        mCubicValueLineChart.startAnimation();


        StackedBarModel s1 = new StackedBarModel("12.4");

        s1.addBar(new BarModel(2.3f, 0xFF63CBB0));
        s1.addBar(new BarModel(2.3f, 0xFF56B7F1));
        s1.addBar(new BarModel(2.3f, 0xFFCDA67F));

        StackedBarModel s2 = new StackedBarModel("13.4");
        s2.addBar(new BarModel(1.1f, 0xFF63CBB0));
        s2.addBar(new BarModel(2.7f, 0xFF56B7F1));
        s2.addBar(new BarModel(0.7f, 0xFFCDA67F));

        StackedBarModel s3 = new StackedBarModel("14.4");

        s3.addBar(new BarModel(2.3f, 0xFF63CBB0));
        s3.addBar(new BarModel(2.f, 0xFF56B7F1));
        s3.addBar(new BarModel(3.3f, 0xFFCDA67F));

        StackedBarModel s4 = new StackedBarModel("15.4");
        s4.addBar(new BarModel(1.f, 0xFF63CBB0));
        s4.addBar(new BarModel(4.2f, 0xFF56B7F1));
        s4.addBar(new BarModel(2.1f, 0xFFCDA67F));

        mStackedBarChart.addBar(s1);
        mStackedBarChart.addBar(s2);
        mStackedBarChart.addBar(s3);
        mStackedBarChart.addBar(s4);

        mStackedBarChart.startAnimation();

        mpChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MpAndroidCahrtExample.class);
                startActivity(intent);
            }
        });




    }
}