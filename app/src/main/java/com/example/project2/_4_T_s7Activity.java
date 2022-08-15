package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_s7Activity extends AppCompatActivity {

    TextView Seongnam,Sangok,BupyeongguOffice,Gulpocheon,SamsanGymnasium,Sangdong,BucheonCityHall,Sinjungdong,Chunui;
    TextView BucheonStadium,Kkachiul,Onsu,Cheonwang,Gwangmyeongsageori,Cheolsan,GasanDigitalComplex,Namguro,Daerim,Sinpung;
    TextView Boramae,Sindaebangsamgeori,Jangseungbaegi,Sangdo,SoongsilUniv,Namseong,ChongshinUniv,Naebang;
    TextView ExpressBusTerminal,Banpo,Nonhyeon,Hakdong,GangnamguOffice,Cheongdam,TtukseomPark,KonkukUniv;
    TextView ChildrensGrandPark,Gunja,Junggok,Yongmasan,Sagajeong,Myeonmok,Sangbong,Junghwa,Meokgol,Taereung;
    TextView Gongneung,Hagye,Junggye,Nowon,Madeul,Suraksan,Dobongsan,Jangam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts7);

        Myeonmok = findViewById(R.id.Myeonmok);
        Sangbong = findViewById(R.id.Sangbong);
        Junghwa = findViewById(R.id.Junghwa);
        Meokgol = findViewById(R.id.Meokgol);
        Taereung = findViewById(R.id.Taereung);
        Gongneung = findViewById(R.id.Gongneung);
        Hagye = findViewById(R.id.Hagye);
        Junggye = findViewById(R.id.Junggye);
        Nowon = findViewById(R.id.Nowon);
        Madeul = findViewById(R.id.Madeul);
        Suraksan = findViewById(R.id.Suraksan);
        Dobongsan = findViewById(R.id.Dobongsan);
        Jangam = findViewById(R.id.Jangam);

        ExpressBusTerminal = findViewById(R.id.ExpressBusTerminal);
        Banpo = findViewById(R.id.Banpo);
        Hakdong = findViewById(R.id.Hakdong);
        Nonhyeon = findViewById(R.id.Nonhyeon);
        GangnamguOffice = findViewById(R.id.GangnamguOffice);
        Cheongdam = findViewById(R.id.Cheongdam);
        TtukseomPark = findViewById(R.id.TtukseomPark);
        KonkukUniv = findViewById(R.id.KonkukUniv);
        ChildrensGrandPark = findViewById(R.id.ChildrensGrandPark);
        Gunja = findViewById(R.id.Gunja);
        Junggok = findViewById(R.id.Junggok);
        Yongmasan = findViewById(R.id.Yongmasan);
        Sagajeong = findViewById(R.id.Sagajeong);

        Gwangmyeongsageori = findViewById(R.id.Gwangmyeongsageori);
        Cheolsan = findViewById(R.id.Cheolsan);
        GasanDigitalComplex = findViewById(R.id.GasanDigitalComplex);
        Namguro = findViewById(R.id.Namguro);
        Daerim = findViewById(R.id.Daerim);
        Boramae = findViewById(R.id.Boramae);
        Sinpung = findViewById(R.id.Sinpung);
        Sindaebangsamgeori = findViewById(R.id.Sindaebangsamgeori);
        Jangseungbaegi = findViewById(R.id.Jangseungbaegi);
        Sangdo = findViewById(R.id.Sangdo);
        SoongsilUniv = findViewById(R.id.SoongsilUniv);
        Namseong = findViewById(R.id.Namseong);
        ChongshinUniv = findViewById(R.id.ChongshinUniv);
        Naebang = findViewById(R.id.Naebang);

        Seongnam = findViewById(R.id.Seongnam);
        Sangok = findViewById(R.id.Sangok);
        BupyeongguOffice = findViewById(R.id.BupyeongguOffice);
        Gulpocheon = findViewById(R.id.Gulpocheon);
        SamsanGymnasium = findViewById(R.id.SamsanGymnasium);
        Sangdong = findViewById(R.id.Sangdong);
        BucheonCityHall = findViewById(R.id.BucheonCityHall);
        Sinjungdong = findViewById(R.id.Sinjungdong);
        Chunui = findViewById(R.id.Chunui);
        BucheonStadium = findViewById(R.id.BucheonStadium);
        Kkachiul = findViewById(R.id.Kkachiul);
        Onsu = findViewById(R.id.Onsu);
        Cheonwang = findViewById(R.id.Cheonwang);

        Seongnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Sangok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        BupyeongguOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Gulpocheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        SamsanGymnasium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Sangdong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        BucheonCityHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Sinjungdong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Chunui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        BucheonStadium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Kkachiul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Onsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Cheonwang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Gwangmyeongsageori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Cheolsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        GasanDigitalComplex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Namguro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Daerim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Sinpung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Boramae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Sindaebangsamgeori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Jangseungbaegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Sangdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        SoongsilUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Namseong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        ChongshinUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Naebang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        ExpressBusTerminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Banpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Nonhyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Hakdong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        GangnamguOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Cheongdam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        TtukseomPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        KonkukUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        ChildrensGrandPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Gunja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Junggok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Yongmasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Sagajeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Myeonmok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Sangbong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Junghwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Meokgol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Taereung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Gongneung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Hagye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Junggye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Nowon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Madeul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Suraksan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Dobongsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });
        Jangam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s7_gsp.class);
                startActivity(intent);
            }
        });






    }
}