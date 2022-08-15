package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sSIActivity extends AppCompatActivity {

    TextView Incheon,Sinpo,Sungui,InhaUniv,Songdo,Yeonsu,Woninjae,NamdongInduspark,Hogupo,IncheonNonhyeon,Soraepogu,Wolgot,Darwol;
    TextView Oido,Jeongwang,Singiloncheon,Ansan,Choji,Gojan,Jungang,HanyangUnivatAnsan,Sari,Yamok,Eocheon	,Omokcheon,Gosaek,Suwon,Maegyo;
    TextView MaetanGwonseon,Mangpo,Yeongtong,Cheongmyeong,Sanggal,Giheung,Singal,Guseong,Bojeong,Jukjeon,Ori,Migeum,Jeongja,Sunae,Seohyeon;
    TextView Moran,Taepyeong,GachonUniv,Bokjeong,Suseo,Daemosan,Gaepodong,Guryong,Dogok,Hanti,Seolleung,Seonjeongneung;
    TextView GangnamguOffice,Apgujeongrodeo,Seoulforest,Wangsimni,Cheongnyangni,SuwonCityHall,Imae,Yatap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_siactivity);

        Apgujeongrodeo = findViewById(R.id.Apgujeongrodeo);
        Seoulforest = findViewById(R.id.Seoulforest);
        Wangsimni = findViewById(R.id.Wangsimni);
        Cheongnyangni = findViewById(R.id.Cheongnyangni);
        SuwonCityHall = findViewById(R.id.SuwonCityHall);
        Imae = findViewById(R.id.Imae);
        Yatap = findViewById(R.id.Yatap);

        Moran = findViewById(R.id.Moran);
        Taepyeong = findViewById(R.id.Taepyeong);
        GachonUniv = findViewById(R.id.GachonUniv);
        Bokjeong = findViewById(R.id.Bokjeong);
        Suseo = findViewById(R.id.Suseo);
        Daemosan = findViewById(R.id.Daemosan);
        Gaepodong = findViewById(R.id.Gaepodong);
        Guryong = findViewById(R.id.Guryong);
        Dogok = findViewById(R.id.Dogok);
        Hanti = findViewById(R.id.Hanti);
        Seolleung = findViewById(R.id.Seolleung);
        Seonjeongneung = findViewById(R.id.Seonjeongneung);
        GangnamguOffice = findViewById(R.id.GangnamguOffice);

        MaetanGwonseon = findViewById(R.id.MaetanGwonseon);
        Mangpo = findViewById(R.id.Mangpo);
        Yeongtong = findViewById(R.id.Yeongtong);
        Cheongmyeong = findViewById(R.id.Cheongmyeong);
        Sanggal = findViewById(R.id.Sanggal);
        Giheung = findViewById(R.id.Giheung);
        Singal = findViewById(R.id.Singal);
        Guseong = findViewById(R.id.Guseong);
        Bojeong = findViewById(R.id.Bojeong);
        Jukjeon = findViewById(R.id.Jukjeon);
        Ori = findViewById(R.id.Ori);
        Migeum = findViewById(R.id.Migeum);
        Jeongja = findViewById(R.id.Jeongja);
        Sunae = findViewById(R.id.Sunae);
        Seohyeon = findViewById(R.id.Seohyeon);

        Oido = findViewById(R.id.Oido);
        Jeongwang = findViewById(R.id.Jeongwang);
        Singiloncheon = findViewById(R.id.Singiloncheon);
        Ansan = findViewById(R.id.Ansan);
        Choji = findViewById(R.id.Choji);
        Gojan = findViewById(R.id.Gojan);
        Jungang = findViewById(R.id.Jungang);
        HanyangUnivatAnsan = findViewById(R.id.HanyangUnivatAnsan);
        Sari = findViewById(R.id.Sari);
        Yamok = findViewById(R.id.Yamok);
        Eocheon = findViewById(R.id.Eocheon);
        Omokcheon = findViewById(R.id.Omokcheon);
        Gosaek = findViewById(R.id.Gosaek);
        Suwon = findViewById(R.id.Suwon);
        Maegyo = findViewById(R.id.Maegyo);

        Incheon = findViewById(R.id.Incheon);
        Sinpo = findViewById(R.id.Sinpo);
        Sungui = findViewById(R.id.Sungui);
        InhaUniv = findViewById(R.id.InhaUniv);
        Songdo = findViewById(R.id.Songdo);
        Yeonsu = findViewById(R.id.Yeonsu);
        Woninjae = findViewById(R.id.Woninjae);
        NamdongInduspark = findViewById(R.id.NamdongInduspark);
        Hogupo = findViewById(R.id.Hogupo);
        IncheonNonhyeon = findViewById(R.id.IncheonNonhyeon);
        Soraepogu = findViewById(R.id.Soraepogu);
        Wolgot = findViewById(R.id.Wolgot);
        Darwol = findViewById(R.id.Darwol);

        Incheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Sinpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Sungui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        InhaUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Songdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Yeonsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Woninjae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        NamdongInduspark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Hogupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        IncheonNonhyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Soraepogu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Wolgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Darwol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Oido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Jeongwang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Singiloncheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Ansan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Choji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Gojan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Jungang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        HanyangUnivatAnsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Sari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Yamok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Eocheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Omokcheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Gosaek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Suwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Maegyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        SuwonCityHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        MaetanGwonseon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Mangpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Yeongtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Cheongmyeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Sanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Giheung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Singal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Guseong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Bojeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Jukjeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Ori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Migeum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Jeongja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Sunae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Seohyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Imae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Yatap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Moran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Taepyeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        GachonUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Bokjeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Suseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Daemosan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Gaepodong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Guryong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Dogok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Hanti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Seolleung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Seonjeongneung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        GangnamguOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Apgujeongrodeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Seoulforest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Wangsimni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });
        Cheongnyangni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _si_gsp.class);
                startActivity(intent);
            }
        });

    }
}