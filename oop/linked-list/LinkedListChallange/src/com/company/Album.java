package com.company;

import java.util.ArrayList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    // Add new song
    public void addSong(Song song) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Song: Title #" + song.getTitle() + "# was added in the album #" + getAlbumName() + "#");
        System.out.println("-----------------------------------------------------------");
        songs.add(song);
    }

    // Print all songs
    public void printAllSongs() {
        System.out.println("=========================================");
        System.out.println("Currently are " + this.songs.size() + " songs in the album #"+ getAlbumName() +"#");
        for(int i=0; i< this.songs.size(); i++) {
            System.out.println((i+1) + ". Title: #" + getTitle(i) + "# Duration: " + getDuration(i));
        }
    }

    // Query song
    public void querySong(String songTitle) {
        int position = findSong(songTitle);
        if(position >= 0){
            System.out.println("Sound was found: \n" +
                    "Title: #" + songTitle + " -> Duration: #" + getDuration(position));
        } else
            System.out.println("Cannot find song with title: " + songTitle);
    }

    // Find element
    private int findSong(String searchSong ) {
        for(int i=0; i<songs.size(); i++ ) {
            if (songs.get(i).getTitle().equals(searchSong)) {
                return i;
            }
        }

        return -1;
    }

    // Return song
    public Song getSong(String searchName) {
        int position = findSong(searchName);
        return songs.get(position);
    }

    // Get song's title
    private String getTitle(int index) {
        return songs.get(index).getTitle();
    }

    // Get song's duration
    private String getDuration(int index) {
        return songs.get(index).getDuration();
    }

    // Get album name
    private String getAlbumName() {
        return name;
    }

    // Get album ArrayList
    public ArrayList<Song> getSongs() {
        return songs;
    }
}
