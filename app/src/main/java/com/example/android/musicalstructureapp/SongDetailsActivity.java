package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SongDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        TextView nameOfArtistTextView = findViewById(R.id.name_of_artist);
        TextView yearOfReleaseTextView = findViewById(R.id.year_of_release);
        TextView nameOfAlbumTextView = findViewById(R.id.name_of_album);
        TextView nameOfSongTextView = findViewById(R.id.name_of_song);

        String artistName = getIntent().getStringExtra("NAME_OF_ARTISTS");
        String yearOfRelease = getIntent().getStringExtra("YEAR_OF_RELEASE");
        String nameOfAlbum = getIntent().getStringExtra("NAME_OF_ALBUM");
        String nameOfSong = getIntent().getStringExtra("NAME_OF_SONG");

        nameOfArtistTextView.setText(artistName);
        yearOfReleaseTextView.setText(yearOfRelease);
        nameOfAlbumTextView.setText(nameOfAlbum);
        nameOfSongTextView.setText(nameOfSong);
    }
}