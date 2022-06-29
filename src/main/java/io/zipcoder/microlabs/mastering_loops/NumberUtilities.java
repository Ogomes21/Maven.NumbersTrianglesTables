package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    //two integers
    //start & stop
    //return a string concatenation of all even numbers between start & stop
    /*
Given
int start = 5;
int stop = 20;

When
String outcome = NumberUtilities.getOddNumbers(min, max);

Then
System.out.println(outcome);
     */
    public static String getEvenNumbers(int start, int stop) {
        String Odd = "";

        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                Odd += i;
            }
        }

        return Odd;
    }


    public static String getOddNumbers(int start, int stop) {
        String Even = "";

        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                Even += i;
            }
        }

        return Even;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        int i = 0;

        for (int i = start; i < stop; int step^=5);

        return String;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}