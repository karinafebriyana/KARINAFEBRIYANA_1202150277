package com.example.karinafebriyana.studycasemodul1karina1202150277;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class SecondActivity extends AppCompatActivity {

    int uang = 65000; int biaya, total, hargaTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView lokasi = (TextView) findViewById(R.id.lokasi);
        TextView Menu = (TextView) findViewById(R.id.menu);
        TextView Porsi = (TextView) findViewById(R.id.porsi);
        TextView Harga = (TextView) findViewById(R.id.harga);

        Intent i = getIntent();

        String Lokasi = i.getStringExtra("tempat");
        String menu = i.getStringExtra("menu");
        String porsi= i.getStringExtra("porsi");

        Menu.setText(menu);
        Porsi.setText(porsi);
        lokasi.setText(Lokasi);

        switch (Lokasi){
            case "EATBUS":
            biaya = 50000;
            break;
            case "APNORMAL":
            biaya = 30000;
            break;

        }

        total = parseInt(porsi)*biaya;
        String hargaTotal = Integer.toString(total);
        if(uang < total) {
            Harga.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Jangan di sini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
        }else{
            Harga.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Di sini saja makan malamnya", Toast.LENGTH_SHORT).show();

        }
    }
    }


