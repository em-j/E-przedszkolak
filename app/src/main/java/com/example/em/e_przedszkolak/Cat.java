package com.example.em.e_przedszkolak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

/**
 * Created by Em on 2016-04-06.
 */
public class Cat extends AppCompatActivity {
    EditText theEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
       // Intent aIntent = getIntent();

}

    public void onButtonOpenRabbit(View view) {
        theEditText = (EditText) findViewById(R.id.editTextCat);

        String astrMessage = theEditText.getText().toString();

        if(Objects.equals(astrMessage, "kot" )){
            Intent aIntent = new Intent(this, Rabbit.class);
            startActivity(aIntent);
        }
        else if(Objects.equals(astrMessage, "kotek" )){
            Intent aIntent = new Intent(this, Rabbit.class);
            startActivity(aIntent);
            finish();}
        else if(Objects.equals(astrMessage, "Kotek" )){
            Intent aIntent = new Intent(this, Rabbit.class);
            startActivity(aIntent);
            finish();}
        else if(Objects.equals(astrMessage, "Kot" )){
            Intent aIntent = new Intent(this, Rabbit.class);
            startActivity(aIntent);
            finish();}
        else {
            Toast.makeText(Cat.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();
        }

}}
