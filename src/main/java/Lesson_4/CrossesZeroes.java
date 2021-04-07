package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class CrossesZeroes {

    // Предположение: человек ходит Х, компьютер - наоборот

    // Поле
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    // Константы-символы
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';

    public static final Scanner scanner = new Scanner (System.in);
    public static final Random random = new Random ();

    /**
     * Создать игровое полпе и заполнить его пустыми точками
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        // нумерация столбцов
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            // вывод номера строки
            System.out.print((i+1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map [i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * считать 2 числа, установить значение Х
     */
    public static void humanTurn () {
        int x, y;
        do {
            System.out.println("Введите координаты кода в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid (x,y));
        map[x][y] = DOT_X;
    }

    // ход компьютера
    public static void aiTurn () {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x,y));
        System.out.printf ("Искуственный интеллект ходит: : %d %d", x+1, y+1);
        System.out.println();
        map [x][y] = DOT_0;
    }

    /**
     * Проверка валидности введенных чисел, чтобы они попадали в поле
     * @param x < 0 && x >= SIZE
     * @param y < 0 && x >= SIZE
     * @return true/false
     */
    public static boolean isCellValid (int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        // пустое ли поле
        // 1 вариант проверки
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        // 2 вариант if (map[x][y] == DOT_X || map[x][y] == DOT_0) {return false;}
        return false;
    }

    /**
     * Наивная реализация для поля 3
     * @param dot это X или 0
     * @return победа или не до конца
     */
    public static boolean checkWin (char dot) {
        // проверка строк
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][0] == dot && map[i][1] == dot && map[i][2] == dot) {
                    return true;
                }
                // проверка столбцов
                if (map[0][j] == dot && map[1][j] == dot && map[2][j] == dot) {
                    return true;
                }
                // проверка диагоналей
                if (map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) {
                    return true;
                }
                if (map[2][0] == dot && map[1][1] == dot && map[0][2] == dot) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Проверяет, что поле заполнено
     * @return
     */
    public static boolean isFull () {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) ;
                return false;
            }
        }
        return true;
    }

    public static void play () {
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Выиграл человек");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Кожаный мешок, я победил!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void main (String[]args) {
        initMap();
        printMap ();
        play();
    }

}