package com.project.intermediate;


import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Songs> songs;

    public Album(String name, String artist, ArrayList<Songs> songs) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Songs>();
    }

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

    public boolean addSongs(String title, double duration) {
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
