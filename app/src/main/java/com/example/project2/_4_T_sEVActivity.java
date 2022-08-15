package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sEVActivity extends AppCompatActivity {

    TextView Giheung, KangnamUniv, Jiseok, Eojeong, Dongbaek, Chodang, Samga, CityHallYonginUniv, MyongjiUniv, Gimnyangjang, StadiumSongdamCollege, Gojin, Bopyeong, Dunjeon, JeondaeEverland ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_evactivity);

        Giheung = findViewById(R.id.Giheung);
        KangnamUniv = findViewById(R.id.KangnamUniv);
        Jiseok = findViewById(R.id.Jiseok);
        Eojeong = findViewById(R.id.Eojeong);
        Dongbaek = findViewById(R.id.Dongbaek);
        Chodang = findViewById(R.id.Chodang);
        Samga = findViewById(R.id.Samga);
        CityHallYonginUniv = findViewById(R.id.CityHallYonginUniv);
        MyongjiUniv = findViewById(R.id.MyongjiUniv);
        Gimnyangjang = findViewById(R.id.Gimnyangjang);
        StadiumSongdamCollege = findViewById(R.id.StadiumSongdamCollege);
        Gojin = findViewById(R.id.Gojin);
        Bopyeong = findViewById(R.id.Bopyeong);
        Dunjeon = findViewById(R.id.Dunjeon);
        JeondaeEverland = findViewById(R.id.JeondaeEverland);

        Giheung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        KangnamUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        Jiseok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        Eojeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        Dongbaek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        Chodang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        Samga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        CityHallYonginUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        MyongjiUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        Gimnyangjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        StadiumSongdamCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        Gojin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        Bopyeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        Dunjeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });
        JeondaeEverland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _ev_gsp.class);
                startActivity(intent);
            }
        });



    }
}