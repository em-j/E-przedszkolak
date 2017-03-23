package com.example.em.e_przedszkolak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText theEditText = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonOpenAnimals (View view){
        Intent aIntent = new Intent(this, MyAnimals.class);
        startActivity(aIntent);
    }

    public void onButtonOpenVega(View view){
        Intent aIntent = new Intent(this, MyVege.class);
        startActivity(aIntent);
    }
    public void onButtonOpenColor(View view){
        Intent aIntent = new Intent(this, MyColor.class);
        startActivity(aIntent);
    }
    public void onButtonOpenMath(View view){
        Intent aIntent = new Intent(this, MyMath.class);
        startActivity(aIntent);
    }

    public void onButtonOpenNumb(View view) {
        Intent aIntent = new Intent(this, MyNumb.class);
        startActivity(aIntent);
    }




    }


