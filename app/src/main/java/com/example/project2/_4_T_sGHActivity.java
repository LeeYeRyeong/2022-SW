package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sGHActivity extends AppCompatActivity {

    TextView SeoulStation, Gongdeok, HongikUniv, DigitalMediaCity, Magongnaru, GimpoIntlAirport, Gyeyang, Geomam, CheongnaIntlCity,Yeongjong, Unseo, IncheonIntlAirportCargoTerminal, IncheonIntlAirportTerminal1, IncheonIntlAirportTerminal2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_ghactivity);

        SeoulStation = findViewById(R.id.SeoulStation);
        Gongdeok = findViewById(R.id.Gongdeok);
        HongikUniv = findViewById(R.id.HongikUniv);
        DigitalMediaCity = findViewById(R.id.DigitalMediaCity);
        Magongnaru = findViewById(R.id.Magongnaru);
        GimpoIntlAirport = findViewById(R.id.GimpoIntlAirport);
        Gyeyang = findViewById(R.id.Gyeyang);
        Geomam = findViewById(R.id.Geomam);
        CheongnaIntlCity = findViewById(R.id.CheongnaIntlCity);
        Yeongjong = findViewById(R.id.Yeongjong);
        Unseo = findViewById(R.id.Unseo);
        IncheonIntlAirportCargoTerminal = findViewById(R.id.IncheonIntlAirportCargoTerminal);
        IncheonIntlAirportTerminal1 = findViewById(R.id.IncheonIntlAirportTerminal1);
        IncheonIntlAirportTerminal2 = findViewById(R.id.IncheonIntlAirportTerminal2);

        SeoulStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        Gongdeok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        HongikUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        DigitalMediaCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        Magongnaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        GimpoIntlAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        Gyeyang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        Geomam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        CheongnaIntlCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        Yeongjong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        Unseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        IncheonIntlAirportCargoTerminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        IncheonIntlAirportTerminal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });
        IncheonIntlAirportTerminal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gh_gsp.class);
                startActivity(intent);
            }
        });




    }
}