package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button listSongsButton = findViewById(R.id.view_songs);
        listSongsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent viewSongsListIntent =
                        new Intent(MainActivity.this, ListSongsActivity.class);
                startActivity(viewSongsListIntent);
            }
        });
    }
}
