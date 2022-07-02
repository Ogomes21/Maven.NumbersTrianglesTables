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
        String Even = "";

        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                Even += Integer.toString(i);
            }
        }

        return Even;
    }


    public static String getOddNumbers(int start, int stop) {
        String Odd = "";

        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                Odd += Integer.toString(i);
            }
        }

        return Odd;
    }

    //Two integers, start, and stop,
// Return String concatenation of all values squared between start up to and not including stop
    public static String getSquareNumbers(int start, int stop, int step) {
        String squared = "";

        for (int i = start; i < stop; i += step) {
            squared += Integer.toString(i * i);

        }
        //return squared String
        return squared;
    }

    //given an integer, stop
    //concatenate all integers b/t 0 up to stop (not including stop)
    //return String concatenation

    public static String getRange (int stop) {
        String out = "";
        for (int i = 0; i < stop; i++) {
                out += i;
            }
            return out;
        }

        public static String getRange ( int start, int stop){
        String out = "";

        for (int i = start; i < stop; i++) {
            out += i;
        }

        return out;
        }


    public static String getRange(int start, int stop, int step) {
    String out = "";

        for (int i = start; i < stop; i+=step) {
            out += i;
        }
        return out; }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String out = "";

        for (int i = start; i < stop; i += step) {
            int value = (int)Math.pow(i, exponent);
            out += Integer.toString(value);
        }
        return out;
    }
}