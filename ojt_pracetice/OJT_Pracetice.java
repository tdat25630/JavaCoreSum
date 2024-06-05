/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojt_pracetice;

import java.util.ArrayList;
import java.util.List;
import ojt_pracetice.Entity.*;
import controller.Manage;
import controller.Validation;
/**
 *
 * @author admin
 */
public class OJT_Pracetice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manage m = new Manage();
        
        m.generateVale();
   
        Validation validation = new Validation();
        while (true){
            System.out.println("1: addItem");
            System.out.println("2: removeItem");
            System.out.println("3: updateItem");
            System.out.println("4: searchItem");
            System.out.println("5: borrowItem");
            System.out.println("6: returnItem");
            System.out.println("7: Exit");
            int choice = validation.checkinputInt("Input choice", 1, 7);
            switch (choice)
            {
                case 1: 
                    m.addItem();
                break;
                case 2: 
                    m.removeItem();
                    break;
                case 3:
                    m.updateItem();
                    break;
                case 4: 
                    m.searchItem();
                    break;
//                case 5:
//                    
                case 7: 
                return;
            }
        }
        
        
        
        
        
        
        
        
        
    }
    
}
