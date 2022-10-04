/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04taubituin;

/**
 *
 * @author LENOVO
 */
public class Singer {
    String name;
    int noOfPerformances, audience;
    double earnings;
    Song favoriteSong;
    
    public Singer(Song favoriteSong) {
        name = "Mark Ambor";
        noOfPerformances = 4;
        earnings = 0;
        this.favoriteSong = favoriteSong;
    }
    
    public void changeFavSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    public void performForAudience(int audience) {
        noOfPerformances++;
        earnings = 100.00 * audience;
        this.audience = audience;
    }
}

    