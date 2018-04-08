package com.example.hania.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Album> {

    public ArtistAdapter(Activity context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemview = convertView;
        if(listItemview == null) {
            listItemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_list, parent, false);
        }

        Album currentAlbum = getItem(position);

        TextView artistTextView = listItemview.findViewById(R.id.act_artist);
        artistTextView.setText(currentAlbum.getArtist());

        return listItemview;
    }
}