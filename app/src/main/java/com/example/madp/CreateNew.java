package com.example.madp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CreateNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new);

        Button button;

        button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),HospitalInfo.class);
                startActivity(i);
            }
        });
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"New List Created",Toast.LENGTH_LONG);
        toast.show();
    }
}