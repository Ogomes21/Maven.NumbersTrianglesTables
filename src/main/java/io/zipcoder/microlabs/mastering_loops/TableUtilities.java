package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    //Generate a String representation of a multiplication table whose dimensions are 4 by 4
    public static String getSmallMultiplicationTable() {
//        String result = "";
//        int a;
//        int b;
//
//        for (a = 1; a <= 5; ++a) {
//            for (b = 1; b <= 5; ++b) {
//               result += System.out.printf("%4d |", a * b );
//            }
//               System.out.println("");
//        }
//        return result += "\n";
//    }
        return getMultiplicationTable(5);
    }


    public static String getLargeMultiplicationTable() {
//        String result = "";
//        int a;
//        int b;
//
//        for (a = 1; a <= 10; ++a) {
//            for (b = 1; b <= 10; ++b) {
//                result += System.out.printf("%4d |", a * b );
//            }
//            System.out.println("");
//        }
//        return result += "\n";
//    }
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
//        String result = "";
//        int a;
//        int b;
//
//        for (a = 1; a <= 20; ++a) {
//            for (b = 1; b <= 20; ++b) {
//                result += System.out.printf("%4d |", a * b );
//            }
//            System.out.println("");
//        }
//        return result += "\n";
//    }
        StringBuilder s = new StringBuilder();

            for (int i = 1; i <= tableSize; i++) {
                for (int j = 1; j <= tableSize; j++) {
                    s.append(String.format("%3d |", i * j));
                }
                s.append("\n");
            }
            return s.toString();
        }
    }
