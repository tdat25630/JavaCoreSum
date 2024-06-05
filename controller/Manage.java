/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import IOFile.FileUtils;
import java.util.ArrayList;

//import static java.util.Collections.list;
import java.util.List;

import ojt_pracetice.Entity.*;



/**
 *
 * @author admin
 */
public class Manage {
    public static final String FILE_NAME = "src/Text/test.txt";
    public static final String COMMA = ",";
    
    List<Item> list1 = new ArrayList<>();
    List<Book> list2 = new ArrayList<>();
    List<CD>   list3 = new ArrayList<>();
    Validation val = new Validation();
    public static <T> void printList(List<T> list){
        for (T o : list) {
            System.out.println(o);
        }
    }
//    public boolean checkFullInfoExist(String id, String title,
//            String publisher,int year,boolean status ){
//        for (Item o : list1) {
//            if(o.getId().equalsIgnoreCase(id)&&o.get)
//            
//        }
//        return false;
//    }
    
    public Book findBookByID(String id){
        for (Item o : list1) {
            if (o.getId().equalsIgnoreCase(id)){
                return (Book)o;
            }
        }
        return null;
    }
    public CD findCDByID(String id){
        for (Item o : list1) {
            if (o.getId().equalsIgnoreCase(id)){
                return (CD)o;
            }
        }
        return null;
    }
    
    
    public boolean checkIfExist(String id){
        for (Item o : list1) {
            if(o.getId().equalsIgnoreCase(id)){
                return true;
            }
            
        }
        return false;
    }
    public void addItem(){
        while(true){
            String id = val.checkInputString("Nhập id: ", "[A-Za-z0-9]+");
            if(checkIfExist(id)){
                System.out.println("Id này đã tồn tại");
                return;
            }
            String title;
            title = val.checkInputString("Nhập Title: ","[A-Za-z0-9]+" );
            String publisher;
            publisher = val.checkInputString("Nhập Publisher: ","[A-Za-z0-9]+" );
            int year;
            year = val.checkinputInt("Nhập năm sản xuất: ", 1000 , 9999);
            boolean status = true;
            while(true){
                System.out.println("Bạn add new book hay là cd: ");
                System.out.println("1: Book");
                System.out.println("2: CD");
                int choice = val.checkinputInt("Your input: ", 1, 2);
                switch (choice){
                    case 1: 
                        String author;
                        author = val.checkInputString("Nhập author: ","[A-Za-z0-9]+" );
                        list1.add(new Book(author, id, title, publisher, year, status));
                        break;
                    case 2:
                        String artist;
                        artist = val.checkInputString("Nhập Artist: ","[A-Za-z0-9]+" );
                        list1.add(new CD(artist, id, title, publisher, year, status));
                        break;
                }
                break;
            }
            System.out.println("Success!!!\n");
            break;
            
        }
    }
    public void removeItem(){
        while(true){
            printList(list1);
            String id = val.checkInputString("Nhập id: ","[A-Za-z0-9]+"  );
            for (Item o : list1) {
                
                if(id.equalsIgnoreCase(o.getId())){
                    list1.remove(o);
                    break;
                }
                
            }
            if(val.checkInputYN("Ban co muon tiep tuc remove?(Y/N): ")){
                continue;
            }else{
                break;
            }
        }
    }
    public void updateItem(){
        printList(list1);
        String id = val.checkInputString("Nhập id: ","[A-Za-z0-9]+"  );
        if(!(checkIfExist(id))){
            System.out.println("Not Found!!");
        }else{
            while(true){
                String A  = val.checkInputString("Enter Author or artist", "[A-Za-z]+");
                String title = val.checkInputString("Input title","[A-Za-z]+" );
                String publisher = val.checkInputString("Input publisher","[A-Za-z]+" );
                int year = val.checkinputInt("Input Year", 1000, 9999);
                boolean status = val.checkInputYN("Is this item available?");
                while(true){
                System.out.println("Bạn update book hay là cd: ");
                System.out.println("1: Book");
                System.out.println("2: CD");
                int choice = val.checkinputInt("Your input: ", 1, 2);
                switch (choice){
                    case 1: 
                        Book b = findBookByID(id);
                        
//                        String author ;
//                        author = val.checkInputString("Nhập author: ","[A-Za-z0-9]+" );
                        b.setAuthor(A);
                        b.setTitle(title);
                        b.setPublisher(publisher);
                        b.setYear(year);
                        b.setStatus(status);
                        return;
                    case 2:
                        CD c = findCDByID(id);
                        
//                        String author ;
//                        author = val.checkInputString("Nhập author: ","[A-Za-z0-9]+" );
                        c.setArtist(A);
                        c.setTitle(title);
                        c.setPublisher(publisher);
                        c.setYear(year);
                        c.setStatus(status);
                        return;
                }
                break;
            }
                
            }
        }
        
    }
    
    public void searchItem(){
        printList(list1);
        while (true) {
            
                String title = val.checkInputString("Nhập title bạn muốn tìm","[A-Za-z]+" );
                boolean check = true;
                for (Item o : list1) {
                    if(o.getTitle().contains(title)){
                        o.toString();
                        check = false;
                    }
                    
                }
                if(check == true){
                    System.out.println("Not Found!!");
                }
                
            
            
        }
        
        
    }
    public void borrowItem(){
        while(true){
            printList(list1);
            String id = val.checkInputString("Nhập id: ","[A-Za-z0-9]+"  );
            for (Item o : list1) {
                
                if(id.equalsIgnoreCase(o.getId())){
                    o.setStatus(false);
                    System.out.println("Thank you!!");
                    break;
                }
                
            }
            if(val.checkInputYN("Ban co muon tiep tuc Borrow?(Y/N): ")){
                continue;
            }else{
                break;
            }
        }
        
    }
    public void returnItem(){
        while(true){
            printList(list1);
            String id = val.checkInputString("Nhập id: ","[A-Za-z0-9]+"  );
            for (Item o : list1) {
                
                if(id.equalsIgnoreCase(o.getId())){
                    o.setStatus(false);
                    System.out.println("See You Again!!");
                    break;
                }
                
            }
            if(val.checkInputYN("Ban co muon tiep tuc Return?(Y/N): ")){
                continue;
            }else{
                break;
            }
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    public void generateVale(){
        
//        list1.add(new CD("Jack", "cd1", "test1", "KICM", 2020, true));
//        list1.add(new Book("Athor", "book1", "test2", "Kim Dong", 2019, true));
//        list1.add(new CD("Eminem", "cd2", "test", "MTP", 2020, true));
//        list1.add(new Book("John", "book2", "test2", "Wick", 2019, true));
//        list1.add(new CD("Yasuo", "cd3", "test1", "Riot", 2020, true));
//        list1.add(new Book("Athor", "book3", "test2", "Kim Dong", 2019, true));
//        list1.add(new CD("Yone", "cd4", "test1", "Steam", 2020, true));
//        list1.add(new Book("Athor", "book4", "test2", "Kim Dong", 2019, true));
//        list1.add(new CD("Arhi", "cd5", "test1", "Epic", 2020, true));
//        list1.add(new Book("Athor", "book5", "test2", "Kim Dong", 2019, true));
        
//      String line = null;
//        for(Item o: list1){
//            line = o.getId() + COMMA + o.getTitle() + COMMA + o.getPublisher()
//                    + COMMA + o.getYear()+ COMMA + o.isStatus();
//           
//        }
FileUtils.readFile(list1, FILE_NAME);
FileUtils.writeFile(list1, FILE_NAME);

//          
//        
//        //Readfile
//        List<Item> listline =  FileUtils.readFile(Book.class, FILE_NAME);
//        System.out.println(listline);
//        String[] lineSplit = listline.get(0).split(COMMA);
//        
        
    }
    
//    public void filter(){
//        for (Item o : list1) {
//            if(o instanceof Book){
//                Book b1 = (Book)o;
//                list2.add(b1);
//            }
//            if(o instanceof CD){
//                CD b1 = (CD)o;
//                list3.add(b1);
//            }
//            
//        }
//        for (Book o : list2) {
//            System.out.println(o);
//        }
//    }    
}
