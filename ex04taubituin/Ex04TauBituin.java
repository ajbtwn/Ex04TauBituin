/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04taubituin;

/**
 *
 * @author LENOVO
 */
public class Ex04TauBituin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Movie movie1 = new Movie("Up", "Pete Docter", 2009);
        Movie movie2 = new Movie("It", "Andres Muschietti", 2017);
        Movie movie3 = new Movie("Interstellar", "Christopher Nolan", 2014);
        System.out.println("MOVIES\n\n" + movie1.title + "\nDirected by: " + movie1.director + "\nYear: " + movie1.year + "\n");
        System.out.println(movie2.title + "\nDirected by: " + movie2.director + "\nYear: " + movie2.year + "\n");
        System.out.println(movie3.title + "\nDirected by: " + movie3.director + "\nYear: " + movie3.year + "\n\n");
        
        Song song1 = new Song("Older", "5 Seconds of Summer", "5SOS5");
        Song song2 = new Song("I Knew", "Lizzy McAlpine", "Give Me A Minute");
        System.out.println("SONGS\n\n" + song1.title + "\nArtist: " + song1.artist + "\nAlbum: " + song1.album + "\n");
        System.out.println(song2.title + "\nArtist: " + song2.artist + "\nAlbum: " + song2.album + "\n\n");
        
        Singer singer1 = new Singer(song1);
        System.out.println("SINGER\n" + singer1.name + "\nFavorite song: " + singer1.favoriteSong.title + " by " + singer1.favoriteSong.artist + "\nNumber of Performances: " + singer1.noOfPerformances);
        
        singer1.performForAudience(12);
        System.out.println("\n***PERFORMS FOR " + singer1.audience + " FOR ₱100 EACH***");
        song2.play();
        System.out.println(song2.title + " by " + song2.artist + ": " + song2.status());
        singer1.changeFavSong(song2);
        
        System.out.println("\nNew favorite song: " + singer1.favoriteSong.title + " by " + singer1.favoriteSong.artist + "\nEarnings: ₱" + singer1.earnings + "\nNumber of Performances: " + singer1.noOfPerformances);
        
        
        

    }
    
}
