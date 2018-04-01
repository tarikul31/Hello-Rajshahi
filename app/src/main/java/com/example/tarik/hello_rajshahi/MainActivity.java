package com.example.tarik.hello_rajshahi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutrajshahi(View view) {
        Intent in =new Intent(MainActivity.this,AboutRajshahi.class);
        startActivity(in);
    }

    public void historyrajshahi(View view) {
        Intent in =new Intent(MainActivity.this,HistoryRajshahi.class);
        startActivity(in);
    }

    public void rajshahidivision(View view) {
        Intent in =new Intent(MainActivity.this,RajshahiDivision.class);
        startActivity(in);
    }

    public void rjshahitransport(View view) {
        Intent in =new Intent(MainActivity.this,RajshahiTransport.class);
        startActivity(in);
    }

    public void rajshahiarts(View view) {
        Intent in =new Intent(MainActivity.this,RajshahiArts.class);
        startActivity(in);
    }
}
