package com.example.hania.musicalstructure;

public class Album {
    private String mArtist;
    private String mAlbum_name;
    private int mNr_of_songs;

    public Album(String artist, String album_name, int nr_of_songs) {
        mArtist = artist;
        mAlbum_name = album_name;
        mNr_of_songs = nr_of_songs;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getAlbum_name() {
        return mAlbum_name;
    }

    public int getNr_of_songs() {
        return mNr_of_songs;
    }
}
