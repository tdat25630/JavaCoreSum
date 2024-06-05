/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;


public class Validation {
    private Scanner sc = new Scanner(System.in);
    public int checkinputInt(String mess, int min, int max)
    {
        System.out.println(mess);
        while (true) {
        String p= sc.nextLine();
            try {
                int rc=Integer.parseInt(p);
                if (rc<min||rc>max)
                {
                    System.out.println("Please input between["+min+","+max+"]");
                    continue;
                }
                return rc;
            } catch (NumberFormatException e) {
                System.out.println("Please enter digit.");
            }
            
        }
    }
    public String checkInputString(String mess,String regex)
    {
        System.out.print(mess);

        while(true) {
            String input = sc.nextLine();
            if (!input.matches(regex)) {
                System.out.print("Please input match regex : ");
                continue;
            }
            return input;
        }
    }
    public boolean checkInputYN(String mess) {
        System.out.println(mess);
        while (true) {
             String rc = sc.nextLine();
         
            if (rc.equalsIgnoreCase("Y")) {
                return true;
            }
           
            if (rc.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("re-input ");
        }
    }
     public boolean checkInputUD(String mess) {
        System.out.println(mess);
        while (true) {
           String rc = sc.nextLine();
            if (rc.equalsIgnoreCase("U")) {
                return true;
            }
            if (rc.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input u/U or d/D.");
            System.out.print("re-input ");
        }
    }

}
