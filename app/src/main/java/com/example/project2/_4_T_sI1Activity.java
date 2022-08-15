package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sI1Activity extends AppCompatActivity {

    TextView Gyeyang,Gyulhyeon,Bakchon,Imhak,Gyesan,GyeonginNatlUnivofEducation,Jakjeon,Galsan,BupyeongguOffice;
    TextView BupyeongMarket,Bupyeong,Dongsu,Bupyeongsamgeori,Ganseogogeori,IncheonCityHall,CultureArtsCenter;
    TextView IncheonBusTerminal,MunhakSportsComplex,Seonhak,Sinyeonsu,Woninjae,Dongchun,Dongmak,CampusTown;
    TextView Technopark,BITZone,IncheonNatlUniv,CentralPark,IntlBusinessDistrict,SongdoMoonlightFestivalPark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_i1);

        IncheonNatlUniv = findViewById(R.id.IncheonNatlUniv);
        CentralPark = findViewById(R.id.CentralPark);
        IntlBusinessDistrict = findViewById(R.id.IntlBusinessDistrict);
        SongdoMoonlightFestivalPark = findViewById(R.id.SongdoMoonlightFestivalPark);

        Ganseogogeori = findViewById(R.id.Ganseogogeori);
        IncheonCityHall = findViewById(R.id.IncheonCityHall);
        CultureArtsCenter = findViewById(R.id.CultureArtsCenter);
        IncheonBusTerminal = findViewById(R.id.IncheonBusTerminal);
        MunhakSportsComplex = findViewById(R.id.MunhakSportsComplex);
        Seonhak = findViewById(R.id.Seonhak);
        Sinyeonsu = findViewById(R.id.Sinyeonsu);
        Woninjae = findViewById(R.id.Woninjae);
        Dongchun = findViewById(R.id.Dongchun);
        Dongmak = findViewById(R.id.Dongmak);
        CampusTown = findViewById(R.id.CampusTown);
        Technopark = findViewById(R.id.Technopark);
        BITZone = findViewById(R.id.BITZone);

        Gyeyang = findViewById(R.id.Gyeyang);
        Gyulhyeon = findViewById(R.id.Gyulhyeon);
        Bakchon = findViewById(R.id.Bakchon);
        Imhak = findViewById(R.id.Imhak);
        Gyesan = findViewById(R.id.Gyesan);
        GyeonginNatlUnivofEducation = findViewById(R.id.GyeonginNatlUnivofEducation);
        Jakjeon = findViewById(R.id.Jakjeon);
        Galsan = findViewById(R.id.Galsan);
        BupyeongguOffice = findViewById(R.id.BupyeongguOffice);
        BupyeongMarket = findViewById(R.id.BupyeongMarket);
        Bupyeong = findViewById(R.id.Bupyeong);
        Dongsu = findViewById(R.id.Dongsu);
        Bupyeongsamgeori = findViewById(R.id.Bupyeongsamgeori);

        Gyeyang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Gyulhyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Bakchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Imhak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Gyesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        GyeonginNatlUnivofEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Jakjeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Galsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        BupyeongguOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        BupyeongMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Bupyeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Dongsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Bupyeongsamgeori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Ganseogogeori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        IncheonCityHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        CultureArtsCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        IncheonBusTerminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        MunhakSportsComplex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Seonhak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Sinyeonsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Woninjae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Dongchun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Dongmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        CampusTown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        Technopark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        BITZone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        IncheonNatlUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        CentralPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        IntlBusinessDistrict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });
        SongdoMoonlightFestivalPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si1_gsp.class);
                startActivity(intent);
            }
        });

    }
}