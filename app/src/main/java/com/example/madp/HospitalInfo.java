package com.example.madp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HospitalInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_info);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Fill a Request",Toast.LENGTH_LONG);
        toast.show();
    }
}