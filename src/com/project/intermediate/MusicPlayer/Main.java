package com.project.intermediate.MusicPlayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        // Creating an album object
        Album album = new Album("This is Us", "1-D");

        // Adding few songs to the album This is Us
        album.addSongs("Olivia", 4.5);
        album.addSongs("Story of my life", 3.9);
        album.addSongs("Stockolm Syndrome", 4.5);
        album.addSongs("Perfect", 3.7);

        // Adding created album This is Us to our arraylist
        albums.add(album);

        album = new Album("Kamikaze", "Eminem");

        // Adding few songs to the album Kamikaze
        album.addSongs("The Ringer", 5.38);
        album.addSongs("Greatest", 3.47);
        album.addSongs("Lucky You", 4.05);
        album.addSongs("Paul", 0.35);
        album.addSongs("Normal", 3.52);

        LinkedList<Songs> playlist = new LinkedList<>();

        playlist.add(albums.get(0));
        albums.get(0).addToPlayList("Olivia", playlist);
        albums.get(0).addToPlayList("Story of my life", playlist);
        albums.get(1).addToPlayList("Lucky You", playlist);
        albums.get(1).addToPlayList("Normal", playlist);

        play(playlist);
    }

    private static void play(LinkedList<Songs> playlist) throws IOException {
        // Import BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean quit = false;
        boolean forward = true;
        ListIterator<Songs> listIterator = playlist.listIterator();

        if (playlist.size() == 0) {
            System.out.println("This playlist has no song.");
        } else {
            System.out.println("Now playing : " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = Integer.parseInt(reader.readLine());
            reader.readLine();

            switch (action) {

                case 0:
                    System.out.println("Playlist Complete");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("No song available since we already reached to the end of the list.");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the first song");
                        forward = false;
                    }
                    break;

                case 3:
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing : " + listIterator.previous().toString());
                        forward = false;
                    } else {
                        System.out.println();
                    }
                    break;

                case 4:

                    break;

                case 5:
                    System.out.println();
                    break;

                case 6:
                    System.out.println();
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available options\n press");
        System.out.println("0 - to quit \n " +
                "1 - to play next song \n " +
                "2 - to play previous song \n " +
                "3 - to replay the current song \n " +
                "4 - list of all songs \n " +
                "5 - print all available options \n" +
                "6 - delete current song ");
    }

    private static void printList(LinkedList<Songs> playlist) {
        Iterator<Songs> iterator = playlist.iterator();
        System.out.println("____________________________");

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("_____________________________");
    }

}
