package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sGUActivity extends AppCompatActivity {

    TextView Imjingang,Munsan,Paju,Wollong,Geumchon,Geumneung,Unjeong,Yadang,Tanhyeon,Ilsan,Pungsan,Baengma,Goksan;
    TextView Daegok,Neunggok,Haengsin,Gangmae,Hwajeon,Susaek,DigitalMediaCity,Gajwa,Sinchon,SeoulStation,HongikUniv,SogangUniv;
    TextView Gongdeok,HyochangPark,Yongsan,Ichon,Seobinggo,Hannam,Oksu,Eungbong,Wangsimni,Cheongnyangni,Hoegi,Jungnang,Sangbong;
    TextView Mangu,Yangwon,Guri,Donong,Yangjeong,Deokso,Dosim,Paldang,Ungilsan,Yangsu,Sinwon,Guksu,Asin,Obin,Yangpyeong,Wondeok,Yongmun,Jipyeong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_guactivity);

        Mangu = findViewById(R.id.Mangu);
        Yangwon = findViewById(R.id.Yangwon);
        Guri = findViewById(R.id.Guri);
        Donong = findViewById(R.id.Donong);
        Yangjeong = findViewById(R.id.Yangjeong);
        Deokso = findViewById(R.id.Deokso);
        Dosim = findViewById(R.id.Dosim);
        Paldang = findViewById(R.id.Paldang);
        Ungilsan = findViewById(R.id.Ungilsan);
        Yangsu = findViewById(R.id.Yangsu);
        Sinwon = findViewById(R.id.Sinwon);
        Guksu = findViewById(R.id.Guksu);
        Asin = findViewById(R.id.Asin);
        Obin = findViewById(R.id.Obin);
        Yangpyeong = findViewById(R.id.Yangpyeong);
        Wondeok = findViewById(R.id.Wondeok);
        Yongmun = findViewById(R.id.Yongmun);
        Jipyeong = findViewById(R.id.Jipyeong);


        Gongdeok = findViewById(R.id.Gongdeok);
        HyochangPark = findViewById(R.id.HyochangPark);
        Yongsan = findViewById(R.id.Yongsan);
        Ichon = findViewById(R.id.Ichon);
        Seobinggo = findViewById(R.id.Seobinggo);
        Hannam = findViewById(R.id.Hannam);
        Oksu = findViewById(R.id.Oksu);
        Eungbong = findViewById(R.id.Eungbong);
        Wangsimni = findViewById(R.id.Wangsimni);
        Cheongnyangni = findViewById(R.id.Cheongnyangni);
        Hoegi = findViewById(R.id.Hoegi);
        Jungnang = findViewById(R.id.Jungnang);
        Sangbong = findViewById(R.id.Sangbong);

        Imjingang = findViewById(R.id.Imjingang);
        Munsan = findViewById(R.id.Munsan);
        Paju = findViewById(R.id.Paju);
        Wollong = findViewById(R.id.Wollong);
        Geumchon = findViewById(R.id.Geumchon);
        Geumneung = findViewById(R.id.Geumneung);
        Unjeong = findViewById(R.id.Unjeong);
        Yadang = findViewById(R.id.Yadang);
        Tanhyeon = findViewById(R.id.Tanhyeon);
        Ilsan = findViewById(R.id.Ilsan);
        Pungsan = findViewById(R.id.Pungsan);
        Baengma = findViewById(R.id.Baengma);
        Goksan = findViewById(R.id.Goksan);

        Daegok = findViewById(R.id.Daegok);
        Neunggok = findViewById(R.id.Neunggok);
        Haengsin = findViewById(R.id.Haengsin);
        Gangmae = findViewById(R.id.Gangmae);
        Hwajeon = findViewById(R.id.Hwajeon);
        Susaek = findViewById(R.id.Susaek);
        DigitalMediaCity = findViewById(R.id.DigitalMediaCity);
        Gajwa = findViewById(R.id.Gajwa);
        Sinchon = findViewById(R.id.Sinchon);
        SeoulStation = findViewById(R.id.SeoulStation);
        HongikUniv = findViewById(R.id.HongikUniv);
        SogangUniv = findViewById(R.id.SogangUniv);

        Imjingang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Munsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Paju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Wollong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Geumchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Geumneung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Unjeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Yadang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Tanhyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Ilsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Pungsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Baengma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Goksan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Daegok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Neunggok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Haengsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Gangmae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Hwajeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Susaek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        DigitalMediaCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Gajwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Sinchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        SeoulStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        HongikUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        SogangUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Gongdeok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        HyochangPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Yongsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Ichon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Seobinggo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Hannam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Oksu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Eungbong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Wangsimni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Cheongnyangni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Hoegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Jungnang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Sangbong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Mangu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Yangwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Guri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Donong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Yangjeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Deokso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Dosim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Paldang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Ungilsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Yangsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Sinwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Guksu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Asin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Obin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Yangpyeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Wondeok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Yongmun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });
        Jipyeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gu_gsp.class);
                startActivity(intent);
            }
        });







    }
}