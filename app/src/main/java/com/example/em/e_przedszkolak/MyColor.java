package com.example.em.e_przedszkolak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Em on 2016-04-20.
 */
public class MyColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_color);
        Intent aIntent = getIntent();
    }

    public void onButtonOpenRed(View view) {
        Intent aIntent = new Intent(this, Red.class);
        startActivity(aIntent);
    }
}
