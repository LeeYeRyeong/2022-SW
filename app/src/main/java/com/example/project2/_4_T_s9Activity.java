package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_s9Activity extends AppCompatActivity {

    TextView Gaehwa,GimpoIntlAirport,AirportMarket,Sinbanghwa,Magongnaru,YangcheonHyanggyo,Gayang,Jeungmi;
    TextView Deungchon,Yeomchang,Sinmokdong,Seonyudo,Dangsan,NationalAssembly,Yeouido,Saetgang,Noryangjin,Nodeul,Heukseok;
    TextView Dongjak,Gubanpo,Sinbanpo,ExpressBusTerminal,Sapyeong,Sinnonhyeon,Eonju,Seonjeongneung,SamseongJungang;
    TextView Bongeunsa,SportsComplex,Samjeon,SeokchonGobun,Seokchon,Songpanaru,HanseongBaekje,OlympicPark,DunchonOryun,VHSMedicalCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts9);

        Seonjeongneung = findViewById(R.id.Seonjeongneung);
        SamseongJungang = findViewById(R.id.SamseongJungang);
        Bongeunsa = findViewById(R.id.Bongeunsa);
        SportsComplex = findViewById(R.id.SportsComplex);
        Samjeon = findViewById(R.id.Samjeon);
        SeokchonGobun = findViewById(R.id.SeokchonGobun);
        Seokchon = findViewById(R.id.Seokchon);
        Songpanaru = findViewById(R.id.Songpanaru);
        HanseongBaekje = findViewById(R.id.HanseongBaekje);
        OlympicPark = findViewById(R.id.OlympicPark);
        DunchonOryun = findViewById(R.id.DunchonOryun);
        VHSMedicalCenter = findViewById(R.id.VHSMedicalCenter);

        NationalAssembly = findViewById(R.id.NationalAssembly);
        Yeouido = findViewById(R.id.Yeouido);
        Saetgang = findViewById(R.id.Saetgang);
        Noryangjin = findViewById(R.id.Noryangjin);
        Nodeul = findViewById(R.id.Nodeul);
        Heukseok = findViewById(R.id.Heukseok);
        Dongjak = findViewById(R.id.Dongjak);
        Gubanpo = findViewById(R.id.Gubanpo);
        Sinbanpo = findViewById(R.id.Sinbanpo);
        ExpressBusTerminal = findViewById(R.id.ExpressBusTerminal);
        Sapyeong = findViewById(R.id.Sapyeong);
        Sinnonhyeon = findViewById(R.id.Sinnonhyeon);
        Eonju = findViewById(R.id.Eonju);

        Gaehwa = findViewById(R.id.Gaehwa);
        GimpoIntlAirport = findViewById(R.id.GimpoIntlAirport);
        AirportMarket = findViewById(R.id.AirportMarket);
        Sinbanghwa = findViewById(R.id.Sinbanghwa);
        Magongnaru = findViewById(R.id.Magongnaru);
        YangcheonHyanggyo = findViewById(R.id.YangcheonHyanggyo);
        Gayang = findViewById(R.id.Gayang);
        Jeungmi = findViewById(R.id.Jeungmi);
        Deungchon = findViewById(R.id.Deungchon);
        Yeomchang = findViewById(R.id.Yeomchang);
        Sinmokdong = findViewById(R.id.Sinmokdong);
        Seonyudo = findViewById(R.id.Seonyudo);
        Dangsan = findViewById(R.id.Dangsan);

        Gaehwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        GimpoIntlAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        AirportMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Sinbanghwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Magongnaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        YangcheonHyanggyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Gayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Jeungmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Deungchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Yeomchang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Sinmokdong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Seonyudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Dangsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        NationalAssembly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Yeouido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Saetgang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Noryangjin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Nodeul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Heukseok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Dongjak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Gubanpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Sinbanpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        ExpressBusTerminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Sapyeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Sinnonhyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Eonju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Seonjeongneung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        SamseongJungang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Bongeunsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        SportsComplex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Samjeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        SeokchonGobun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Seokchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        Songpanaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        HanseongBaekje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        OlympicPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        DunchonOryun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });
        VHSMedicalCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s9_gsp.class);
                startActivity(intent);
            }
        });

    }
}