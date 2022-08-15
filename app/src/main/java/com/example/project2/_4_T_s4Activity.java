package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_s4Activity extends AppCompatActivity {

    TextView Oido,Jeongwang,Singiloncheon,Ansan,Choji,Gojan,Jungang,HanyangUnivatAnsan,Sangnoksu,Banwol,Daeyami,Sanbon,Geumjeong,Beomgye,Pyeongchon,Indeogwon ;
    TextView GovernmentComplexGwacheon,Surisan,Gwacheon,SeoulGrandPark,SeoulRacecoursePark,Seonbawi,Namtaeryeong,Sadang,ChongshinUniv,Dongjak,Ichon,Sinyongsan,Samgakji ;
    TextView SookmyungWomensUniversity,SeoulStation,Hoehyeon,Myeongdong,Chungmuro,DDP,Dongdaemun,Hyehwa,HansungUniv,SungshinWomensUniversity,Gireum,Miasageori ;
    TextView Mia,Suyu,Ssangmun,Changdong,Nowon,Sanggye,Danggogae,ByeollaeByeolgaram,Onam,Jinjeop ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts4);

        Mia = findViewById(R.id.Mia);
        Suyu = findViewById(R.id.Suyu);
        Ssangmun = findViewById(R.id.Ssangmun);
        Changdong = findViewById(R.id.Changdong);
        Nowon = findViewById(R.id.Nowon);
        Sanggye = findViewById(R.id.Sanggye);
        Danggogae = findViewById(R.id.Danggogae);
        ByeollaeByeolgaram = findViewById(R.id.ByeollaeByeolgaram);
        Onam = findViewById(R.id.Onam);
        Jinjeop = findViewById(R.id.Jinjeop);

        SookmyungWomensUniversity = findViewById(R.id.SookmyungWomensUniversity);
        SeoulStation = findViewById(R.id.SeoulStation);
        Hoehyeon = findViewById(R.id.Hoehyeon);
        Myeongdong = findViewById(R.id.Myeongdong);
        Chungmuro = findViewById(R.id.Chungmuro);
        DDP = findViewById(R.id.DDP);
        Dongdaemun = findViewById(R.id.Dongdaemun);
        Hyehwa = findViewById(R.id.Hyehwa);
        HansungUniv = findViewById(R.id.HansungUniv);
        SungshinWomensUniversity = findViewById(R.id.SungshinWomensUniversity);
        Gireum = findViewById(R.id.Gireum);
        Miasageori = findViewById(R.id.Miasageori);

        GovernmentComplexGwacheon = findViewById(R.id.GovernmentComplexGwacheon);
        Surisan = findViewById(R.id.Surisan);
        Gwacheon = findViewById(R.id.Gwacheon);
        SeoulGrandPark = findViewById(R.id.SeoulGrandPark);
        SeoulRacecoursePark = findViewById(R.id.SeoulRacecoursePark);
        Seonbawi = findViewById(R.id.Seonbawi);
        Namtaeryeong = findViewById(R.id.Namtaeryeong);
        Sadang = findViewById(R.id.Sadang);
        ChongshinUniv = findViewById(R.id.ChongshinUniv);
        Dongjak = findViewById(R.id.Dongjak);
        Ichon = findViewById(R.id.Ichon);
        Sinyongsan = findViewById(R.id.Sinyongsan);
        Samgakji = findViewById(R.id.Samgakji);

        Oido = findViewById(R.id.Oido);
        Jeongwang = findViewById(R.id.Jeongwang);
        Singiloncheon = findViewById(R.id.Singiloncheon);
        Ansan = findViewById(R.id.Ansan);
        Choji = findViewById(R.id.Choji);
        Gojan = findViewById(R.id.Gojan);
        Jungang = findViewById(R.id.Jungang);
        HanyangUnivatAnsan = findViewById(R.id.HanyangUnivatAnsan);
        Sangnoksu = findViewById(R.id.Sangnoksu);
        Banwol = findViewById(R.id.Banwol);
        Daeyami = findViewById(R.id.Daeyami);
        Sanbon = findViewById(R.id.Sanbon);
        Geumjeong = findViewById(R.id.Geumjeong);
        Beomgye = findViewById(R.id.Beomgye);
        Pyeongchon = findViewById(R.id.Pyeongchon);
        Indeogwon = findViewById(R.id.Indeogwon);
        Oido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Jeongwang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Singiloncheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Ansan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Choji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Gojan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Jungang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        HanyangUnivatAnsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Sangnoksu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Banwol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Daeyami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Sanbon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Geumjeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Beomgye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Pyeongchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Indeogwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        GovernmentComplexGwacheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Surisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Gwacheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        SeoulGrandPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        SeoulRacecoursePark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Seonbawi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Namtaeryeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Sadang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        ChongshinUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Dongjak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Ichon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Sinyongsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Samgakji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        SookmyungWomensUniversity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        SeoulStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Hoehyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Myeongdong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Chungmuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        DDP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Dongdaemun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Hyehwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        HansungUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        SungshinWomensUniversity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Gireum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Miasageori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Mia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Suyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Ssangmun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Changdong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Nowon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Sanggye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Danggogae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        ByeollaeByeolgaram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Onam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });
        Jinjeop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s4_gsp.class);
                startActivity(intent);
            }
        });

    }
}