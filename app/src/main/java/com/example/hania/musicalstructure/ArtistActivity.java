package com.example.hania.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_list);

        ArrayList<String> artists = new ArrayList<>();
        artists.add("Depeche Mode");
        artists.add("Depeche Mode");
        artists.add("David Bowie");
        artists.add("David Bowie");
        artists.add("Nujabes");
        artists.add("Rammstein");
        artists.add("Nick Cave & The Bad Seeds");
        artists.add("The Beach Boys");

//        I wanted to use "the same" (or similar) data that I used in Albums, but do not display duplicates
        Set<String> artistsSet = new HashSet<String>(artists);
        artists.clear();
        artists.addAll(artistsSet);

        Log.d("ArtistActivity", "set is " + artistsSet);
        Log.d("ArtistActivity", "new list is " + artists);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, artists);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}