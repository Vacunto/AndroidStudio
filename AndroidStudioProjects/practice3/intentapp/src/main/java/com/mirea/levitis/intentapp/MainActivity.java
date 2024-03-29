package com.mirea.levitis.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    long dateInMillis = System.currentTimeMillis();
    String format = "yyyy-MM-dd HH:mm:ss";
    final SimpleDateFormat sdf = new SimpleDateFormat(format);
    String dateString = sdf.format(new Date(dateInMillis));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendTime(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("time", dateString);
        startActivity(intent);
    }
}