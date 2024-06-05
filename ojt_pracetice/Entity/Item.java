/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojt_pracetice.Entity;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Item implements Serializable{
    public String id;
    public String title;
    public String publisher;
    public int year;
    public boolean status;

    public Item() {
    }

    public Item(String id, String title, String publisher, int year, boolean status) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", title=" + title + ", publisher=" + publisher + ", year=" + year + ", status=" + status + '}';
    }

    
    
}
