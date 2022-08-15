package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sI2Activity extends AppCompatActivity {

    TextView GeomdanOryu,Wanggil,GeomdanSageori,Majeon,Wanjeong,Dokjeong,Geomam,Geombawi,AsiadStadium;
    TextView SeoguOffice,Gajeong,GajeongJungangMarket,Seongnam,WestWomansCommunityCenter,IncheonGajwa;
    TextView Gajaeul,JuanNationalIndustrialComplex,Juan,CitizensPark,SeokbawiMarket,IncheonCityHall,SeokcheonSageori;
    TextView MoraenaeMarket,Mansu,NamdongguOffice,IncheonGrandPark,Unyeon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_i2);

        WestWomansCommunityCenter = findViewById(R.id.WestWomansCommunityCenter);
        IncheonGajwa = findViewById(R.id.IncheonGajwa);
        Gajaeul = findViewById(R.id.Gajaeul);
        JuanNationalIndustrialComplex = findViewById(R.id.JuanNationalIndustrialComplex);
        CitizensPark = findViewById(R.id.CitizensPark);
        Juan = findViewById(R.id.Juan);
        SeokbawiMarket = findViewById(R.id.SeokbawiMarket);
        IncheonCityHall = findViewById(R.id.IncheonCityHall);
        SeokcheonSageori = findViewById(R.id.SeokcheonSageori);
        MoraenaeMarket = findViewById(R.id.MoraenaeMarket);
        NamdongguOffice = findViewById(R.id.NamdongguOffice);
        Mansu = findViewById(R.id.Mansu);
        IncheonGrandPark = findViewById(R.id.IncheonGrandPark);
        Unyeon = findViewById(R.id.Unyeon);

        GeomdanOryu = findViewById(R.id.GeomdanOryu);
        Wanggil = findViewById(R.id.Wanggil);
        GeomdanSageori = findViewById(R.id.GeomdanSageori);
        Majeon = findViewById(R.id.Majeon);
        Wanjeong = findViewById(R.id.Wanjeong);
        Dokjeong = findViewById(R.id.Dokjeong);
        Geomam = findViewById(R.id.Geomam);
        Geombawi = findViewById(R.id.Geombawi);
        AsiadStadium = findViewById(R.id.AsiadStadium);
        SeoguOffice = findViewById(R.id.SeoguOffice);
        Gajeong = findViewById(R.id.Gajeong);
        GajeongJungangMarket = findViewById(R.id.GajeongJungangMarket);
        Seongnam = findViewById(R.id.Seongnam);

        GeomdanOryu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Wanggil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        GeomdanSageori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Majeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Wanjeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Dokjeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Geomam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Geombawi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        AsiadStadium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        SeoguOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Gajeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        GajeongJungangMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Seongnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        WestWomansCommunityCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        IncheonGajwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Gajaeul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        JuanNationalIndustrialComplex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Juan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        CitizensPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        SeokbawiMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        IncheonCityHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        SeokcheonSageori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        MoraenaeMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Mansu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        NamdongguOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        IncheonGrandPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });
        Unyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si2_gsp.class);
                startActivity(intent);
            }
        });

    }
}