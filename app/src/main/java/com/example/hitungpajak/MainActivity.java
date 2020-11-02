package com.example.hitungpajak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etAngka, etPersen;
    Button btnHitung, btnReset;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAngka = findViewById(R.id.etAngka);
        etPersen = findViewById(R.id.et_persen);
        tvHasil = findViewById(R.id.tv_hasil);
        btnHitung = findViewById(R.id.btn_hitung);
        btnReset = findViewById(R.id.btn_reset);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka = etAngka.getText().toString();
                String persen = etPersen.getText().toString();

                hitungPajak(Integer.parseInt(angka), Integer.parseInt(persen));
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etAngka.setText("");
                etPersen.setText("");
                tvHasil.setText("");
            }
        });



    }

    private void hitungPajak(int angka, int persen) {
        int hasil = angka + (angka * persen / 100);
        tvHasil.setText(String.valueOf(hasil));
    }
}