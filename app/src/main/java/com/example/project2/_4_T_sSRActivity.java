package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sSRActivity extends AppCompatActivity {

    TextView Saetgang,Daebang,SeoulRegionalOfficeofMilitaryManpower,Boramae,BoramaePark,BoramaeMedicalCenter,Danggok,Sillim,Seowon,SeoulNatlUnivVentureTown,Gwanaksan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_sractivity);

        Saetgang = findViewById(R.id.Saetgang);
        Daebang = findViewById(R.id.Daebang);
        SeoulRegionalOfficeofMilitaryManpower = findViewById(R.id.SeoulRegionalOfficeofMilitaryManpower);
        Boramae = findViewById(R.id.Boramae);
        BoramaePark = findViewById(R.id.BoramaePark);
        BoramaeMedicalCenter = findViewById(R.id.BoramaeMedicalCenter);
        Danggok = findViewById(R.id.Danggok);
        Sillim = findViewById(R.id.Sillim);
        Seowon = findViewById(R.id.Seowon);
        SeoulNatlUnivVentureTown = findViewById(R.id.SeoulNatlUnivVentureTown);
        Gwanaksan = findViewById(R.id.Gwanaksan);

        Saetgang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sr_gsp.class);
                startActivity(intent);
            }
        });
        Daebang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sr_gsp.class);
                startActivity(intent);
            }
        });
        SeoulRegionalOfficeofMilitaryManpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sr_gsp.class);
                startActivity(intent);
            }
        });
        Boramae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sr_gsp.class);
                startActivity(intent);
            }
        });
        BoramaePark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sr_gsp.class);
                startActivity(intent);
            }
        });
        BoramaeMedicalCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sr_gsp.class);
                startActivity(intent);
            }
        });
        Danggok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sr_gsp.class);
                startActivity(intent);
            }
        });
        Sillim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sr_gsp.class);
                startActivity(intent);
            }
        });
        Seowon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sr_gsp.class);
                startActivity(intent);
            }
        });
        SeoulNatlUnivVentureTown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sr_gsp.class);
                startActivity(intent);
            }
        });
        Gwanaksan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sr_gsp.class);
                startActivity(intent);
            }
        });


    }
}