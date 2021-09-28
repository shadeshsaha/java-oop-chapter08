/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1_problem6;

/**
 *
 * @author Shadesh
 */

import java.util.InputMismatchException;						
import java.util.Scanner;

public class Level1_Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        
        try {
            int age = sc.nextInt();
            if (age < 0) {
                throw new Exception("Illegal value: negative age is invalid.");
            }
            else {
                System.out.println("Eligible !!!");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage().toString());
        }
    }
}
