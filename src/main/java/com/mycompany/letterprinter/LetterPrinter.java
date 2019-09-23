/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.letterprinter;

/**
 *
 * @author mario
 */

import java.util.Scanner;

class Letter {
    
    private String from;
    private String to;
    private String body = "";
              

    public Letter(String from, String to) {  //constructor calling for just the from and to;
        this.from = from;
        this.to = to;


    }

    public void addLine(String line) //This method adds a new line plus the string that is sent in
    {
        body += line + "\n";
    }

    public String getText() //This method prints our information in a pre-defined format
    {
        return  "Dear " + to + ":\n"
                + "\n" + body
                + "\n"
                + "Sincerly,\n"
                + "\n" + from;
    }



}
public class LetterPrinter{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Letter l = new Letter("Mary", "John"); //Creating an object of our Letter class.
        l.addLine("I am sorry we must part."); //Calling the method within class to add line
        l.addLine("I wish you all the best.");
        System.out.println(l.getText()); //Printing all the information we have so far.
     }
    }


