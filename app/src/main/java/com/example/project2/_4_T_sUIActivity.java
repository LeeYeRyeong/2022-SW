package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sUIActivity extends AppCompatActivity {

    TextView Sinseoldong ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_uiactivity);

        Sinseoldong  = findViewById(R.id.Sinseoldong);
    }
}