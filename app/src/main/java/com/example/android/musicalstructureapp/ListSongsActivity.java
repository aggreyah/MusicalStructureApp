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
        /** adding country boy album songs to the ArrayList songs*/
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.country_boy_song), getString(R.string.country_boy),
                getString(R.string.year_country_boy_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.lousiana), getString(R.string.country_boy),
                getString(R.string.year_country_boy_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.overlooking), getString(R.string.country_boy),
                getString(R.string.year_country_boy_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.sneaking), getString(R.string.country_boy),
                getString(R.string.year_country_boy_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.look_around), getString(R.string.country_boy),
                getString(R.string.year_country_boy_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.winner_in_you), getString(R.string.country_boy),
                getString(R.string.year_country_boy_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.rake_and_rumb), getString(R.string.country_boy),
                getString(R.string.year_country_boy_released)));
        songs.add(new Song(getString(R.string.don_williams), getString(R.string.too_many),
                getString(R.string.country_boy),
                getString(R.string.year_country_boy_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.gotta_be_magic), getString(R.string.country_boy),
                getString(R.string.year_country_boy_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.falling), getString(R.string.country_boy),
                getString(R.string.year_country_boy_released)));

        /** adding cafe carolina album songs to the ArrayList songs*/
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.the_only_game), getString(R.string.cafe_carolina),
                getString(R.string.year_cafe_carolina_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.walking_a_broke_heart),
                getString(R.string.cafe_carolina),
                getString(R.string.year_cafe_carolina_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.margie), getString(R.string.cafe_carolina),
                getString(R.string.year_cafe_carolina_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.thing_about_love), getString(R.string.cafe_carolina),
                getString(R.string.year_cafe_carolina_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.leaving), getString(R.string.cafe_carolina),
                getString(R.string.year_cafe_carolina_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.beautiful), getString(R.string.cafe_carolina),
                getString(R.string.year_cafe_carolina_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.need_another_you), getString(R.string.cafe_carolina),
                getString(R.string.year_cafe_carolina_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.time_for_love), getString(R.string.cafe_carolina),
                getString(R.string.year_cafe_carolina_released)));
        songs.add(new Song(getString(R.string.don_williams),
                getString(R.string.faithful), getString(R.string.cafe_carolina),
                getString(R.string.year_cafe_carolina_released)));

        /** adding love or something like it album songs to the ArrayList songs*/
        songs.add(new Song(getString(R.string.kenny_rodgers),
                getString(R.string.love_or_something_like_it_song), getString(R.string.love_or_something_like_it),
                getString(R.string.year_love_or_something_released)));
        songs.add(new Song(getString(R.string.kenny_rodgers),
                getString(R.string.lot_of_that), getString(R.string.love_or_something_like_it),
                getString(R.string.year_love_or_something_released)));
        songs.add(new Song(getString(R.string.kenny_rodgers),
                getString(R.string.buried_treasures), getString(R.string.love_or_something_like_it),
                getString(R.string.year_love_or_something_released)));
        songs.add(new Song(getString(R.string.kenny_rodgers),
                getString(R.string.something_about), getString(R.string.love_or_something_like_it),
                getString(R.string.year_love_or_something_released)));
        songs.add(new Song(getString(R.string.kenny_rodgers),
                getString(R.string.momma), getString(R.string.love_or_something_like_it),
                getString(R.string.year_love_or_something_released)));
        songs.add(new Song(getString(R.string.kenny_rodgers),
                getString(R.string.closest_of_friends), getString(R.string.love_or_something_like_it),
                getString(R.string.year_love_or_something_released)));
        songs.add(new Song(getString(R.string.kenny_rodgers),
                getString(R.string.could_be_so_good), getString(R.string.love_or_something_like_it),
                getString(R.string.year_love_or_something_released)));
        songs.add(new Song(getString(R.string.kenny_rodgers),
                getString(R.string.sail_away), getString(R.string.love_or_something_like_it),
                getString(R.string.year_love_or_something_released)));
        songs.add(new Song(getString(R.string.kenny_rodgers),
                getString(R.string.even_a_fool), getString(R.string.love_or_something_like_it),
                getString(R.string.year_love_or_something_released)));
        songs.add(new Song(getString(R.string.kenny_rodgers),
                getString(R.string.highway), getString(R.string.love_or_something_like_it),
                getString(R.string.year_love_or_something_released)));
        songs.add(new Song(getString(R.string.kenny_rodgers),
                getString(R.string.starting), getString(R.string.love_or_something_like_it),
                getString(R.string.year_love_or_something_released)));

        /**Create a new song adapter object and pass songs - this is an extension of ArrayAdapter*/
        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.songs_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent viewSongDetailsIntent =
                        new Intent(ListSongsActivity.this, SongDetailsActivity.class);
                viewSongDetailsIntent.putExtra(getString(R.string.name_of_artist),
                        songs.get(position).getNameOfArtist());
                viewSongDetailsIntent.putExtra(getString(R.string.name_of_album),
                        songs.get(position).getNameOfAlbum());
                viewSongDetailsIntent.putExtra(getString(R.string.year_of_release),
                        songs.get(position).getYearOfRelease());
                viewSongDetailsIntent.putExtra(getString(R.string.name_of_song),
                        songs.get(position).getNameOfSong());
                startActivity(viewSongDetailsIntent);
            }
        });
    }
}