package com.example.madp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class List1 extends AppCompatActivity {

    TextView at,bt,ct,dt,et,ft,gt,ht,hospital,contact,city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);

        at = findViewById(R.id.a);
        bt = findViewById(R.id.b);
        ct = findViewById(R.id.c);
        dt = findViewById(R.id.d);
        et = findViewById(R.id.e);
        ft = findViewById(R.id.f);
        gt = findViewById(R.id.g);
        ht = findViewById(R.id.h);
        hospital = findViewById(R.id.hospital);
        city = findViewById(R.id.city);
        contact = findViewById(R.id.contact);
    }
}