package com.company;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Song> playlist = new LinkedList<Song>();

    public static void main(String[] args) {
	    Album album1 = new Album("Trance", "Tiesto");
	    album1.addSong(new Song("Faling", "3:50"));
	    album1.addSong(new Song("Mein Hertz Brent", "5:10"));
        album1.printAllSongs();

        Album album2 = new Album("House",  "Armin van Buren");
        album2.addSong(new Song("I Feel It(Original Mix)", "4:15"));
        album2.addSong(new Song("I Need You", "3:47"));
        album2.printAllSongs();

        Song song1 = album1.getSong("Faling");
        Song song2 = album1.getSong("Mein Hertz Brent");

        Song song3 = album2.getSong("I Feel It(Original Mix)");
        Song song4 = album2.getSong("I Need You");


        System.out.println("____________________________________");

        addSongInPlaylist(playlist,song1);
        addSongInPlaylist(playlist,song2);
        addSongInPlaylist(playlist,song3);
        addSongInPlaylist(playlist,song4);
        addSongInPlaylist(playlist, new Song("Ich Tu Dir Weh", "5:01"));

        play(playlist);
    }

    // Print All Song from the Playlist
    private static void printPlaylist(LinkedList<Song> linkedList) {
        Iterator<Song> i=  linkedList.iterator();
        int count = 1;

        System.out.println("All songs form the current playlist");
        while(i.hasNext()) {
            Song song = i.next();
            System.out.println(count++ + ". #" + song.getTitle() + "# duration " + song.getDuration());
        }
        System.out.println("Total: " + (count-1) + " songs.");
        System.out.println("======================================");
    }

    // Add Song in Playlist
	private static boolean addSongInPlaylist(LinkedList<Song> linkedList, Song newSong) {
        ListIterator<Song> songListIterator = linkedList.listIterator();

        while(songListIterator.hasNext()) {
            int comparasion = songListIterator.next().getTitle().compareTo(newSong.getTitle());
            if(comparasion == 0) {
                // equal, do not add
                System.out.println(newSong.getTitle() + " is already included int the current playlist");
                return false;
            }
        }

        songListIterator.add(newSong);
        return true;
	}

	// Replay Song
    private static void replaySong(int index) {
        System.out.println("Replay song: " + playlist.get(index).getTitle());
    }

    // Remove Song
    private static void removeSong(LinkedList<Song> linkedList) {
        System.out.println("Enter title of song, which do you want to remove: ");
        String songTitle = scanner.nextLine();

        ListIterator<Song> songListIterator =  linkedList.listIterator();

        while(songListIterator.hasNext()) {
            int comparasion = songListIterator.next().getTitle().compareTo(songTitle);
            if(comparasion == 0){
                songListIterator.remove();
                System.out.println("Song " + songTitle + " was successfuly removed from the playlist.");
                if(songListIterator.hasNext()) {
                    System.out.println("Play next sound: " + songListIterator.next().getTitle());
                } else if(songListIterator.hasPrevious()) {
                    System.out.println("Play previous sound: " + songListIterator.previous().getTitle());
                }
                return;
            }
        }

        System.out.println("There is not a song with title " + songTitle + ". Try again...");
    }

    // Play
	private static void play(LinkedList songs) {
        System.out.println("Player is starting...");
        boolean quit = false;
        boolean goingForward = true;
        int indexOfCurrentSong = 0;
        ListIterator<Song> listIterator = songs.listIterator();

        if(songs.isEmpty()) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now is playing: " + listIterator.next().getTitle());
            printMenu();
        }

        while (!quit) {
            int action = inputValidator();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shutdown the player...");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                            indexOfCurrentSong = listIterator.nextIndex() -1;
                            System.out.println(indexOfCurrentSong);
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now is playing " + listIterator.next().getTitle());
                        indexOfCurrentSong = listIterator.nextIndex() -1;
                        System.out.println(indexOfCurrentSong);
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            indexOfCurrentSong = listIterator.previousIndex() +1;
                            System.out.println(indexOfCurrentSong);
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now is playing " + listIterator.previous().getTitle());
                        indexOfCurrentSong = listIterator.previousIndex() +1;
                        System.out.println(indexOfCurrentSong);
                    } else {
                        System.out.println("The playilist is now at the start of list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    replaySong(indexOfCurrentSong);
                    break;

                case 4:
                    printPlaylist(playlist);
                    break;

                case 5:
                    removeSong(playlist);
                    break;

                case 6:
                    printMenu();
                    break;
            }
        }
    }

    // Print Menu
    private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - To Quit\n" +
						   "1 - Go to the next song\n" +
						   "2 - Go to previous song\n" +
						   "3 - Replay the current song\n" +
						   "4 - List the songs in the playlist\n" +
                           "5 - Remove the current song from the playlist\n" +
						   "6 - Show all options");
	}

	// Input Integer Validation
	private static int inputValidator() {
        boolean hasAnInt = scanner.hasNextInt();

        while (!hasAnInt) {
            System.out.println("Invalid number");
            scanner.nextLine();
            hasAnInt = scanner.hasNextInt();
        }

        int number = scanner.nextInt();

        return number;
    }
}