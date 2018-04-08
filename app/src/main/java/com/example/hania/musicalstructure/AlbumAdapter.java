package com.example.hania.musicalstructure;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(Activity context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemview = convertView;
        if (listItemview == null) {
            listItemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_list, parent, false);
        }

        Album currentAlbum = getItem(position);

        TextView albumTextView = listItemview.findViewById(R.id.act_album);
        albumTextView.setText(currentAlbum.getAlbum_name());

        TextView artistTextView = listItemview.findViewById(R.id.act_artist);
        artistTextView.setText(currentAlbum.getArtist());

        TextView nr_of_songsTextView = listItemview.findViewById(R.id.act_nr_of_songs);
        nr_of_songsTextView.setText(String.valueOf(currentAlbum.getNr_of_songs()));


        return listItemview;
    }
}
