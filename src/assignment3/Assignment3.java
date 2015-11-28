/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Home pc
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = "Daniel";
      
        String reveName = " ";
        
        char letter;
        int size = name.length();
       
        for (int j = 0; j < size; j++) {
           letter = name.charAt(j);
           
        }
        reveName = new StringBuilder(name).reverse().toString();
        System.out.println(reveName);
           
       
    }
    
}
