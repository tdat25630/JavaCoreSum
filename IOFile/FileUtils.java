/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ojt_pracetice.Entity.Book;
import ojt_pracetice.Entity.CD;
import ojt_pracetice.Entity.Item;

/**
 *
 * @author admin
 */
public class FileUtils {
    public static <T> void writeFile(List<T> list,String pathFile){
        try {
            FileWriter fileWriter = new FileWriter(pathFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             for (T element : list) {
            fileWriter.write(element.toString());
            fileWriter.write(System.lineSeparator()); // Add a newline after each element
            
            
           
            }
            bufferedWriter.close();
        } catch (Exception e) {
            
        }
        
    }
    
    
    
//    public static <T extends Serializable> T readFile(Class<T> type,String pathFile)
//    throws IOException,ClassNotFoundException{
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
//            Object obj = ois.readObject();
//            ois.close();
//            if(obj instanceof Book){
//                
//            }
//            
//    }
    public static List<Book> readFileBook(List<Book> list,String pathFile){
        
        try {
            FileReader fr = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
            line = br.readLine();
            if(line == null){
                break;
            }
                String txt[]= line.split("\t");
                
                String A = txt[0];
                String id = txt[1];
                String title = txt[2];
                String publisher = txt[3];
                int year = Integer.parseInt(txt[4]) ;
                boolean status = Boolean.parseBoolean(txt[5]) ;
                list.add(new Book(A, id, title, publisher, year, status));
                
            }
        } catch (Exception e) {
        }
        return null;
    }
    public static List<Item> readFile(List<Item> list,String pathFile){
        
        try {
            FileReader fr = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
            line = br.readLine();
            if(line == null){
                break;
            }
                String txt[]= line.split("\t");
                
                String A = txt[0];
                String id = txt[1];
                String title = txt[2];
                String publisher = txt[3];
                int year = Integer.parseInt(txt[4]) ;
                boolean status = Boolean.parseBoolean(txt[5]) ;
                list.add(new CD(A, id, title, publisher, year, status));
                
            }
        } catch (Exception e) {
        }
        return list;
    }
}
