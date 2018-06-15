package com.example.vladislavkudryakov.intentfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeActivity extends AppCompatActivity {


TextView Txview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);


        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date(System.currentTimeMillis()));
        TextView Txview = (TextView) findViewById(R.id.Txview);

        Txview.setText(time);
    }
}
