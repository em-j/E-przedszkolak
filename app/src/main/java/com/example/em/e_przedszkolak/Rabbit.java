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
public class Rabbit extends AppCompatActivity{

    EditText theEditText = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabbit);

    }

    public void onButtonOpenSnake(View view) {

        theEditText = (EditText) findViewById(R.id.editTextRabbit);


        String astrMessage = theEditText.getText().toString();

        if(Objects.equals(astrMessage, "królik")){

            Intent aIntent = new Intent(this, Snake.class);
            startActivity(aIntent);
            finish();
        } else if(Objects.equals(astrMessage, "Królik")){
            Intent aIntent = new Intent(this, Snake.class);
            startActivity(aIntent);
            finish();
        }
        else {
            Toast.makeText(Rabbit.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();
        }

    }

}
