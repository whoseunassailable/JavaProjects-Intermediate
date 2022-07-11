package com.project.intermediate.MusicPlayer;


import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    // Name of the Album
    private String name;

    // Artist of the Song
    private String artist;

    // ArrayList of the Songs
    private ArrayList<Songs> songs;

    // Constructor
    public Album(String name, String artist, ArrayList<Songs> songs) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Songs>();
    }

    // Empty constructor
    public Album(){

    }



    public Songs findSongs(String title) {
        for(Songs checkSong : songs) {
            if (checkSong.getTitle().equals(title)) {
                return checkSong;
            }
        }
        return null;
    }

    // Add song to our album
    public boolean addSongs(String title, double duration) {
        // Check if songs exists or not
        if (findSongs(title) == null) {
            songs.add(new Songs(title, duration));
            System.out.println("Song " + title + " is added to the list.");
            return true;
        } else {
            System.out.println("Song with this name " + title + " already exist.");
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Songs> playlist) {
        int index = trackNumber - 1;
        if (index > 0 && index <= this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track with trackNumber " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Songs> PlayList) {
        for (Songs checkedSong : PlayList) {
            if (checkedSong.getTitle() == title) {
                PlayList.add(checkedSong);
                return true;
            }
        }
        System.out.println(title + "there is no such song in album");
        return false;
    }

}
