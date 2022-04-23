package oop;

import java.util.Arrays;

public class DataType {
    public static void main(String[] args) {
        showDataNumber();
        showDataArray();
    }

    public static String typeof(Object data) {
        return ((Object)data).getClass().getSimpleName();
    }

    public static void showDataNumber() {
        // Integer Number
        byte dataByte = 0; // -128 ~ 127 (1 byte)
        short dataShort = 0; // -32.768 ~ 32.767 (2 bytes)
        int dataInt = 0; // -2.147.483.648 ~ 2.147.483.647 (4 bytes)
        long dataLong = 0L; // -9.223.372.036.854.775.808 ~ 9.223.372.036.854.775.807 (8 bytes)

        // Floating Point Number
        float dataFloat = 0.0F; // 4 bytes
        double dataDouble = 0.0; // 8 bytes

        // Widening Casting (Automates)
        // byte -> short -> int -> long -> float -> double
        short byteToShort = dataByte;
        int shortToInt = dataShort;
        System.out.println(typeof(byteToShort));
        System.out.println(typeof(shortToInt));

        // Narrowing Casting (Manual)
        // double -> float || long -> int || char -> short
        byte shortToByte = (byte) dataShort;
        short intToShort = (short) dataInt;
        System.out.println(typeof(shortToByte));
        System.out.println(typeof(intToShort));
    }

    public static void showDataArray() {
        // static list data (jumlah index tidak bisa berubah)
        int[] arrayInt = new int[]{
                1, 2, 3
        };
        // array 2 dimension
        String[][] arrayString = new String[][]{
                {"Dicky", "Julian", "Pratama"},
                {"Masrha", "Lenathea", "Lavia"}
        };
        arrayInt[1] = 1;
        arrayInt[2] = 2;
        // arrayInt[3] = 3; => index is out of bound

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(arrayString[0][0]);
    }
}
