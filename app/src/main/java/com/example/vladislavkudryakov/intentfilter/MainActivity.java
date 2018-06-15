package com.example.vladislavkudryakov.intentfilter;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Intent intent;
public final String ActionTime = "com.vladislavkudryakov.SHOW_TIME";
    public final String ActionDate = "com.vladislavkudryakov.SHOW_DATE";
    Button btnDate, btnTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTime = (Button) findViewById(R.id.btnTime);
        Button btnDate = (Button) findViewById(R.id.btnDate);

        btnDate.setOnClickListener(this);
        btnTime.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
Intent intent;
        switch (v.getId()) {
            case R.id.btnTime:
                intent = new  Intent(ActionTime);
                startActivity(intent);
                break;
            case R.id.btnDate:
                intent = new  Intent(ActionDate);
                startActivity(intent);
                break;
/*
            case R.id.btnSearch: String q = "котёнок";
                intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, q);
               startActivity(intent);

*/


        }
        }
    }

