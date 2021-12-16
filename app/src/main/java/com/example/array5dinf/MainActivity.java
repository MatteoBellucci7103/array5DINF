package com.example.array5dinf;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //ListView listView;
    //TextView textView;
    private ListView lvfilm;



    @Override
    protected void onCreate(Bundle savedInstanceState) { //costruttore implicito della classe
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //String elenco ="come va?";

        lvfilm = (ListView)findViewById(R.id.movieList);

        //definisco un array di String
        String[] film = new String[] { "Spiderman", "Lalaland", "Avenger" };

        //preparo un ArrayAdapter, aiuta perchè deleghiamo a lui i cicli per popolare la list View
        ArrayAdapter<String> aaFIlm = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, film); //ArrayAdapter sarà un gestore di array di elementi di tipo stringa, arrayList va tipizzato (String)

        //popolo la ListView iniettando i dati attraverso l'Adapter
        lvfilm.setAdapter(aaFIlm);

        lvfilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    String titolo = (String) lvfilm.getItemAtPosition(position);
                    Log.d("Errore_messaggio", "posizione: " + position);
                    //Toast.makeText(getApplicationContext(), "Hai premuto il tasto", Toast.LENGTH_LONG).show();
                    Intent apri = new Intent(getApplicationContext(),PosterFilm.class);
                    apri.putExtra("key", titolo);
                    startActivity(apri);

                    String msg = getString(R.string.esempio);
                    TextView textView = (TextView) findViewById(R.id.movieText);
                    textView.setText(msg);


            }
        });




    }
}