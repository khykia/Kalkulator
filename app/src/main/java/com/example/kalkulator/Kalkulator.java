package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {

    EditText txtAngkaPertama, txtAngkaKedua;
    Button btnTambah, btnKurang, btnKali, btnBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        txtAngkaPertama = (EditText) findViewById(R.id.txtAngkaPertama);
        txtAngkaKedua = (EditText) findViewById(R.id.txtAngkaKedua);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(txtAngkaPertama.getText().toString());
                int angka2 = Integer.parseInt(txtAngkaKedua.getText().toString());

                int Hasil = angka1 + angka2;
                Toast.makeText(getApplicationContext(), "Hasil = " + Hasil, Toast.LENGTH_SHORT).show();
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(txtAngkaPertama.getText().toString());
                int angka2 = Integer.parseInt(txtAngkaKedua.getText().toString());

                int Hasil = angka1 - angka2;
                Toast.makeText(getApplicationContext(), "Hasil = " + Hasil, Toast.LENGTH_SHORT).show();
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(txtAngkaPertama.getText().toString());
                int angka2 = Integer.parseInt(txtAngkaKedua.getText().toString());

                int Hasil = angka1 * angka2;
                Toast.makeText(getApplicationContext(), "Hasil = " + Hasil, Toast.LENGTH_SHORT).show();
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(txtAngkaPertama.getText().toString());
                int angka2 = Integer.parseInt(txtAngkaKedua.getText().toString());

                int Hasil = angka1 / angka2;
                Toast.makeText(getApplicationContext(), "Hasil = " + Hasil, Toast.LENGTH_SHORT).show();
            }
        });
    }
}