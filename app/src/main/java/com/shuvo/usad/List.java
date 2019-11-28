package com.shuvo.usad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Button bijoy = (Button)findViewById(R.id.bijoy);

        bijoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Bijoy.class));
            }
        });
        Button nisha = (Button)findViewById(R.id.nisha);

        nisha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Nisha.class));
            }
        });

        Button akash = (Button)findViewById(R.id.akash);

        akash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Akash.class));
            }
        });


        Button fuad = (Button)findViewById(R.id.fuad);

        fuad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Fuad.class));
            }
        });
        Button manik = (Button)findViewById(R.id.manik);

        manik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Manik.class));
            }
        });
        Button arafat = (Button)findViewById(R.id.arafat);

        arafat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Arafat.class));
            }
        });
        Button shahidul = (Button)findViewById(R.id.shahidul);

        shahidul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Shahidul.class));
            }
        });
        Button zakirul = (Button)findViewById(R.id.zakirul);

        zakirul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Zakirul.class));
            }
        });
        Button intik = (Button)findViewById(R.id.intik);

        intik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Intik.class));
            }
        });
        Button shahriar = (Button)findViewById(R.id.shahriar);

        shahriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Shahriar.class));
            }
        });

        Button pinky = (Button)findViewById(R.id.pinky);

        pinky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Pinky.class));
            }
        });

        Button leon = (Button)findViewById(R.id.leon);

        leon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Leon.class));
            }
        });

        Button shah = (Button)findViewById(R.id.shah);

        shah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, shah.class));
            }
        });
        Button raju = (Button)findViewById(R.id.raju);

        raju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Raju.class));
            }
        });
        Button mukto = (Button)findViewById(R.id.mukto);

        mukto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Mukto.class));
            }
        });

        Button suzon = (Button)findViewById(R.id.suzon);

        suzon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Suzon.class));
            }
        });

        Button zakir = (Button)findViewById(R.id.zakir);

        zakir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Zakir.class));
            }
        });
        Button firoz = (Button)findViewById(R.id.firoz);

        firoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Firoz.class));
            }
        });
        Button nobel = (Button)findViewById(R.id.nobel);

        nobel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Nobel.class));
            }
        });

        Button sabuj = (Button)findViewById(R.id.sabuj);

        sabuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Sabuj.class));
            }
        });
        Button sohan = (Button)findViewById(R.id.sohan);

        sohan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Sohan.class));
            }
        });

        Button mukul = (Button)findViewById(R.id.mukul);

        mukul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Mukul.class));
            }
        });

        Button anam = (Button)findViewById(R.id.anam);

        anam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Anam.class));
            }
        });

        Button milon = (Button)findViewById(R.id.milon);

        milon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Milon.class));
            }
        });

        Button aminul = (Button)findViewById(R.id.aminul);

        aminul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Aminul.class));
            }
        });


        Button jahurul = (Button)findViewById(R.id.jahurul);

        jahurul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Jahurul.class));
            }
        });

        Button nasir = (Button)findViewById(R.id.nasir);

        nasir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Nasir.class));
            }
        });


        Button arif = (Button)findViewById(R.id.arif);

        arif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Arif.class));
            }
        });

        Button sabuj2 = (Button)findViewById(R.id.sabuj2);

        sabuj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Sabuj2.class));
            }
        });

        Button khalil = (Button)findViewById(R.id.khalil);

        khalil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Khalil.class));
            }
        });

        Button shohel = (Button)findViewById(R.id.shohel);

        shohel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Shohel.class));
            }
        });

        Button shirazul = (Button)findViewById(R.id.shirazul);

        shirazul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Shirazul.class));
            }
        });


        Button mosharraf = (Button)findViewById(R.id.mosharraf);

        nasir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Mosharraf.class));
            }
        });

        Button likhon = (Button)findViewById(R.id.likhon);

        likhon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Likhon.class));
            }
        });

        Button ashura = (Button)findViewById(R.id.ashura);

        ashura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Ashura.class));
            }
        });
        Button nion = (Button)findViewById(R.id.nion);

        nion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Nion.class));
            }
        });
        Button ariful = (Button)findViewById(R.id.ariful);

        ariful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Ariful.class));
            }
        });

        Button farida = (Button)findViewById(R.id.farida);

        farida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Farida.class));
            }
        });
        Button alal = (Button)findViewById(R.id.alal);

        alal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Alal.class));
            }
        });

        Button biggamin = (Button)findViewById(R.id.biggamin);

        biggamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, biggamin.class));
            }
        });

        Button rashed = (Button)findViewById(R.id.rashed);

        rashed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Rashed.class));
            }
        });


        Button subid = (Button)findViewById(R.id.subid);

        subid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Subid.class));
            }
        });

        Button rubel = (Button)findViewById(R.id.rubel);

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Rubel.class));
            }
        });

        Button hiru = (Button)findViewById(R.id.hiru);

        hiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Hiru.class));
            }
        });

        Button asad = (Button)findViewById(R.id.asad);

        asad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Asad.class));
            }
        });

        Button sumi = (Button)findViewById(R.id.sumi);

        sumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Sumi.class));
            }
        });

        Button papul = (Button)findViewById(R.id.papul);

        papul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Papul.class));
            }
        });


        Button limon = (Button)findViewById(R.id.limon);

        limon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Limon.class));
            }
        });


        Button sagor = (Button)findViewById(R.id.sagor);

        sagor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Sagor.class));
            }
        });

        Button ripon = (Button)findViewById(R.id.ripon);

        ripon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Ripon.class));
            }
        });

        Button mosharaf = (Button)findViewById(R.id.mosharaf);

        mosharaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Mosharaf.class));
            }
        });

        Button farzana = (Button)findViewById(R.id.farzana);

        farzana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Farzana.class));
            }
        });

        Button abubakar = (Button)findViewById(R.id.abubakar);

        abubakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Abubakar.class));
            }
        });
        Button raju2 = (Button)findViewById(R.id.raju2);

        raju2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Raju2.class));
            }
        });

        Button nayan = (Button)findViewById(R.id.nayan);

        nayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Nayan.class));
            }
        });

        Button rafi = (Button)findViewById(R.id.rafi);

        rafi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Rafi.class));
            }
        });


        Button jia = (Button)findViewById(R.id.jia);

        jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Jia.class));
            }
        });

        Button shariful = (Button)findViewById(R.id.shariful);

        shariful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Shariful.class));
            }
        });

        Button jahid = (Button)findViewById(R.id.jahid);

        jahid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Jahid.class));
            }
        });

        Button siam = (Button)findViewById(R.id.siam);

        siam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Siam.class));
            }
        });

        Button suman = (Button)findViewById(R.id.suman);

        suman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Suman.class));
            }
        });

        Button mazid = (Button)findViewById(R.id.mazid);

        mazid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Mazid.class));
            }
        });
        Button shuvo = (Button)findViewById(R.id.shuvo);

        shuvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Shuvo.class));
            }
        });



    }
}
