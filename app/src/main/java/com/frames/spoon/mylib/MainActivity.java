package com.frames.spoon.mylib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.frames.spoon.mylibrary.AppContext;
import com.date.DatePickerDialog;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private final Calendar calendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.textview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DatePickerDialog datePickerDialog = DatePickerDialog
                        .newInstance(MainActivity.this, calendar.get(Calendar.YEAR),
                                calendar.get(Calendar.MONTH),
                                calendar.get(Calendar.DAY_OF_MONTH), false);
                datePickerDialog.setVibrate(false);
                datePickerDialog.setYearRange(1900, 2200);
                datePickerDialog.show(getSupportFragmentManager(), "aaaa");
            }
        });
//        AppOperator.runOnThread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//        AppOperator.createGson().toJson(MainActivity.class);
    }

    @Override
    public void onDateSet(DatePickerDialog datePickerDialog, int year, int month, int day) {
        AppContext.showToast(year + "/" + (month + 1) + "/" + day);
    }
}
