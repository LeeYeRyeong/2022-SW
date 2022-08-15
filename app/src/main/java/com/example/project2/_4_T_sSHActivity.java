package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sSHActivity extends AppCompatActivity {

    TextView Sosa,Sosaeul,SiheungDaeya,Sincheon,Sinhyeon,SiheungCityHall,SiheungNeunggok,Dalmi,Seonbu,Choji,Siu,Wonsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_shactivity);

        Sosa = findViewById(R.id.Sosa);
        Sosaeul = findViewById(R.id.Sosaeul);
        SiheungDaeya = findViewById(R.id.SiheungDaeya);
        Sincheon = findViewById(R.id.Sincheon);
        Sinhyeon = findViewById(R.id.Sinhyeon);
        SiheungCityHall = findViewById(R.id.SiheungCityHall);
        SiheungNeunggok = findViewById(R.id.SiheungNeunggok);
        Dalmi = findViewById(R.id.Dalmi);
        Seonbu = findViewById(R.id.Seonbu);
        Choji = findViewById(R.id.Choji);
        Siu = findViewById(R.id.Siu);
        Wonsi = findViewById(R.id.Wonsi);

        Sosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
        Sosaeul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
        SiheungDaeya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
        Sincheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
        Sinhyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
        SiheungCityHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
        SiheungNeunggok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
        Dalmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
        Seonbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
        Choji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
        Siu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
        Wonsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sh_gsp.class);
                startActivity(intent);
            }
        });
    }
}