package com.example.indotravel;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //merubah ke activity selanjutnya

                Intent gotogetstarted = new Intent(MainActivity.this,GetStarted.class);
                startActivity(gotogetstarted);
                finish();
            }
        }, 1000);
    }
}
