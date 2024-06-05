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
public class Book extends Item{
    
    public String author;
    
    public Book() {
    }

    public Book(String author, String id, String title, String publisher, int year, boolean status) {
        super(id, title, publisher, year, status);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public boolean isStatus() {
//        return status;
//    }
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }

    @Override
    public String toString() {
        return author +"\t"
                +id+"\t"
                + title+"\t"
                + publisher+"\t"
                +year+"\t"
                + status;
    }
    
    
    
    
}
