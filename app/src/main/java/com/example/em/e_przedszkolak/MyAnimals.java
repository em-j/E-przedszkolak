package com.example.em.e_przedszkolak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Em on 2016-04-06.
 */
public class MyAnimals extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_animals);
        Intent aIntent = getIntent();


    }


    public void onButtonOpenPig(View view) {
        Intent aIntent = new Intent(this, Pig.class);
        startActivity(aIntent);
    }
}