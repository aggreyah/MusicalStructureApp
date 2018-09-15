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
        /**first album songs to the ArrayList songs*/
        songs.add(new Song(getString(R.string.don_williams),
                String.valueOf(R.string.country_boy_song), String.valueOf(R.string.country_boy),
                String.valueOf(R.string.year_country_boy_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.lousiana), String.valueOf(R.string.country_boy),
                String.valueOf(R.string.year_country_boy_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.overlooking), String.valueOf(R.string.country_boy),
                String.valueOf(R.string.year_country_boy_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.sneaking), String.valueOf(R.string.country_boy),
                String.valueOf(R.string.year_country_boy_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.look_around), String.valueOf(R.string.country_boy),
                String.valueOf(R.string.year_country_boy_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.winner_in_you), String.valueOf(R.string.country_boy),
                String.valueOf(R.string.year_country_boy_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.rake_and_rumb), String.valueOf(R.string.country_boy),
                String.valueOf(R.string.year_country_boy_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams), String.valueOf(R.string.too_many),
                String.valueOf(R.string.country_boy),
                String.valueOf(R.string.year_country_boy_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.gotta_be_magic), String.valueOf(R.string.country_boy),
                String.valueOf(R.string.year_country_boy_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.falling), String.valueOf(R.string.country_boy),
                String.valueOf(R.string.year_country_boy_released)));

        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.the_only_game), String.valueOf(R.string.cafe_carolina),
                String.valueOf(R.string.year_cafe_carolina_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.walking_a_broke_heart),
                String.valueOf(R.string.cafe_carolina),
                String.valueOf(R.string.year_cafe_carolina_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.margie), String.valueOf(R.string.cafe_carolina),
                String.valueOf(R.string.year_cafe_carolina_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.thing_about_love), String.valueOf(R.string.cafe_carolina),
                String.valueOf(R.string.year_cafe_carolina_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.leaving), String.valueOf(R.string.cafe_carolina),
                String.valueOf(R.string.year_cafe_carolina_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.beautiful), String.valueOf(R.string.cafe_carolina),
                String.valueOf(R.string.year_cafe_carolina_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.need_another_you), String.valueOf(R.string.cafe_carolina),
                String.valueOf(R.string.year_cafe_carolina_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.time_for_love), String.valueOf(R.string.cafe_carolina),
                String.valueOf(R.string.year_cafe_carolina_released)));
        songs.add(new Song(String.valueOf(R.string.don_williams),
                String.valueOf(R.string.faithful), String.valueOf(R.string.cafe_carolina),
                String.valueOf(R.string.year_cafe_carolina_released)));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.songs_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent viewSongDetailsIntent =
                        new Intent(ListSongsActivity.this, SongDetailsActivity.class);
                viewSongDetailsIntent.putExtra(String.valueOf(R.string.name_of_artist),
                        songs.get(position).getNameOfArtist());
                viewSongDetailsIntent.putExtra(String.valueOf(R.string.name_of_album),
                        songs.get(position).getNameOfAlbum());
                viewSongDetailsIntent.putExtra(String.valueOf(R.string.year_of_release),
                        songs.get(position).getYearOfRelease());
                viewSongDetailsIntent.putExtra(String.valueOf(R.string.name_of_song),
                        songs.get(position).getNameOfSong());
                startActivity(viewSongDetailsIntent);
            }
        });

    }
}