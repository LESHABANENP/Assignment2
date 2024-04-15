 import java.util.Scanner;


public class CompoundInterestCalculator1 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        double A;
        double P;
        double I;
        double N;
       
        
        System.out.println("Enter principle amount: ");
        
        P = input.nextDouble();
        
        System.out.println("Enter interest rate: ");
        
        I = input.nextDouble();
        I = I/100;
        System.out.println("Enter period in months: ");
        
        N = input.nextDouble();
        
        A = P * Math.pow( 1 + I, N);
        
        System.out.println("Compound interest is: " + A );
    }
}