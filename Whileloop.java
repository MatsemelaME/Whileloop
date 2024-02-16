/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.whileloop;

/**
 *
 * @author Lenovo-User
 */
public class Whileloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application
        int row = 1;
        
        while (row <= 4) {
            int col = 1;
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
    }
        
    }
}
        
    

