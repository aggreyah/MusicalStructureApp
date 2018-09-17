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

        TextView nameOfArtistTextViewTitle = findViewById(R.id.name_of_artist_title);
        TextView yearOfReleaseTextViewTitle = findViewById(R.id.year_of_release_title);
        TextView nameOfAlbumTextViewTitle = findViewById(R.id.name_of_album_title);
        TextView nameOfSongTextViewTitle = findViewById(R.id.name_of_song_title);

        String artistName = getIntent().getStringExtra(getString(R.string.name_of_artist));
        String yearOfRelease = getIntent().getStringExtra(getString(R.string.year_of_release));
        String nameOfAlbum = getIntent().getStringExtra(getString(R.string.name_of_album));
        String nameOfSong = getIntent().getStringExtra(getString(R.string.name_of_song));

        nameOfArtistTextView.setText(artistName);
        nameOfArtistTextViewTitle.setText(getString(R.string.name));
        nameOfAlbumTextView.setText(nameOfAlbum);
        nameOfAlbumTextViewTitle.setText(getString(R.string.album));
        yearOfReleaseTextView.setText(yearOfRelease);
        yearOfReleaseTextViewTitle.setText(getString(R.string.year));
        nameOfSongTextView.setText(nameOfSong);
        nameOfSongTextViewTitle.setText(getString(R.string.song));
    }
}