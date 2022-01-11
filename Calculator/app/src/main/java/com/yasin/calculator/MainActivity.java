package com.yasin.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText EditText1;         // global tanimladik ki hep yazmayalim
    EditText EditText2;
    TextView Sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText1 = findViewById(R.id.EditText1);      // Metin tanimi
        EditText2 = findViewById(R.id.EditText2);
        Sonuc = findViewById(R.id.Sonuc);
    }

    public void Toplama(View view){         // Bos mu kontrolu
        if (EditText1.getText().toString().matches("") || EditText2.getText().toString().matches("")){
            Sonuc.setText("Hata: Bir sayı giriniz!");
        }
        else{
            String y1 = EditText1.getText().toString();     // inputu metin olarak alabiliyoruz
            int x1 = Integer.parseInt(y1);      // inte cevirme
            int x2 = Integer.parseInt(EditText2.getText().toString());

            int sonuc1 = x1 + x2;
            Sonuc.setText("Cevap: " + sonuc1);        // icerisi string olmali
        }
    }

    public void Cikarma(View view){
        if (EditText1.getText().toString().matches("") || EditText2.getText().toString().matches("")){
            Sonuc.setText("Hata: Bir sayı giriniz!");
        }
        else{
            int x3 = Integer.parseInt(EditText1.getText().toString());
            int x4 = Integer.parseInt(EditText2.getText().toString());

            int sonuc2 = x3 - x4;
            Sonuc.setText("Cevap: " + sonuc2);
        }
    }

    public void Carpma(View view){
        if (EditText1.getText().toString().matches("") || EditText2.getText().toString().matches("")){
            Sonuc.setText("Hata: Bir sayı giriniz!");
        }
        else {
            int x5 = Integer.parseInt(EditText1.getText().toString());
            int x6 = Integer.parseInt(EditText2.getText().toString());

            int sonuc3 = x5 * x6;
            Sonuc.setText("Cevap: " + sonuc3);
        }
    }

    public void Bolme(View view){
        if (EditText1.getText().toString().matches("") || EditText2.getText().toString().matches("")){
            Sonuc.setText("Hata: Bir sayı giriniz!");
        }
        else if (Integer.parseInt(EditText2.getText().toString()) == 0){
            Sonuc.setText("Hata: 0'a bölemezsin!");
        }
        else{
            int x7 = Integer.parseInt(EditText1.getText().toString());
            int x8 = Integer.parseInt(EditText2.getText().toString());

            int sonuc4 = x7 / x8;
            Sonuc.setText("Cevap: " + sonuc4);
        }
    }
}