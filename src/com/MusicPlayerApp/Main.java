package com.MusicPlayerApp;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();


        Album album = new Album("Album1", "AC/DC");

        album.addSong("TNT", 4.5);
        album.addSong("Highway to hell", 3.5);
        album.addSong("ThunderStruck", 5.0);

        albums.add(album);

        album = new Album("Album2", "Eminem");
        album.addSong("Rap god", 4.5);
        album.addSong("Not Afraid", 3.5);
        album.addSong("Lose yourself", 4.5);

        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addToPlayList("TNT", playList_1);
        albums.get(0).addToPlayList("Highway to hell", playList_1);
        albums.get(1).addToPlayList("Rap god", playList_1);
        albums.get(1).addToPlayList("Lose yourself", playList_1);

        play(playList_1);

    }

    private static void play(LinkedList<Song> playList){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0){
            System.out.println("This playlist has no song");
        }
        else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!(quit)){
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){

                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("no song available, reached the end of the list");
                        forward = false;
                    }
                    break;

                case 2:
                    if (true);
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list of all songs \n" +
                "5 - print all available options\n" +
                "6 - delete current song");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("_________________");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("_________________");
    }
}
