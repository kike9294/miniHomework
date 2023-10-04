/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihomework;

import ioutils.IOUtils;

/**
 *
 * @author enriq
 */
public class MiniHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IOUtils userInput = new IOUtils();
        
        String name;
        int age;
        int nPets;
        
        System.out.println("Welcome to NetBeans!");
        
        name = userInput.getUserText("What is your name?");
        age = userInput.getUserInt("How old are you?", 0);
        nPets = userInput.getUserInt("How many pets do you have?");
        
        System.out.println("Your name is: " + name);
        System.out.println("You are " + age + " years old.");
        
        
    }
    
}
