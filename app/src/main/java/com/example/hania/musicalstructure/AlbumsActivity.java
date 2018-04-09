package com.example.hania.musicalstructure;

import android.content.Context;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    TextView albumName, artistName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Depeche Mode", "Playing The Angle", 12));
        albums.add(new Album("Depeche Mode", "Exciter", 13));
        albums.add(new Album("David Bowie", "Heathen", 12));
        albums.add(new Album("David Bowie", "Scary Monsters", 10));
        albums.add(new Album("Nujabes", "Modal Soul", 14));
        albums.add(new Album("Rammstein", "Mutter", 11));
        albums.add(new Album("Nick Cave & The Bad Seeds", "Push the Sky Away", 9));
        albums.add(new Album("The Beach Boys", "Pet Sounds", 13));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }


    public void play(View view) {
        albumName = findViewById(R.id.act_album);
        String albumNameS = albumName.getText().toString();

        artistName = findViewById(R.id.act_artist);
        String artistNameS = artistName.getText().toString();

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.nowPlaying, albumNameS, artistNameS);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
