package com.example.tugaspakajipart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText ETusername;
    EditText ETpasssword;
    Button BTNlogin;

    RelativeLayout relatif1 , relatif2;

    Handler handler = new Handler();
    Runnable runabble = new Runnable() {
        @Override
        public void run() {
            relatif1.setVisibility(View.VISIBLE);
            relatif2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        relatif1 = (RelativeLayout) findViewById(R.id.relatife1);
        relatif2 = (RelativeLayout) findViewById(R.id.relatife2);

        handler.postDelayed(runabble, 2000);

        ETusername = findViewById(R.id.ETusername);
        ETpasssword = findViewById(R.id.ETpassword);
        BTNlogin = findViewById(R.id.BTNlogin);
        BTNlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ETusername.getText().toString().equalsIgnoreCase("awaw") ||
                        ETpasssword.getText().toString().equalsIgnoreCase("awaw")){
                    Intent pind = new Intent(login.this,MainActivity.class);
                    pind.putExtra("asek",ETusername.getText().toString());
                    startActivity(pind);
                }else{
                    Toast.makeText(login.this,"akun tidak ada",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
