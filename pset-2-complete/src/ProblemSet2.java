/**
 * Problem Set 2.
 * 
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;
import java.lang.Math;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
// import sun.swing.PrintColorUIResource;

public class ProblemSet2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         * 
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */
        
        // System.out.print("\nEnter your first name: ");
        // String firstName = in.nextLine();
        // System.out.print("Enter your last name: ");
        // String lastName = in.nextLine();
        // System.out.print("Enter your grade: ");
        // String grade = in.nextLine();
        // System.out.print("Enter your age: ");
        // String age = in.nextLine();
        // System.out.print("Enter your hometown: ");
        // String homeTown = in.nextLine();
        // System.out.printf("\nNAME     : %s %s", firstName, lastName);
        // System.out.printf("\nGRADE    : %s", grade);
        // System.out.printf("\nAGE      : %s", age);
        // System.out.printf("\nHOMETOWN : %s\n", homeTown);

        /*
         * Exercise 2.
         * 
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */
        
        final double DOLLAR_VALUE = 1.00;
        final double QUARTER_VALUE = 0.25;
        final double DIME_VALUE = 0.10;
        final double NICKEL_VALUE = 0.05;
        final double PENNY_VALUE = 0.01;

        System.out.print("\nEnter a dollar amount: ");
        double dollarAmount = in.nextDouble();

        int numDollar = (int) Math.floor(dollarAmount / DOLLAR_VALUE);
        System.out.println("\nDOLLARS  : " + numDollar);
        dollarAmount -= ((double) numDollar) * DOLLAR_VALUE;

        int numQuarter = (int) Math.floor(dollarAmount / QUARTER_VALUE);
        System.out.println("QUARTERS : " + numQuarter);
        dollarAmount -= ((double) numQuarter) * QUARTER_VALUE;

        int numDime = (int) Math.floor(dollarAmount / DIME_VALUE);
        System.out.println("DIMES    : " + numDime);
        dollarAmount -= ((double) numDime) * DIME_VALUE;

        int numNickel = (int) Math.floor(dollarAmount / NICKEL_VALUE);
        System.out.println("NICKELS  : " + numNickel);
        dollarAmount -= ((double) numNickel) * NICKEL_VALUE;

        int numPenny = (int) Math.floor(dollarAmount / PENNY_VALUE);
        System.out.println("PENNIES  : " + numPenny);
        

        /*
         * Exercise 3.
         * 
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

        final double TEN_DOLLAR_VALUE = 10.00;
        final double FIVE_DOLLAR_VALUE = 5.00;
        
        System.out.print("\nEnter a dollar amount: ");
        double dollarAmountTwo = in.nextDouble();

        int tempVar;
        tempVar = (int) Math.floor(dollarAmountTwo / TEN_DOLLAR_VALUE);
        int numBill = tempVar;
        dollarAmountTwo -= tempVar * TEN_DOLLAR_VALUE;
        tempVar = (int) Math.floor(dollarAmountTwo / FIVE_DOLLAR_VALUE);
        numBill += tempVar;
        dollarAmountTwo -= tempVar * FIVE_DOLLAR_VALUE;
        tempVar = (int) Math.floor(dollarAmountTwo / DOLLAR_VALUE);
        numBill += tempVar;
        dollarAmountTwo -= tempVar * DOLLAR_VALUE;

        tempVar = (int) Math.floor(dollarAmountTwo / QUARTER_VALUE);
        int numCoin = tempVar;
        dollarAmountTwo -= tempVar * QUARTER_VALUE;
        tempVar = (int) Math.floor(dollarAmountTwo / DIME_VALUE);
        numCoin += tempVar;
        dollarAmountTwo -= tempVar * DIME_VALUE;
        tempVar = (int) Math.floor(dollarAmountTwo / NICKEL_VALUE);
        numCoin += tempVar;
        dollarAmountTwo -= tempVar * NICKEL_VALUE;
        tempVar = (int) Math.floor(dollarAmountTwo / PENNY_VALUE);
        numCoin += tempVar;


        System.out.println("\nBILLS : " + numBill);
        System.out.println("COINS : " + numCoin);
        

        /*
         * Exercise 4.
         * 
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */


        
        /*
         * Exercise 5.
         * 
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
        

        
        /*
         * Exercise 6.
         * 
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
        


        /*
         * Exercise 7.
         * 
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
        

        
        /*
         * Exercise 8.
         * 
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */
        

        
        /*
         * Exercise 9.
         * 
         * Given a string, reverse and print the first and second halves of that string.
         */
        

        
        /*
         * Exercise 10.
         * 
         * Given a first, middle, and last name, print the corresponding initials.
         */
        

        
        in.close();
    }
}