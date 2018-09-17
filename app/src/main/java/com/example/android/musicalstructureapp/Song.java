package com.example.android.musicalstructureapp;

public class Song {
    //class field storing the name of the song
    private String mNameOfSong;
    //class field storing the album of the song
    private String mAlbumOfSong;
    //class field storing the name of the artist who sang the song
    private String mNameOfArtist;
    //class field storing the name of the song
    private String mYearOfRelease;

    /**
     * @param artName for the name of the artist
     * @param songName for the name of the song
     * @param album the name of the album
     * @param year year of release of the song
    */
    public Song(String artName, String songName, String album, String year){
        mNameOfArtist = artName;
        mNameOfSong = songName;
        mAlbumOfSong = album;
        mYearOfRelease = year;
    }

    /**get name of artist*/
    public String getNameOfArtist(){
        return mNameOfArtist;
    }

    /**get name of song*/
    public String getNameOfSong(){
        return mNameOfSong;
    }

    /**get name of album*/
    public String getNameOfAlbum(){
        return mAlbumOfSong;
    }

    /**get year of release*/
    public String getYearOfRelease(){
        return mYearOfRelease;
    }
}
