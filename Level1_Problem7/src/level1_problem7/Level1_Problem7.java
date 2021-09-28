/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1_problem7;

/**
 *
 * @author Shadesh
 */

import java.util.Scanner;		

public class Level1_Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EmptyInputException {
        
        Scanner sc = new Scanner(System.in); System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        try {
            if(name.startsWith(" ") || name.equals("")) {
                throw new EmptyInputException("Name cannot start with a space or it can't be blank :(");
            }
            else {
                System.out.println("Perfect !!!");
            }
        }
        catch (EmptyInputException e) {
            System.out.println(e.getMessage().toString());
        }

    }
    
}
