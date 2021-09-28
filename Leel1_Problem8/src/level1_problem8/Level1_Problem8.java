/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1_problem8;

/**
 *
 * @author Shadesh
 */
import java.util.Scanner;		

public class Level1_Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String name = "";
        String room = "";
        String password = "";
        
        try{
            while( !name.equals("Admin") && !room.equals("X123") && !password.equals("$maTrix%TwO$"))
            {
                System.out.print("Enter name: ");
                name = sc.next();
                
                System.out.print("Enter room: ");
                room = sc.next();
                
                System.out.print("Enter password: ");
                password = sc.next();
            }
        }
        catch (Exception e){
            System.out.println("Program terminated!");
        }				

    }
    
}
