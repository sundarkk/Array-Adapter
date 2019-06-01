package com.apkglobal.arrayadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String [] name={"Pawan", "Raman", "Chaman", "Naman"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, name);
        //to attach the adapter to listview
        listView.setAdapter(arrayAdapter);
        //to click on the listview
        listView.setOnItemClickListener
                (new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int i, long l) {

                /*Intent intent=new Intent(MainActivity.this,
                        HomeActivity.class);
                //pass the data using intent
                intent.putExtra("keyname", "Hello Brother");
                startActivity(intent);*/
            switch (i)
            {
                case 0:
                    Intent intent=new Intent(MainActivity.this,
                            HomeActivity.class);
                    intent.putExtra("keyname", "Hello brother this is HomeActivity");
                    startActivity(intent);
                    break;
                case 1:
                    Intent intent1=new Intent(MainActivity.this,
                            AboutActivity.class);
                    intent1.putExtra("keyname", "Hello brother this is AboutActivity");
                    startActivity(intent1);
                    break;
                case 2:
                    Intent intent2=new Intent(MainActivity.this,
                            CareerActivity.class);
                    intent2.putExtra("keyname", "Hello brother this is CareerActvity");
                    startActivity(intent2);
                    break;
                case 3:
                    Intent intent3=new Intent(MainActivity.this,
                            ContactActivity.class);
                    intent3.putExtra("keyname", "Hello brother this is ContactActivity");
                    startActivity(intent3);
                    break;
            }
            }
        });
    }
}
