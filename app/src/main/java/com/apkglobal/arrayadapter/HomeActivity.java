package com.apkglobal.arrayadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        data = findViewById(R.id.data);

        //to receive the intent
        Intent intent=getIntent();
        String data=intent.getStringExtra("keyname");
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}
