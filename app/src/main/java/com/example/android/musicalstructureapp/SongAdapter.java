package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View songItemView = convertView;
        ViewHolder holder;
        if (songItemView == null) {
            songItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
            holder = new ViewHolder();
            holder.songNameTextView = songItemView.findViewById(R.id.name_of_song);
            holder.artistNameTextView = songItemView.findViewById(R.id.name_of_artist);
            songItemView.setTag(holder);
        }else{
            holder = (ViewHolder) songItemView.getTag();
        }

        Song currentSong = getItem(position);

        holder.songNameTextView.setText(currentSong.getNameOfSong());
        holder.artistNameTextView.setText(currentSong.getNameOfArtist());
        return songItemView;


    }
    static class ViewHolder {
        private TextView songNameTextView;
        private TextView artistNameTextView;
    }
}


