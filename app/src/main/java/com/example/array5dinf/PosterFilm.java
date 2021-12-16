package com.example.array5dinf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class PosterFilm extends AppCompatActivity {

    ImageView imgAvenger;
    ImageView imgSpiderman;
    ImageView imgLalaland;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poster_film);
        //imgFilm = (ImageView)findViewById(R.id)
        Intent dato = getIntent();
        String titolo = dato.getStringExtra("key");

        Toast.makeText(getApplicationContext(), titolo, Toast.LENGTH_LONG).show();

        if(titolo=="Avenger")
        {
            imgAvenger.setImageResource(R.drawable.avenger);
        }
        if(titolo=="Spiderman") {
            imgSpiderman.setImageResource(R.drawable.spiderman);
        }

        if(titolo=="Lalaland")
        {
            imgLalaland.setImageResource(R.drawable.lalaland);
        }

    }
}