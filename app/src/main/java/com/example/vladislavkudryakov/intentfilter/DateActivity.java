package com.example.vladislavkudryakov.intentfilter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Melo on 12.06.2018.
 */

public class DateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        Date date = new Date();
       // SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
// time = sdf.format(new Date(System.currentTime));
        TextView Txview = (TextView) findViewById(R.id.Txview);

        Txview.setText(date.toString());


    }
}
