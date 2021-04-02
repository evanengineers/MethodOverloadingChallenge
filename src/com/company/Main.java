package com.company;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(24);//worked

        calcFeetAndInchesToCentimeters(48);

        calcFeetAndInchesToCentimeters(8,4);

        calcFeetAndInchesToCentimeters(157);

        calcFeetAndInchesToCentimeters(-10);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        double myFeetToCentimeters = (feet * 12) * 2.54;
        double inchesToCentimeters =  inches * 2.54;
        double myCentimeters = myFeetToCentimeters + inchesToCentimeters;

        if ((feet < 0) || (inches < 0 || inches >12)) {
            System.out.println("Invalid parameter");
            return -1;
        }else
            //if both are valid then calculate how many centimeters comprise the feet and inches passed to the method
            //and return the value.
            System.out.println(feet +" feet and "+ inches +" inches is "+ myCentimeters +" centimeters.");
        return myCentimeters;
    }
    
    public static double calcFeetAndInchesToCentimeters(double inches) {
        double remainder = (int) inches % 12;
        double howManyFeet = (int) inches / 12;

        if (inches < 0) {
            System.out.println("Invalid parameter");
            return  -1;
        }else
        return calcFeetAndInchesToCentimeters(howManyFeet, remainder);

    }
}
