package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    //Generate a String representation of a multiplication table whose dimensions are 4 by 4
    public static String getSmallMultiplicationTable() {
        String result = "";
        int a;
        int b;

        for (a = 1; a <= 5; ++a) {
            for (b = 1; b <= 5; ++b) {
                System.out.print(a * b + " ");
            }
            System.out.println();
        }

        return result;
    }


    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
