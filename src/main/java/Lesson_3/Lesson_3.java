package Lesson_3;

import java.util.Arrays;

public class Lesson_3 {

    private static Object returnArray;

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        findMaxAndMin();
        System.out.println (checkBalance());
        displacementArr ();
    }


    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        // изменить 1 на 0, а 0 на 1
        for (int i = 0; i < arr.length; i ++)
            if (arr[i] <= 0) {
                arr[i] = 1; }
            else { arr [i] = 0;
                 }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * задать целочисленный массив длиной 100. заполнить значениями от 1 до 100 с помощью цикла
     */
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * задать массив. числа, которые меньше 6, умножить на 2
     */

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2; }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * задать квадратный двумерный целочисленный массив, заполнить диагональ единицами
     */
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        int index = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = index;
                } }
            System.out.println(Arrays.toString(arr[i]));
        }
    }


    public static int[] returnArray (int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    /**
     * задать одномерный массив и найти в нем min, max
     */
    public static void findMaxAndMin() {
        int[] arr = {4, 15, -7, 9, 2};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } if (arr[i] > max) {
                max = arr[i]; }
        } System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    /**
     * задать массив, вернуть true, если суммы правой и левой части массива равны
     */
    public static boolean checkBalance () {
        int [] array = {2, 4, 1, 1, 2, 5, 0, 1}; {
            int  sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i]; }
            int sum1 = 0;
            for (int i = 0; i < array.length/2; i ++) {
                sum1 += array[i]; }
            int sum2 = 0;
            sum2 = sum - sum1;
            if (sum1 == sum2) {
                return true;
            } else {
                return false;}
        }
    }


    /**
     * задать массив, циклично сместить элементы на n
     */
    public static void displacementArr () {
        int[] arr = {5,7,4,0}; {
            int temp1 = arr[arr.length-1];
            for (int i = arr.length - 1; i > 0; i--) {
                int temp2 = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp2;
            } System.out.println (Arrays.toString(arr));
        }
    } }
















