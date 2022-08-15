package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sGPActivity extends AppCompatActivity {

    TextView Yangchon, Gurae, Masan, Janggi, Unyang, GeolpoBukbyeon, Sau, Pungmu, Gochon, GimpoIntlAirport ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_gpactivity);

        Yangchon = findViewById(R.id.Yangchon);
        Gurae = findViewById(R.id.Gurae);
        Masan = findViewById(R.id.Masan);
        Janggi = findViewById(R.id.Janggi);
        Unyang = findViewById(R.id.Unyang);
        GeolpoBukbyeon = findViewById(R.id.GeolpoBukbyeon);
        Sau = findViewById(R.id.Sau);
        Pungmu = findViewById(R.id.Pungmu);
        Gochon = findViewById(R.id.Gochon);
        GimpoIntlAirport = findViewById(R.id.GimpoIntlAirport);

        Yangchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gp_gsp.class);
                startActivity(intent);
            }
        });
        Gurae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gp_gsp.class);
                startActivity(intent);
            }
        });
        Masan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gp_gsp.class);
                startActivity(intent);
            }
        });
        Janggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gp_gsp.class);
                startActivity(intent);
            }
        });
        Unyang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gp_gsp.class);
                startActivity(intent);
            }
        });
        GeolpoBukbyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gp_gsp.class);
                startActivity(intent);
            }
        });
        Sau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gp_gsp.class);
                startActivity(intent);
            }
        });
        Pungmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gp_gsp.class);
                startActivity(intent);
            }
        });
        Gochon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gp_gsp.class);
                startActivity(intent);
            }
        });
        GimpoIntlAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gp_gsp.class);
                startActivity(intent);
            }
        });


    }
}