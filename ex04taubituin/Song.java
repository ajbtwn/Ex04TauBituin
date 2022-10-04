/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04taubituin;

/**
 *
 * @author LENOVO
 */
public class Song {
    String title, artist, album, status;
    
    public Song(String title, String artist, String album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        status = "Paused";
    }
    
    public void play() {
        status = "Playing";
    }
    public void pause() {
        status = "Paused";
    }
    public String status() {
        return status;
    }
    
}
