package Lesson_2;

import java.util.Scanner;

public class Lesson_2 {

    public static void main(String[] args) {
        System.out.println (within10and20(3,4)) ;
        isPositiveOrNegative ();
        System.out.println (isNegative ());
        printWordNTimes ("", 7);
        System.out.println(intercalaryYear());
    }

    /**
     * Считает сумму х1 и х2, которая входит/нет в диапозон 10-20
     * @return true/false в зависимости от диапозона
     */
    public static boolean within10and20 (int x1, int x2) {
        // можно вынести за пределы метода int x1 = 4;
        // данные будут подаваться на входе в метод, а не внутри него int x2 = 5;
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * подать целое число и проверить какое оно: положительное/отрицательное
     */
    public static void isPositiveOrNegative () {
        int x = 2;
        if (x >= 0) {
            System.out.println ("число положительное");
        } else {
            System.out.println ("число отрицательное");
        }
    }


    /**
     * подать целое число, проверить какое оно: отрицательное/положительное
     * @return true - отрицательное, false - положительное
     */
    public static boolean isNegative () {
        int x = -3;
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void printWordNTimes (String word, int times) {
        for (times = 0; times < 6; times++) {
            System.out.println("Hello");
        }
    }

    // помогает считывать данные из консоли
    public static Scanner scanner = new Scanner(System.in);

    /**
     * подать год, проверить: каждый 4й год и каждый 400й - високосные, каждый 100й - не високосный
     * @return true - високосный, false - не високосный
     */
    public static boolean intercalaryYear() {
        System.out.println("Введите год");
        int input_number = scanner.nextInt();
        if (input_number % 4 == 0 && input_number % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    }
