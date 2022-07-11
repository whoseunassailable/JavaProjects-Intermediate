package com.project.intermediate.MusicPlayer;

public class Main {
    public static void main(String[] args) {

        // Creating an album object
        Album album = new Album("This is Us", "1-D", "");

        // Adding few songs to the album This is Us
        album.addSongs("Olivia", 4.5);
        album.addSongs("Story of my life", 3.9 );
        album.addSongs("Stockolm Syndrome", 4.5);
        album.addSongs("Perfect", 3.7);

        // Adding created album This is Us to our arraylist

        album = new Album("Kamikaze", "Eminem");

        // Adding few songs to the album Kamikaze
        album.addSongs("The Ringer", 5.38);
        album.addSongs("Greatest", 3.47);
        album.addSongs("Lucky You", 4.05);
        album.addSongs("Paul", 0.35);
        album.addSongs("Normal", 3.52);
}
