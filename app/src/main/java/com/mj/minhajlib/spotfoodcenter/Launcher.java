package com.mj.minhajlib.spotfoodcenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    public void launchMainActivity(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        //finish();
    }
}
