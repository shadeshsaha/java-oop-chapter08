/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2_problem9;

/**
 *
 * @author Shadesh
 */
public class Level2_Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraction f = new Fraction(10, 0);
    }
    
}

    class Fraction {
        private int numerator;
        private int denominator;
        
            public Fraction(int num, int denom) {
                setNumerator(num);
                setDenominator(denom);
            }
            
            public int getDenominator() {
                return denominator;
            }
            
            public int getNumerator() {
                return numerator;
            }
            
            public void setDenominator(int denom) {
                assert denom == 0;
                
                try{
                    if (denom == 0) {
                        System.err.println("Fatal Error");
                        System.exit(1);
                    }
                }
                catch(Exception e){
                    System.out.println("Error occured");
                }
                
                denominator = denom;
            }
            
            public void setNumerator(int num) {
                numerator = num;
            }
            
            public String toString() {
                return getNumerator() + "/" + getDenominator();
            }
    }

