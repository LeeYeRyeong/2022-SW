package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_sGGActivity extends AppCompatActivity {

    TextView Pangyo, Imae, Samdong, GyeonggiGwangju, Chowol, Gonjiam, Sindundoyechon, Icheon, Bubal, Sejongdaewangneung, Yeoju ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_ggactivity);

        Pangyo = findViewById(R.id.Pangyo);
        Imae = findViewById(R.id.Imae);
        Samdong = findViewById(R.id.Samdong);
        GyeonggiGwangju = findViewById(R.id.GyeonggiGwangju);
        Chowol = findViewById(R.id.Chowol);
        Gonjiam = findViewById(R.id.Gonjiam);
        Sindundoyechon = findViewById(R.id.Sindundoyechon);
        Pangyo = findViewById(R.id.Pangyo);
        Icheon = findViewById(R.id.Icheon);
        Bubal = findViewById(R.id.Bubal);
        Sejongdaewangneung = findViewById(R.id.Sejongdaewangneung);
        Yeoju = findViewById(R.id.Yeoju);

        Pangyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gg_gsp.class);
                startActivity(intent);
            }
        });
        Imae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gg_gsp.class);
                startActivity(intent);
            }
        });
        Samdong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gg_gsp.class);
                startActivity(intent);
            }
        });
        GyeonggiGwangju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gg_gsp.class);
                startActivity(intent);
            }
        });
        Chowol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gg_gsp.class);
                startActivity(intent);
            }
        });
        Gonjiam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gg_gsp.class);
                startActivity(intent);
            }
        });
        Sindundoyechon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gg_gsp.class);
                startActivity(intent);
            }
        });
        Icheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gg_gsp.class);
                startActivity(intent);
            }
        });
        Bubal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gg_gsp.class);
                startActivity(intent);
            }
        });
        Sejongdaewangneung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gg_gsp.class);
                startActivity(intent);
            }
        });
        Yeoju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _gg_gsp.class);
                startActivity(intent);
            }
        });





    }
}