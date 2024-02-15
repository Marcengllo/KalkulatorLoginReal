package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class kalkulator extends AppCompatActivity {

    EditText idtangka1;
    EditText idtangka2;
    Spinner spinnerpilih;
    TextView txthasil;
    Button btnhitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        idtangka1 = findViewById(R.id.idtangka1);
        idtangka2 = findViewById(R.id.idtangka2);
        txthasil = findViewById(R.id.txthasil);
        spinnerpilih = findViewById(R.id.spinnerpilih);
        btnhitung = findViewById(R.id.btnhitung);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idtangka1 = findViewById(R.id.idtangka1);
                idtangka2 = findViewById(R.id.idtangka2);
                String text = spinnerpilih.getSelectedItem().toString();
                int angka1 = Integer.parseInt(idtangka1.getText().toString());
                int angka2 = Integer.parseInt(idtangka2.getText().toString());
                switch (text) {
                    case "tambah":
                        int hasilTambah = angka1 + angka2;
                        txthasil.setText(String.valueOf(hasilTambah));
                        break;
                    case "kurang":
                        if (angka1 >= angka2) {
                            int hasilKurang = angka1 - angka2;
                            txthasil.setText(String.valueOf(hasilKurang));
                        } else {
                            Toast.makeText(kalkulator.this, "Angka pertama harus lebih besar dari angka kedua", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case "kali":
                        int hasilKali = angka1 * angka2;
                        txthasil.setText(String.valueOf(hasilKali));
                        break;
                    case "bagi":
                        double doubleangka1 = Double.parseDouble(idtangka1.getText().toString());
                        double doubleangka2 = Double.parseDouble(idtangka2.getText().toString());
                        double doublehasil = doubleangka1/doubleangka2;
                        txthasil.setText(doublehasil+"");

                        break;
                }   
            }
          });
        }
    }
