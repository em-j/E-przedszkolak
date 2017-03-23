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
public class Snake extends AppCompatActivity{

    EditText theEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snake);
        Intent aIntent = getIntent();
    }

    public void onButtonOpenMenu(View view) {
        theEditText = (EditText) findViewById(R.id.editTextSnake);

        String astrMessage = theEditText.getText().toString();

        if (Objects.equals(astrMessage, "wąż")) {

            Intent aIntent = new Intent(this, MainActivity.class);
            startActivity(aIntent);
            finish();
        } else if (Objects.equals(astrMessage, "Wąż")) {

            Intent aIntent = new Intent(this, MainActivity.class);
            startActivity(aIntent);
            finish();
        }
        else {
            Toast.makeText(Snake.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();

        }


    }

}
