package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sSBActivity extends AppCompatActivity {

    TextView Sinsa,Nonhyeon,Sinnonhyeon,Gangnam,Yangjae,YangjaeCitizensForest,Cheonggyesan,Pangyo,Jeongja ;
    TextView Migeum,Dongcheon,SujiguOffice,Seongbok,Sanghyeon,GwanggyoJungang,Gwanggyo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_sbactivity);

        Sinsa = findViewById(R.id.Sinsa);
        Nonhyeon = findViewById(R.id.Nonhyeon);
        Sinnonhyeon = findViewById(R.id.Sinnonhyeon);
        Gangnam = findViewById(R.id.Gangnam);
        Yangjae = findViewById(R.id.Yangjae);
        YangjaeCitizensForest = findViewById(R.id.YangjaeCitizensForest);
        Cheonggyesan = findViewById(R.id.Cheonggyesan);
        Pangyo = findViewById(R.id.Pangyo);
        Jeongja = findViewById(R.id.Jeongja);

        Migeum = findViewById(R.id.Migeum);
        Dongcheon = findViewById(R.id.Dongcheon);
        SujiguOffice = findViewById(R.id.SujiguOffice);
        Sanghyeon = findViewById(R.id.Sanghyeon);
        GwanggyoJungang = findViewById(R.id.GwanggyoJungang);
        Gwanggyo = findViewById(R.id.Gwanggyo);
        Seongbok = findViewById(R.id.Seongbok);

        Sinsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Nonhyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Sinnonhyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Gangnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Yangjae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        YangjaeCitizensForest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Cheonggyesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Pangyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Jeongja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Migeum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Dongcheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        SujiguOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Seongbok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Sanghyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        GwanggyoJungang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });
        Gwanggyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _sb_gsp.class);
                startActivity(intent);
            }
        });




    }
}