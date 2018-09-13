package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_songs);

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Don Williams", "I'm just a country boy", "Country boy", "1977"));
        songs.add(new Song("Don Williams", "Louisiana saturday night", "Country boy", "1977"));
        songs.add(new Song("Don Williams", "Overlooking and underthing", "Country boy", "1977"));
        songs.add(new Song("Don Williams", "Sneakin around", "Country boy", "1977"));
        songs.add(new Song("Don Williams", "Look around you", "Country boy", "1977"));
        songs.add(new Song("Don Williams", "I've got a winner in you", "Country boy", "1977"));
        songs.add(new Song("Don Williams", "Rake and rumbling man", "Country boy", "1977"));
        songs.add(new Song("Don Williams", "Too many tears", "Country boy", "1977"));
        songs.add(new Song("Don Williams", "It's gotta be magic", "Country boy", "1977"));
        songs.add(new Song("Don Williams", "Falling in love", "Country boy", "1977"));

        songs.add(new Song("Don Williams", "The only game in town", "Cafe carolina", "1984"));
        songs.add(new Song("Don Williams", "Walking a broken heart", "Cafe carolina", "1984"));
        songs.add(new Song("Don Williams", "Margie's dream", "Cafe carolina", "1984"));
        songs.add(new Song("Don Williams", "That's the thing about love", "Cafe carolina", "1984"));
        songs.add(new Song("Don Williams", "Leaving", "Cafe carolina", "1984"));
        songs.add(new Song("Don Williams", "Beautiful woman", "Cafe carolina", "1984"));
        songs.add(new Song("Don Williams", "I'll never need another you.", "Cafe carolina", "1984"));
        songs.add(new Song("Don Williams", "It's time for love", "Cafe carolina", "1984"));
        songs.add(new Song("Don Williams", "I'll be faithful to you", "Cafe carolina", "1984"));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView =  findViewById(R.id.songs_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent viewSongDetailsIntent =
                        new Intent(ListSongsActivity.this, SongDetailsActivity.class);
                viewSongDetailsIntent.putExtra("NAME_OF_ARTIST", songs.get(position).getNameOfArtist());
                viewSongDetailsIntent.putExtra("NAME_OF_ALBUM", songs.get(position).getNameOfAlbum());
                viewSongDetailsIntent.putExtra("YEAR_OF_RELEASE", songs.get(position).getYearOfRelease());
                viewSongDetailsIntent.putExtra("NAME_OF_SONG", songs.get(position).getNameOfSong());
                startActivity(viewSongDetailsIntent);
            }
        });

    }
}