/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numberssum;
import java.util.Scanner;
/**
 *
 * @author brcas1396
 */
public class NumbersSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberEntered;
        int numberBelow = 1;
       
        System.out.println("Please enter a number:");
        
        Scanner input = new Scanner(System.in);
        numberEntered = input.nextInt();
              
        do {
        System.out.println(numberBelow);
        numberBelow += 1;
        } while (numberBelow <= numberEntered);
               
        
    }
    
}
