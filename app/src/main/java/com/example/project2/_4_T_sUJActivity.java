package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sUJActivity extends AppCompatActivity {

    TextView Balgok,Hoeryong,Beomgol,LRTUijeongbu,UijeongbuCityHall,Heungseon,UijeongbuJungang,Dongo,Saemal;
    TextView GyeonggiProvincialGovernmentNorthernOffice,Hyoja,Gonjae,Eoryong,Songsan,Tapseok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_ujactivity);

        Balgok = findViewById(R.id.Balgok);
        Hoeryong = findViewById(R.id.Hoeryong);
        Beomgol = findViewById(R.id.Beomgol);
        LRTUijeongbu = findViewById(R.id.LRTUijeongbu);
        UijeongbuCityHall = findViewById(R.id.UijeongbuCityHall);
        Heungseon = findViewById(R.id.Heungseon);
        UijeongbuJungang = findViewById(R.id.UijeongbuJungang);
        Dongo = findViewById(R.id.Dongo);
        Saemal = findViewById(R.id.Saemal);
        GyeonggiProvincialGovernmentNorthernOffice = findViewById(R.id.GyeonggiProvincialGovernmentNorthernOffice);
        Hyoja = findViewById(R.id.Hyoja);
        Gonjae = findViewById(R.id.Gonjae);
        Eoryong = findViewById(R.id.Eoryong);
        Songsan = findViewById(R.id.Songsan);
        Tapseok = findViewById(R.id.Tapseok);

        Balgok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        Hoeryong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        Beomgol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        LRTUijeongbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        UijeongbuCityHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        Heungseon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        UijeongbuJungang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        Dongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        Saemal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        GyeonggiProvincialGovernmentNorthernOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        Hyoja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        Gonjae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        Eoryong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        Songsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });
        Tapseok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _uj_gsp.class);
                startActivity(intent);
            }
        });


    }
}