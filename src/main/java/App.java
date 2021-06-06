//UCF COP3330 Summer 2021 Assignment 9 Solution
// *  Copyright 2021 Igli Spaho

//Sometimes you have to round up to the next number rather than follow standard rounding rules.
//
//Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.
//
//Example Output
//You will need to purchase 2 gallons of paint to cover 360 square feet.

//Remember, you can’t buy a partial gallon of paint. You must
//round up to the next whole gallon.
//
//Constraints
//Use a constant to hold the conversion rate.
//Ensure that you round up to the next whole number.


import java.util.Scanner;

public class App {
    public static void main (String[] args){
        final int CONVERSION = 350;
        Scanner in = new Scanner(System.in);
        System.out.print("What is the length? ");
        int length = in.nextInt();

        System.out.print("What is the Width? ");
        int width = in.nextInt();

        int area = length*width;
        int remaining = area/CONVERSION+1;


        System.out.print("You will need to purchase "+Math.ceil(remaining)+ " gallons of paint to cover "+area+ " square feet");

    }
}
