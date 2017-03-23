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
public class Pig extends AppCompatActivity {

    EditText theEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pig);

    }



    public void onButtonOpenCat(View view) {
        theEditText = (EditText) findViewById(R.id.editTextPig);
       //// String p = getString(R.string.świnka);
        String astrMessage = theEditText.getText().toString();
        if(Objects.equals(astrMessage, "świnka")){

            Intent aIntent = new Intent(this, Cat.class);
            startActivity(aIntent);
            finish();
        }else if(Objects.equals(astrMessage, "Świnka")){
            Intent aIntent = new Intent(this, Cat.class);
            startActivity(aIntent);
            finish();
        }else if(Objects.equals(astrMessage, "Świnia")) {
            Intent aIntent = new Intent(this, Cat.class);
            startActivity(aIntent);
            finish();
        } else if(Objects.equals(astrMessage, "świnia")){
            Intent aIntent = new Intent(this, Cat.class);
            startActivity(aIntent);
        finish();}
        else {
            Toast.makeText(Pig.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();
        }

    }
}
