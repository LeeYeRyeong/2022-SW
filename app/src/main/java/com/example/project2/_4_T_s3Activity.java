package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class _4_T_s3Activity extends AppCompatActivity {

    TextView Daehwa,Juyeop,Jeongbalsan,Madu,Baekseok,Daegok,Hwajeong,Wondang,Wonheung,Samsong,Jichuk,Gupabal,Yeonsinnae;
    TextView Bulgwang,Nokbeon,Hongje,Muakjae,Dongnimmun,Gyeongbokgung,Anguk,Jongno3ga,Euljiro3ga,Chungmuro,DonggukUniv;
    TextView Yaksu,Geumho,Oksu,Apgujeong,Sinsa,Jamwon,ExpressBusTerminal,SeoulNatlUnivofEducation,NambuBusTerminal,Yangjae;
    TextView Maebong,Dogok,Daechi,Hangnyeoul,Daecheong,Irwon,Suseo,GarakMarket,NationalPoliceHospital,Ogeum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts3);

        Maebong = findViewById(R.id.Maebong);
        Dogok = findViewById(R.id.Dogok);
        Daechi = findViewById(R.id.Daechi);
        Hangnyeoul = findViewById(R.id.Hangnyeoul);
        Irwon = findViewById(R.id.Irwon);
        Suseo = findViewById(R.id.Suseo);
        GarakMarket = findViewById(R.id.GarakMarket);
        NationalPoliceHospital = findViewById(R.id.NationalPoliceHospital);
        Daecheong = findViewById(R.id.Daecheong);
        Ogeum = findViewById(R.id.Ogeum);

        Yaksu = findViewById(R.id.Yaksu);
        Geumho = findViewById(R.id.Geumho);
        Oksu = findViewById(R.id.Oksu);
        Apgujeong = findViewById(R.id.Apgujeong);
        Sinsa = findViewById(R.id.Sinsa);
        Jamwon = findViewById(R.id.Jamwon);
        ExpressBusTerminal = findViewById(R.id.ExpressBusTerminal);
        SeoulNatlUnivofEducation = findViewById(R.id.SeoulNatlUnivofEducation);
        NambuBusTerminal = findViewById(R.id.NambuBusTerminal);
        Yangjae = findViewById(R.id.Yangjae);

        Bulgwang = findViewById(R.id.Bulgwang);
        Nokbeon = findViewById(R.id.Nokbeon);
        Hongje = findViewById(R.id.Hongje);
        Muakjae = findViewById(R.id.Muakjae);
        Dongnimmun = findViewById(R.id.Dongnimmun);
        Gyeongbokgung = findViewById(R.id.Gyeongbokgung);
        Anguk = findViewById(R.id.Anguk);
        Jongno3ga = findViewById(R.id.Jongno3ga);
        Euljiro3ga = findViewById(R.id.Euljiro3ga);
        Chungmuro = findViewById(R.id.Chungmuro);
        DonggukUniv = findViewById(R.id.DonggukUniv);

        Daehwa = findViewById(R.id.Daehwa);
        Juyeop = findViewById(R.id.Juyeop);
        Jeongbalsan = findViewById(R.id.Jeongbalsan);
        Madu = findViewById(R.id.Madu);
        Baekseok = findViewById(R.id.Baekseok);
        Daegok = findViewById(R.id.Daegok);
        Hwajeong = findViewById(R.id.Hwajeong);
        Wondang = findViewById(R.id.Wondang);
        Wonheung = findViewById(R.id.Wonheung);
        Samsong = findViewById(R.id.Samsong);
        Jichuk = findViewById(R.id.Jichuk);
        Gupabal = findViewById(R.id.Gupabal);
        Yeonsinnae = findViewById(R.id.Yeonsinnae);

        Daehwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Juyeop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Jeongbalsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Madu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Baekseok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Daegok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Hwajeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Wondang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Wonheung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Samsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Jichuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Gupabal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Yeonsinnae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Bulgwang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Nokbeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Hongje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Muakjae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Dongnimmun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Gyeongbokgung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Anguk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Jongno3ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Euljiro3ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Chungmuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        DonggukUniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Yaksu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Geumho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Oksu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Apgujeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Sinsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Jamwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        ExpressBusTerminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        SeoulNatlUnivofEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        NambuBusTerminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Yangjae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Maebong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Dogok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Daechi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Hangnyeoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Daecheong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Irwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Suseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        GarakMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        NationalPoliceHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });
        Ogeum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _s3_gsp.class);
                startActivity(intent);
            }
        });






    }
}