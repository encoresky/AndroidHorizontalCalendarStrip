package com.android.horizontalcalendarstrip;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.horizontalcalendarstriplibrary.HorizontalCalendarView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    HorizontalCalendarView horizontalCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizontalCalendarView = findViewById(R.id.horizontalCalendarView);
        horizontalCalendarView.setLocale(Locale.FRENCH);
    }
}
