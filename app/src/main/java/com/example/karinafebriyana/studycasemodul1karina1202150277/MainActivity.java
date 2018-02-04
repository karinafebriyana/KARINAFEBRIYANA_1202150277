package com.example.karinafebriyana.studycasemodul1karina1202150277;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btEatbus, btApnormal;
    EditText makanan, jumlah;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studycase1);

        btEatbus = (Button) findViewById(R.id.buttonEatbus);
        btApnormal = (Button) findViewById(R.id.buttonApnormal);
        makanan = (EditText) findViewById(R.id.editText1);
        jumlah = (EditText) findViewById(R.id.editText2);



        btEatbus.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String tempat = btEatbus.getText().toString();
                intent.putExtra("Makanan", makanan.getText().toString());
                intent.putExtra("Tempat", tempat);
                intent.putExtra("Porsi", jumlah.getText().toString());
                startActivity(intent);
            }
        });

        btApnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String tempat = btApnormal.getText().toString();
                intent.putExtra("Makanan", makanan.getText().toString());
                intent.putExtra("Tempat", tempat);
                intent.putExtra("Porsi", jumlah.getText().toString());
                startActivity(intent);
            }
        });
    }
}


