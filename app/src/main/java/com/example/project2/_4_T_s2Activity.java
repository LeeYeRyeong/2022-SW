package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class _4_T_s2Activity extends AppCompatActivity {

    TextView Bongcheon  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts2);

        Bongcheon = findViewById(R.id.Bongcheon );
    }
}