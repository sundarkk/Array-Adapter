package com.apkglobal.arrayadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CareerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);
        Intent intent=getIntent();
        String data=intent.getStringExtra("keyname");
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}
