package com.example.tugaspakajipart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //list elemen
    EditText angka1 ;
    EditText angka2 ;
    Button tambah ;
    Button kurang ;
    Button kali ;
    Button bagi ;
    TextView view ;
    TextView user ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link variable

        angka1 = findViewById(R.id.etangka1);
        angka2 = findViewById(R.id.etangka2);
        tambah = findViewById(R.id.btntambah);
        kurang = findViewById(R.id.btnkurang);
        kali = findViewById(R.id.btnkali);
        bagi = findViewById(R.id.btnbagi);
        view = findViewById(R.id.tvhasil);
        user = findViewById(R.id.tvuser);

        String username;
        Bundle extra = getIntent().getExtras();
        if (extra==null){
            username="null";
        }else{
            username=extra.getString("pind");
        }user.setText(username);


        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                String penyebut1 = angka1.getText().toString();
                String penyebut2 = angka2.getText().toString();
                int operator = Integer.parseInt(penyebut1) + Integer.parseInt(penyebut2);
                view.setText("Hasilnya adalah "+operator);}
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "masukan angka", Toast.LENGTH_SHORT).show();
                }


            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String penyebut1 = angka1.getText().toString();
                    String penyebut2 = angka2.getText().toString();
                    int operator = Integer.parseInt(penyebut1) - Integer.parseInt(penyebut2);
                    view.setText("Hasilnya adalah "+operator);}
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "masukan angka", Toast.LENGTH_SHORT).show();
                }
            }
        });
       kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String penyebut1 = angka1.getText().toString();
                    String penyebut2 = angka2.getText().toString();
                    int operator = Integer.parseInt(penyebut1) * Integer.parseInt(penyebut2);
                    view.setText("Hasilnya adalah "+operator);}
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "masukan angka", Toast.LENGTH_SHORT).show();
                }

            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String penyebut1 = angka1.getText().toString();
                    String penyebut2 = angka2.getText().toString();
                    int operator = Integer.parseInt(penyebut1) / Integer.parseInt(penyebut2);
                    view.setText("Hasilnya adalah "+operator);}
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "masukan angka", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
