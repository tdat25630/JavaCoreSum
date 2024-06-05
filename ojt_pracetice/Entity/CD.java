/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojt_pracetice.Entity;

/**
 *
 * @author admin
 */
public class CD extends Item{
    public String artist;

    public CD() {
    }

    public CD(String artist, String id, String title, String publisher, int year, boolean status) {
        super(id, title, publisher, year, status);
        this.artist = artist;
    }

    @Override
    public String toString() {
        return   artist +"\t"
                +id +"\t"
                + title +"\t"
                + publisher +"\t"
                + year +"\t"
                + status;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    
}
