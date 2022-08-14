package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_s1Activity extends AppCompatActivity {

    TextView Incheon, DongIncheon, Dowon,Jaemulpo,Dohwa,Juan,Gansuk,Dongam,Baegun,Bupyeong,Bugae,Songnae;
    TextView Jungdong,Bucheon,Sosa,Yeokgok,Onsu,Oryudong,Gaebong,Guil,Guro,Shindorim,Yeongdeungpo,Singil,Daebang;
    TextView Noryangjin,Yongsan,NamYeong,SeoulStation,CityHall,Jonggak,Jongno3ga,Jongno5ga,Dongdaemun,Dongmyo,Sinseoldong;
    TextView Jegidong,Cheongnyangni	,Hoegi	,Sinimun,Seokgye,KwangwoonUniv,Wolgye,Nokcheon,Changdong,Banghak,Dobong;
    TextView Dobongsan,Mangwolsa,Hoeryong,Uijeongbu,Ganeung,Nogyang,Yangju,Deokgye,Deokjeong,Jihaeng,Dongducheonjungang;
    TextView Bosan,Dongducheon,Soyosan,Sinchang,Onyangoncheon,Baebang,Tangjeong,Asan,Ssangyong,Bongmyeong,Cheonan;
    TextView Dujeong,Jiksan,Seonghwan,Pyeongtaek,PyeongtaekJije,Seojeongri,Songtan,Jinwi,Osan,OsanCollege,Sema,Byeongjeom;
    TextView Seodongtan,Seryu,Suwon,Hwaseo,SungkyunkwanUniv,Uiwang,Dangjeong,Gunpo,Geumjeong,Myeonghak,Anyang,Gwanak;
    TextView Seoksu,GeumcheonguOffice,Gwangmyeong,Doksan,GasanDigitalComplex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts1);

        Seoksu = findViewById(R.id.Seoksu);
        GeumcheonguOffice = findViewById(R.id.GeumcheonguOffice);
        Gwangmyeong = findViewById(R.id.Gwangmyeong);
        Doksan = findViewById(R.id.Doksan);
        GasanDigitalComplex = findViewById(R.id.GasanDigitalComplex);

        Seodongtan = findViewById(R.id.Seodongtan);
        Seryu = findViewById(R.id.Seryu);
        Suwon = findViewById(R.id.Suwon);
        Hwaseo = findViewById(R.id.Hwaseo);
        SungkyunkwanUniv = findViewById(R.id.SungkyunkwanUniv);
        Uiwang = findViewById(R.id.Uiwang);
        Dangjeong = findViewById(R.id.Dangjeong);
        Gunpo = findViewById(R.id.Gunpo);
        Geumjeong = findViewById(R.id.Geumjeong);
        Anyang = findViewById(R.id.Anyang);
        Myeonghak = findViewById(R.id.Myeonghak);
        Gwanak = findViewById(R.id.Gwanak);

        Dujeong = findViewById(R.id.Dujeong);
        Jiksan = findViewById(R.id.Jiksan);
        Seonghwan = findViewById(R.id.Seonghwan);
        Pyeongtaek = findViewById(R.id.Pyeongtaek);
        PyeongtaekJije = findViewById(R.id.PyeongtaekJije);
        Seojeongri = findViewById(R.id.Seojeongri);
        Songtan = findViewById(R.id.Songtan);
        Jinwi = findViewById(R.id.Jinwi);
        Osan = findViewById(R.id.Osan);
        OsanCollege = findViewById(R.id.OsanCollege);
        Sema = findViewById(R.id.Sema);
        Byeongjeom = findViewById(R.id.Byeongjeom);

        Bosan = findViewById(R.id.Bosan);
        Dongducheon = findViewById(R.id.Dongducheon);
        Soyosan = findViewById(R.id.Soyosan);
        Sinchang = findViewById(R.id.Sinchang);
        Onyangoncheon = findViewById(R.id.Onyangoncheon);
        Baebang = findViewById(R.id.Baebang);
        Tangjeong = findViewById(R.id.Tangjeong);
        Asan = findViewById(R.id.Asan);
        Ssangyong = findViewById(R.id.Ssangyong);
        Bongmyeong = findViewById(R.id.Bongmyeong);
        Cheonan = findViewById(R.id.Cheonan);

        Dobongsan = findViewById(R.id.Dobongsan);
        Mangwolsa = findViewById(R.id.Mangwolsa);
        Hoeryong = findViewById(R.id.Hoeryong);
        Uijeongbu = findViewById(R.id.Uijeongbu);
        Ganeung = findViewById(R.id.Ganeung);
        Nogyang = findViewById(R.id.Nogyang);
        Yangju = findViewById(R.id.Yangju);
        Deokgye = findViewById(R.id.Deokgye);
        Deokjeong = findViewById(R.id.Deokjeong);
        Jihaeng = findViewById(R.id.Jihaeng);
        Dongducheonjungang = findViewById(R.id.Dongducheonjungang);

        Jegidong = findViewById(R.id.Jegidong);
        Cheongnyangni = findViewById(R.id.Cheongnyangni);
        Hoegi = findViewById(R.id.Hoegi);
        Sinimun = findViewById(R.id.Sinimun);
        Seokgye = findViewById(R.id.Seokgye);
        KwangwoonUniv = findViewById(R.id.KwangwoonUniv);
        Wolgye = findViewById(R.id.Wolgye);
        Nokcheon = findViewById(R.id.Nokcheon);
        Changdong = findViewById(R.id.Changdong);
        Banghak = findViewById(R.id.Banghak);
        Dobong = findViewById(R.id.Dobong);

        Noryangjin = findViewById(R.id.Noryangjin);
        Yongsan = findViewById(R.id.Yongsan);
        NamYeong = findViewById(R.id.NamYeong);
        SeoulStation = findViewById(R.id.SeoulStation);
        CityHall = findViewById(R.id.CityHall);
        Jonggak = findViewById(R.id.Jonggak);
        Jongno3ga = findViewById(R.id.Jongno3ga);
        Jongno5ga = findViewById(R.id.Jongno5ga);
        Dongdaemun = findViewById(R.id.Dongdaemun);
        Dongmyo = findViewById(R.id.Dongmyo);
        Sinseoldong = findViewById(R.id.Sinseoldong);

        Jungdong = findViewById(R.id.Jungdong);
        Bucheon = findViewById(R.id.Bucheon);
        Sosa = findViewById(R.id.Sosa);
        Yeokgok = findViewById(R.id.Yeokgok);
        Onsu = findViewById(R.id.Onsu);
        Oryudong = findViewById(R.id.Oryudong);
        Gaebong = findViewById(R.id.Gaebong);
        Guil = findViewById(R.id.Guil);
        Guro = findViewById(R.id.Guro);
        Yeongdeungpo = findViewById(R.id.Yeongdeungpo);
        Shindorim = findViewById(R.id.Shindorim);
        Singil = findViewById(R.id.Singil);
        Daebang = findViewById(R.id.Daebang);


        Incheon = findViewById(R.id.Incheon);
        DongIncheon = findViewById(R.id.DongIncheon);
        Dowon = findViewById(R.id.Dowon);
        Jaemulpo = findViewById(R.id.Jaemulpo);
        Dohwa = findViewById(R.id.Dohwa);
        Juan = findViewById(R.id.Juan);
        Gansuk = findViewById(R.id.Gansuk);
        Dongam = findViewById(R.id.Dongam);
        Baegun = findViewById(R.id.Baegun);
        Bupyeong = findViewById(R.id.Bupyeong);
        Bugae = findViewById(R.id.Bugae);
        Songnae = findViewById(R.id.Songnae);

        Incheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        DongIncheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Dowon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Jaemulpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Dohwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Juan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Gansuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Dongam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Baegun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Bupyeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Bugae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Songnae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Jungdong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Bucheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Sosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Yeokgok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Onsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Oryudong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Gaebong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Guil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Guro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Shindorim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Yeongdeungpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Singil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Daebang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Noryangjin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Yongsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        NamYeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        SeoulStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        CityHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Jonggak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Jongno3ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Jongno5ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Dongdaemun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Dongmyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Sinseoldong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Jegidong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Cheongnyangni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Hoegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Sinimun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Seokgye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        KwangwoonUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Wolgye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Nokcheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Changdong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Banghak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Dobong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Dobongsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Mangwolsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Hoeryong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Uijeongbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Ganeung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Nogyang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Yangju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Deokgye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Deokjeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Jihaeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Dongducheonjungang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Bosan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Dongducheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Soyosan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Sinchang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Onyangoncheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Baebang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Tangjeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Asan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Ssangyong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Bongmyeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Cheonan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Dujeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Jiksan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Seonghwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Pyeongtaek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        PyeongtaekJije.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Seojeongri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Songtan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Jinwi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Osan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        OsanCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Sema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Byeongjeom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Seodongtan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Seryu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Suwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Hwaseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        SungkyunkwanUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Uiwang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Dangjeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Gunpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Geumjeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Myeonghak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Anyang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Gwanak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Seoksu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        GeumcheonguOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Gwangmyeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        Doksan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
        GasanDigitalComplex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s1_gsp.class);
                startActivity(intent);
            }
        });
    }
}