package Lesson_7;

import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

        Plates plates = new Plates(50);
        plates.info();

        Cat[] array = new Cat[3];
        array[0] = new Cat("Борис", 20, false);
        array[1] = new Cat("Рыжик", 15, false);
        array[2] = new Cat("Мурка", 17, false);

        for (int i=0; i< array.length; i++) {
            array[i].eat(plates);
        }

        for (int i=0; i< array.length; i++) {
            array[i].isSatiety();
        }

        plates.info();

        plates.addFoodToPlate();
    }
}


