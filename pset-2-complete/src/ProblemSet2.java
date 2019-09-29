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

        // /*
        //  * Exercise 1.
        //  * 
        //  * Prompt the user to enter the following information (in order): first name, last
        //  * name, grade, age, and hometown.
        //  */
        
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

        // /*
        //  * Exercise 2.
        //  * 
        //  * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
        //  * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
        //  */
        
        // final double DOLLAR_VALUE = 1.00;
        // final double QUARTER_VALUE = 0.25;
        // final double DIME_VALUE = 0.10;
        // final double NICKEL_VALUE = 0.05;
        // final double PENNY_VALUE = 0.01;

        // System.out.print("\nEnter a dollar amount: ");
        // double dollarAmount = in.nextDouble();

        // int numDollar = (int) Math.floor(dollarAmount / DOLLAR_VALUE);
        // System.out.println("\nDOLLARS  : " + numDollar);
        // dollarAmount -= ((double) numDollar) * DOLLAR_VALUE;

        // int numQuarter = (int) Math.floor(dollarAmount / QUARTER_VALUE);
        // System.out.println("QUARTERS : " + numQuarter);
        // dollarAmount -= ((double) numQuarter) * QUARTER_VALUE;

        // int numDime = (int) Math.floor(dollarAmount / DIME_VALUE);
        // System.out.println("DIMES    : " + numDime);
        // dollarAmount -= ((double) numDime) * DIME_VALUE;

        // int numNickel = (int) Math.floor(dollarAmount / NICKEL_VALUE);
        // System.out.println("NICKELS  : " + numNickel);
        // dollarAmount -= ((double) numNickel) * NICKEL_VALUE;

        // int numPenny = (int) Math.floor(dollarAmount / PENNY_VALUE);
        // System.out.println("PENNIES  : " + numPenny);
        

        // /*
        //  * Exercise 3.
        //  * 
        //  * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
        //  * bills and coins needed to produce this amount.
        //  */

        // final double TEN_DOLLAR_VALUE = 10.00;
        // final double FIVE_DOLLAR_VALUE = 5.00;
        
        // System.out.print("\nEnter a dollar amount: ");
        // double dollarAmountTwo = in.nextDouble();

        // int tempVar;
        // tempVar = (int) Math.floor(dollarAmountTwo / TEN_DOLLAR_VALUE);
        // int numBill = tempVar;
        // dollarAmountTwo -= tempVar * TEN_DOLLAR_VALUE;
        // tempVar = (int) Math.floor(dollarAmountTwo / FIVE_DOLLAR_VALUE);
        // numBill += tempVar;
        // dollarAmountTwo -= tempVar * FIVE_DOLLAR_VALUE;
        // tempVar = (int) Math.floor(dollarAmountTwo / DOLLAR_VALUE);
        // numBill += tempVar;
        // dollarAmountTwo -= tempVar * DOLLAR_VALUE;

        // tempVar = (int) Math.floor(dollarAmountTwo / QUARTER_VALUE);
        // int numCoin = tempVar;
        // dollarAmountTwo -= tempVar * QUARTER_VALUE;
        // tempVar = (int) Math.floor(dollarAmountTwo / DIME_VALUE);
        // numCoin += tempVar;
        // dollarAmountTwo -= tempVar * DIME_VALUE;
        // tempVar = (int) Math.floor(dollarAmountTwo / NICKEL_VALUE);
        // numCoin += tempVar;
        // dollarAmountTwo -= tempVar * NICKEL_VALUE;
        // tempVar = (int) Math.floor(dollarAmountTwo / PENNY_VALUE);
        // numCoin += tempVar;


        // System.out.println("\nBILLS : " + numBill);
        // System.out.println("COINS : " + numCoin);
        

        // /*
        //  * Exercise 4.
        //  * 
        //  * Given a number of inches, print the equivalent number of miles, yards, feet,
        //  * and inches.
        //  */

        // final int INCHES_IN_MILE = 63360;
        // final int INCHES_IN_YARD = 36;
        // final int INCHES_IN_FOOT = 12;

        // System.out.print("\nEnter a number of inches: ");
        // int numOfInches = in.nextInt();
        // int miles  = (int) Math.floor((double) numOfInches / INCHES_IN_MILE);
        // numOfInches -= miles * INCHES_IN_MILE;
        // int yards  = (int) Math.floor((double) numOfInches / INCHES_IN_YARD);
        // numOfInches -= yards * INCHES_IN_YARD;
        // int feet   = (int) Math.floor((double) numOfInches / INCHES_IN_FOOT);
        // numOfInches -= feet  * INCHES_IN_FOOT;
        // int inches = numOfInches;

        // System.out.printf("\nMILES  : %d", miles);
        // System.out.printf("\nYARDS  : %d", yards);
        // System.out.printf("\nFEET   : %d", feet);
        // System.out.printf("\nINCHES : %d\n", inches);

        
        // /*
        //  * Exercise 5.
        //  * 
        //  * Given a number of centimeters, print the equivalent number of kilometers,
        //  * meters, and centimeters.
        //  */
        
        // final int CENTIMETERS_IN_KILOMETER = 100000;
        // final int CENTIMETERS_IN_METER = 100;

        // System.out.print("\nEnter a number of centimeters: ");
        // int numOfCentimeters = in.nextInt();

        // int kilometers = (int) Math.floor((double) numOfCentimeters / CENTIMETERS_IN_KILOMETER);
        // numOfCentimeters -= kilometers * CENTIMETERS_IN_KILOMETER;
        // int meters     = (int) Math.floor((double) numOfCentimeters / CENTIMETERS_IN_METER);
        // numOfCentimeters -= meters * CENTIMETERS_IN_METER;
        // int centimeters = numOfCentimeters;

        // System.out.printf("\nKILOMETERS  : %d", kilometers);
        // System.out.printf("\nMETERS      : %d", meters);
        // System.out.printf("\nCENTIMETERS : %d\n", centimeters);
        
        // /*
        //  * Exercise 6.
        //  * 
        //  * Given a diameter, print the area and circumference of the corresponding circle.
        //  */
        
        // System.out.print("\nEnter a diameter: ");
        // double diameter = in.nextDouble();
        // double radius = diameter / 2;

        // double circumference = diameter * Math.PI; 
        // double area = Math.pow(radius, 2) * Math.PI;
        // System.out.printf("\n\nAREA          : %.2f\n", area);
        // System.out.printf("CIRCUMFERENCE : %.2f\n", circumference);
        

        // /*
        //  * Exercise 7.
        //  * 
        //  * Given a length and width, print the area, perimeter, and diagonal of the
        //  * corresponding rectangle.
        //  */
        
        // System.out.print("\nEnter a length: ");
        // double length = in.nextDouble();
        // System.out.print("Enter a width: ");
        // double width = in.nextDouble();

        // double rectArea = length * width;
        // double rectPerimeter = (length * 2) + (width * 2);
        // double rectDiagonal = Math.hypot(length, width);

        // System.out.printf("\nAREA      : %.2f\n", rectArea);
        // System.out.printf("PERIMETER : %.2f\n", rectPerimeter);
        // System.out.printf("DIAGONAL  : %.2f\n", rectDiagonal);
        
        // /*
        //  * Exercise 8.
        //  * 
        //  * Given a side length, print the area and perimeter of the corresponding hexagon.
        //  */
        
        // System.out.print("\nEnter a side length: ");
        // double hexSide = in.nextDouble();

        // double hexArea = (3 * Math.pow(3, 1/2) * Math.pow(hexSide, 2)) / 2;
        // double hexPerimeter = hexSide * 6;

        // System.out.printf("\nAREA      : %.2f", hexArea);
        // System.out.printf("\nPERIMETER : %.2f\n", hexPerimeter);
        
        /*
         * Exercise 9.
         * 
         * Given a string, reverse and print the first and second halves of that string.
         */
        
        System.out.print("\nEnter a string: ");
        String reverseMe = in.nextLine();

        
        /*
         * Exercise 10.
         * 
         * Given a first, middle, and last name, print the corresponding initials.
         */
        

        
        in.close();
    }
}